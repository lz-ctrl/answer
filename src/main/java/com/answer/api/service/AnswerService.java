package com.answer.api.service;

import com.answer.api.entity.Answer;

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
    Answer questionAnswering(int[] id, String[] answer);
}
