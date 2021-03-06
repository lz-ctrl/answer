package com.answer.api.service;

import com.answer.api.codec.LayuiRespResult;
import com.answer.api.dto.AnswerDto;
import com.answer.api.entity.Answer;
import com.answer.api.entity.AnswerInformation;
import com.answer.api.entity.Title;
import com.answer.api.vo.AllCharacterVo;
import com.answer.api.vo.CompleteVo;

import java.util.List;

/**
 * @author yjj
 */

public interface AnswerService {

    /**
     *
     * @param id
     * @param answer
     * @return
     */
    Answer questionAnswering(int[] id, String[] answer);

    /**
     * 查询所有题目
     * @param page
     * @param size
     * @param titleId
     * @return
     */
    List<Answer> findAll(Integer page,Integer size,Integer titleId);

    /**
     * 分页查询
     * @param page
     * @param size
     * @return
     */
    LayuiRespResult page(Integer page, Integer size);

    /**
     * 根据id查询单个题目
     * @param id
     * @return
     */
    Answer get(Integer id);

    /**
     * 结算题目
     * @param list
     * @return
     */
    AnswerInformation complete(List<AnswerDto> list,Integer titleId,Integer userId);

    /**
     * 提交题目
     * @param userId
     * @return
     */
    CompleteVo submit(Integer userId);

    /**
     * 新增题目
     * @param answerDto
     * @return
     */
    Answer create(AnswerDto answerDto);

    /**
     * 删除题目
     * @param id
     * @return
     */
    Integer delete (Integer id);

    /**
     * 修改题目
     * @param answerDto
     * @return
     */
    Answer update (AnswerDto answerDto);

    /**
     * 查询所有性格类型
     * @return
     */
    AllCharacterVo findAllCharacterAnalysis();

    /**
     * 根据题目类型查询
     * @return
     */
    LayuiRespResult findAnswerType(Integer answerType,Integer page, Integer size);
}
