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

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

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
    public TitleVo findAll(TitleDto titleDto) {
        //初始化Vo
        TitleVo titleVo = new TitleVo();
        //题目状态，默认0，未做，1已做
        //副标题1的状态
        AtomicInteger situation1 = new AtomicInteger();
        //副标题2的状态
        AtomicInteger situation2 = new AtomicInteger();
        //副标题3的状态
        AtomicInteger situation3 = new AtomicInteger();

        List<Answer> answerNumber = null;

        //初始化title
        Title title = new Title();

        //获取所有副标题
        List<Title> list = titleMapper.selectList(new EntityWrapper<Title>());

//        list.forEach(title -> {
//            title.setNumber1(situation1.get());
//            title.setNumber2(situation2.get());
//            title.setNumber3(situation3.get());
//
////             titleVo.setContent(title.getContent());
////             titleVo.setId(title.getId());
////             titleVo.setTitle(title.getTitle());
////             titleVo.setSituation1();
//        });

        //所有标题及其内容
        titleVo.setTitleList(list);

        //获取副标题状态
        List<AnswerInformation> userInfo = answerInformationMapper.selectList(new EntityWrapper<AnswerInformation>().eq("user_Id", titleDto.getUser_id()));
        userInfo.forEach(info ->{
            //匹配修改副标题状态
            switch (info.getTitleId()){
                case 1:
                    title.setNumber1(1);
                    System.out.println(">>>>>>>>>>>"+title.setNumber1(1));
                    break;
                case 2:
                    title.setNumber2(1);
                    break;
                default:
                    title.setNumber3(1);
            }
        });



        for (int i = 1; i < 4; i++) {
            //获取所有题号
            answerNumber = answerMapper.selectList(new EntityWrapper<Answer>().eq("title_id", i));
        }

        //设置题目数量
        title.setNumber1(answerNumber.size());
        title.setNumber2(answerNumber.size());
        title.setNumber3(answerNumber.size());

        return titleVo;
    }
}