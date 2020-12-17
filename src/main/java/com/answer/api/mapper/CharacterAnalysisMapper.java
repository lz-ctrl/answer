package com.answer.api.mapper;

import com.answer.api.entity.CharacterAnalysis;
import com.answer.api.entity.CharacterAnalysisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CharacterAnalysisMapper {
    int countByExample(CharacterAnalysisExample example);

    int deleteByExample(CharacterAnalysisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CharacterAnalysis record);

    int insertSelective(CharacterAnalysis record);

    List<CharacterAnalysis> selectByExample(CharacterAnalysisExample example);

    CharacterAnalysis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CharacterAnalysis record, @Param("example") CharacterAnalysisExample example);

    int updateByExample(@Param("record") CharacterAnalysis record, @Param("example") CharacterAnalysisExample example);

    int updateByPrimaryKeySelective(CharacterAnalysis record);

    int updateByPrimaryKey(CharacterAnalysis record);
}