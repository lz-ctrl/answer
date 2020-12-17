package com.answer.api.service.impl;

import com.answer.api.codec.RestCode;
import com.answer.api.dto.UserDto;
import com.answer.api.entity.User;
import com.answer.api.exception.ServiceException;
import com.answer.api.service.UserService;
import com.answer.api.utils.WxUtil;
import org.springframework.stereotype.Service;

/**
 * @author lz
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User userLogin(UserDto userDto) {
        if(userDto==null||userDto.getCode()==null){
            throw new ServiceException(RestCode.BAD_REQUEST_403, "code不能为空");
        }
        String openId= WxUtil.getOpenIdByCode(userDto.getCode());
        if(openId==null){
            throw new ServiceException(RestCode.BAD_REQUEST_403,"openId获取失败");
        }
        return null;
    }
}
