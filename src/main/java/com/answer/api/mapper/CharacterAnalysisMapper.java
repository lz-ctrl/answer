package com.answer.api.mapper;

import com.answer.api.entity.CharacterAnalysis;
import com.answer.api.entity.CharacterAnalysisExample;
import com.answer.api.entity.CharacterAnalysisWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CharacterAnalysisMapper {
    int countByExample(CharacterAnalysisExample example);

    int deleteByExample(CharacterAnalysisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CharacterAnalysisWithBLOBs record);

    int insertSelective(CharacterAnalysisWithBLOBs record);

    List<CharacterAnalysisWithBLOBs> selectByExampleWithBLOBs(CharacterAnalysisExample example);

    List<CharacterAnalysis> selectByExample(CharacterAnalysisExample example);

    CharacterAnalysisWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CharacterAnalysisWithBLOBs record, @Param("example") CharacterAnalysisExample example);

    int updateByExampleWithBLOBs(@Param("record") CharacterAnalysisWithBLOBs record, @Param("example") CharacterAnalysisExample example);

    int updateByExample(@Param("record") CharacterAnalysis record, @Param("example") CharacterAnalysisExample example);

    int updateByPrimaryKeySelective(CharacterAnalysisWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CharacterAnalysisWithBLOBs record);

    int updateByPrimaryKey(CharacterAnalysis record);
}