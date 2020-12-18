package com.answer.api.service.impl;

import com.answer.api.entity.AnswerInformation;
import com.answer.api.entity.Title;
import com.answer.api.mapper.AnswerInformationMapper;
import com.answer.api.mapper.TitleMapper;
import com.answer.api.service.TitleService;
import com.answer.api.vo.TitleVo;
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
     * 查询所有副标题及其状态
     */
    public TitleVo findAll(Integer user_id,Integer title_id) {
        //初始化Vo
        TitleVo titleVo = new TitleVo();
        //题目状态，默认0，未做，1已做
        int situation = 0;

        //获取所有副标题
        List<Title> list = titleMapper.selectList(new EntityWrapper<Title>());
        //获取副标题状态
        List<AnswerInformation> state = answerInformationMapper.selectList(
                new EntityWrapper<AnswerInformation>().eq("user_id", user_id).eq("title_id", title_id));
        if (state.get(0) != null){
            //副标题对应题目已做
            situation = 1;
        }

        list.forEach(title -> {
             titleVo.setContent(title.getContent());
             titleVo.setId(title.getId());
             titleVo.setTitle(title.getTitle());
        });

        //根据副标题ID获取题目数量
        int size = list.size();

        //设置题目数量
        titleVo.setNumber(size);

        //设置状态
        titleVo.setSituation(situation);
        //设置id


        return titleVo;
    }
}