package com.answer.api.mapper;

import com.answer.api.entity.Answer;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;

public interface AnswerMapper extends BaseMapper<Answer> {

    /**
     * id数组查询
     * @param list
     * @return
     */
    List<Answer> findByIds(List<Integer> list);


}