package com.answer.api.service;

import com.answer.api.entity.Answer;
import com.answer.api.vo.AnswerVo;

/**
 * @author yjj
 */

public interface AnswerService {

    /**
     *
     * @param id
     * @param answer
     * @return
     * 获取用户答题的题号和选项进行匹配
     */
    AnswerVo questionAnswering(int[] id, String[] answer);
}
