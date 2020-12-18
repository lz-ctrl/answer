package com.answer.api.service.impl;

import com.answer.api.entity.AnswerInformation;
import com.answer.api.entity.Title;
import com.answer.api.mapper.AnswerInformationMapper;
import com.answer.api.mapper.TitleMapper;
import com.answer.api.service.TitleService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YinJunjie
 * @date 2020-12-17 14:31
 */
@Service
public class TitleServiceImpl implements TitleService {

    @Autowired
    private TitleMapper titleMapper;

    @Autowired
    private AnswerInformationMapper answerInformationMapper;


    @Override
    /**
     * 查询所有副标题
     */
    public List<Title> findAll() {
        return titleMapper.selectList(new EntityWrapper<Title>());
    }

    @Override
    /**
     * 获取副标题状态
     */
    public boolean titleMode(Integer user_id,Integer title_id) {
        List<AnswerInformation> list = answerInformationMapper.selectList(
                new EntityWrapper<AnswerInformation>().eq("user_id", user_id).eq("title_id", title_id));
        System.out.println(list);
        if (list.get(0)!=null){
            return true;
        }
        return false;
    }
}