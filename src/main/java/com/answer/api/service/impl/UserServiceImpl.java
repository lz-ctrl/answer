package com.answer.api.service.impl;

import com.answer.api.codec.RestCode;
import com.answer.api.dto.UserDto;
import com.answer.api.entity.User;
import com.answer.api.exception.ServiceException;
import com.answer.api.mapper.UserMapper;
import com.answer.api.service.UserService;
import com.answer.api.utils.BeanUtil;
import com.answer.api.utils.ConstantUtils;
import com.answer.api.utils.JwtUtil;
import com.answer.api.utils.WxUtil;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.LinkedList;

/**
 * @author lz
 */
@Service
public class UserServiceImpl implements UserService {

    private final PasswordEncoder passwordEncoder;
    private final UserMapper userMapper;

    public UserServiceImpl(PasswordEncoder passwordEncoder, UserMapper userMapper) {
        this.passwordEncoder = passwordEncoder;
        this.userMapper = userMapper;
    }

    @Override
    public User userLogin(UserDto userDto) {
        if(userDto==null||userDto.getCode()==null){
            throw new ServiceException(RestCode.BAD_REQUEST_403, "code不能为空");
        }
        String openId= WxUtil.getOpenIdByCode(userDto.getCode());
        if(openId==null){
            throw new ServiceException(RestCode.BAD_REQUEST_403,"openId获取失败");
        }
        User user=new User();
        BeanUtil.copyProperties(userDto, user);
        user.setOpenId(openId);
        if(userMapper.selectList(new EntityWrapper<User>().eq("open_id", user.getOpenId())).size()<=0){
            //代表用户不存在，添加用户
            //小程序不用密码登录，设置默认密码为123
            user.setPassword(passwordEncoder.encode("123"));
            userMapper.insert(user);
            return user;
        }else{
            //代表用户存在，返回用户
            user=userMapper.selectList(new EntityWrapper<User>().eq("open_id",user.getOpenId())).get(0);
        }
        //生成token返回给前端
        LinkedList<GrantedAuthority> linkedList = new LinkedList<>();
        Date expireDate = new Date(System.currentTimeMillis() + ConstantUtils.TOKEN_EXPIRE_TIME);
        linkedList.add(new SimpleGrantedAuthority("ROLE_USER"));
        String token = ConstantUtils.TOKEN_PREFIX + JwtUtil.sign(user.getId(), user.getOpenId(),
                                                                 user.getPassword(), expireDate, linkedList);
        user.setToken(token);
        user.setTokenTime(expireDate);
        return user;
    }

    @Override
    public User findUserByOpenId(String openId) {
        return null;
    }
}
