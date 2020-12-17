package com.answer.api.controller;

import com.answer.api.codec.RestApiResult;
import com.answer.api.dto.UserDto;
import com.answer.api.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lz
 */
@Api(tags = "用户接口")
@RestController
@RequestMapping("answer")
public class UserController {

    @Autowired
    UserService userService;

    @ApiOperation(value = "用户登录注册", notes = "用户不存在则注册(code必传)")
    @PostMapping("/login")
    public RestApiResult userLogin(@RequestBody @Validated UserDto userDto){
        return null;
    }
}
