package com.answer.api.service;

import com.answer.api.dto.UserDto;
import com.answer.api.entity.User;

/**
 * @author lz
 */
public interface UserService {

    /**
     * 用户登录注册
     * @param userDto
     * @return
     */
    User userLogin(UserDto userDto);

    /**
     * openId获取用户信息
     * @param openId
     * @return
     */
    User findUserByOpenId(String openId);
}
