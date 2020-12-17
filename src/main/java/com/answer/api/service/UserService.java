package com.answer.api.service;

import com.answer.api.dto.UserDto;
import com.answer.api.entity.User;

/**
 * @author lz
 */
public interface UserService {

    User userLogin(UserDto userDto);


}
