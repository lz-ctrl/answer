package com.answer.api.service.impl;

import com.answer.api.dto.TitleDto;
import com.answer.api.entity.Answer;
import com.answer.api.entity.AnswerInformation;
import com.answer.api.entity.Title;
import com.answer.api.mapper.AnswerInformationMapper;
import com.answer.api.mapper.AnswerMapper;
import com.answer.api.mapper.TitleMapper;
import com.answer.api.service.TitleService;
import com.answer.api.vo.TitleVo;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Autowired
    private AnswerMapper answerMapper;


    @Override
    /**
     * 查询所有副标题及其状态
     */
    public List<TitleVo> findAll(TitleDto titleDto) {
        //初始化Vo
        List<TitleVo> titleVos=new ArrayList<>();
        //获取所有副标题
        List<Title> list = titleMapper.selectList(new EntityWrapper<>());
        list.forEach(title -> {
            TitleVo titleVo = new TitleVo();
            //查询记录表，获取用户记录
            List<AnswerInformation> userInfo = answerInformationMapper
                    .selectList(new EntityWrapper<AnswerInformation>()
                      .eq("user_id", titleDto.getUser_id())
                      .eq("title_id",title.getId()));
            if(userInfo.size()<=0){
                titleVo.setSituation(0);
            }else{
                titleVo.setSituation(1);
            }
           Integer num = answerMapper.selectList(new EntityWrapper<Answer>().eq("title_id", title.getId())).size();
            titleVo.setNumber(num);
            titleVo.setContent(title.getContent());
            titleVo.setTitle(title.getTitle());
            titleVo.setId(title.getId());
            titleVos.add(titleVo);
        });
        return titleVos;
    }
}