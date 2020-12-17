package com.answer.api.mapper;

import com.answer.api.entity.Answer;
import com.answer.api.entity.AnswerExample;
import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface AnswerMapper extends BaseMapper<Answer> {
    int countByExample(AnswerExample example);

    int deleteByExample(AnswerExample example);

    int deleteByPrimaryKey(Integer id);

    //int insert(Answer record);

    int insertSelective(Answer record);

    List<Answer> selectByExample(AnswerExample example);

    /**
     * id数组查询
     * @param list
     * @return
     */
    List<Answer> findByIds(List<Integer> list);

    Answer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Answer record, @Param("example") AnswerExample example);

    int updateByExample(@Param("record") Answer record, @Param("example") AnswerExample example);

    int updateByPrimaryKeySelective(Answer record);

    int updateByPrimaryKey(Answer record);
}