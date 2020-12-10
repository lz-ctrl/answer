package com.answer.api.service;

import com.answer.api.entity.Answer;

/**
 * @author yjj
 */

public interface AnswerService {

    //答题方法
    Answer questionAnswering(int[] id, String[] answer);
}
