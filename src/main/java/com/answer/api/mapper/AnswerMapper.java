package com.answer.api.mapper;

import com.answer.api.entity.Answer;
import com.answer.api.entity.AnswerExample;
import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface AnswerMapper extends BaseMapper<Answer> {

    /**
     * id数组查询
     * @param list
     * @return
     */
    List<Answer> findByIds(List<Integer> list);


}