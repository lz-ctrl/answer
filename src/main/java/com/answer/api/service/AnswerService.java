package com.answer.api.service;

import com.answer.api.dto.AnswerDto;
import com.answer.api.entity.Answer;
import com.answer.api.entity.AnswerInformation;
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
     * 查询所以答题
     * @return
     */
    List<Answer> findAll(Integer page,Integer size);

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
}
