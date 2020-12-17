package com.answer.api.mapper;

import com.answer.api.entity.AnswerInformation;
import com.answer.api.entity.AnswerInformationExample;
import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface AnswerInformationMapper extends BaseMapper<CharacterAnalysis> {
    int countByExample(AnswerInformationExample example);

    int deleteByExample(AnswerInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnswerInformation record);

    int insertSelective(AnswerInformation record);

    List<AnswerInformation> selectByExample(AnswerInformationExample example);

    AnswerInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnswerInformation record, @Param("example") AnswerInformationExample example);

    int updateByExample(@Param("record") AnswerInformation record, @Param("example") AnswerInformationExample example);

    int updateByPrimaryKeySelective(AnswerInformation record);

    int updateByPrimaryKey(AnswerInformation record);
}