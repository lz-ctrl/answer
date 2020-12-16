package com.answer.api.service.impl;

import com.answer.api.entity.AnswerInformation;
import com.answer.api.mapper.AnswerInformationMapper;
import com.answer.api.service.AnswerInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author YinJunjie
 *用户答题的分数
 */
@Service
public class AnswerInformationServiceImpl implements AnswerInformationService {

    @Autowired
    private AnswerInformationMapper answerInformationMapper;

    /**
     *
     * @param id
     * @return
     */
    @Override
    public int getPoints(int id) {
        AnswerInformation information = answerInformationMapper.selectByPrimaryKey(id);
        //如果获取到信息
        if (information != null){
            //获取分数并返回
            return information.getScore();
        }
        //返回0
        return 0;
    }
}
