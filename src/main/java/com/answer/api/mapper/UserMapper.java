package com.answer.api.mapper;

import com.answer.api.entity.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * @author lz
 */
public interface UserMapper extends BaseMapper<User> {

    /**
     * 根据openId查询用户
     * @param openId
     * @return
     */
    User findUserByOpenId(String openId);
}
