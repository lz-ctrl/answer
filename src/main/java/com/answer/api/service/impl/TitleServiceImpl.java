package com.answer.api.service.impl;

import com.answer.api.codec.RestCode;
import com.answer.api.dto.TitleDto;
import com.answer.api.entity.Answer;
import com.answer.api.entity.AnswerInformation;
import com.answer.api.entity.Title;
import com.answer.api.exception.ServiceException;
import com.answer.api.mapper.AnswerInformationMapper;
import com.answer.api.mapper.AnswerMapper;
import com.answer.api.mapper.TitleMapper;
import com.answer.api.service.TitleService;
import com.answer.api.utils.BeanUtil;
import com.answer.api.vo.TitleVo;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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


    /**
     * 查询所有副标题及其状态
     * @param userId
     * @return
     */
    @Override
    public List<TitleVo> findAll(Integer userId) {
        //初始化Vo
        List<TitleVo> titleVos=new ArrayList<>();
        //获取所有副标题
        List<Title> list = titleMapper.selectList(new EntityWrapper<>());
        list.forEach(title -> {
            TitleVo titleVo = new TitleVo();
            List<AnswerInformation> userInfo = answerInformationMapper
                    .selectList(new EntityWrapper<AnswerInformation>()
                      .eq("user_id", userId)
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
            titleVos.add(titleVo);
        });
        return titleVos;
    }


    /**
     * 查询所有副标题
     * @return
     */
    @Override
    public List<Title> findAllTitle() {
        return titleMapper.selectList(new EntityWrapper<>());
    }

    /**
     * 修改副标题
     * @param titleDto
     * @return
     */
    @Override
    public Title update(TitleDto titleDto) {
        if (titleDto.getId() == null){
            throw new ServiceException(RestCode.BAD_REQUEST_403);
        }
        Title title = new Title();
        BeanUtil.copyProperties(titleDto,title);
        titleMapper.updateById(title);
        return title;
    }

    /**
     * 增加副标题
     * @param titleDto
     * @return
     */
    @Override
    public Title insert(TitleDto titleDto) {
        if (titleDto.getId() == null) {
            throw new ServiceException(RestCode.BAD_REQUEST_403);
        }
        //初始化entity
        Title title = new Title();
        //entity赋值
        BeanUtil.copyProperties(titleDto,title);
        //执行添加
        titleMapper.insert(title);
        return title;
    }

    /**
     * 删除副标题
     * @param id
     * @return
     */
    @Override
    public Integer delete(Integer id) {
        if (id == 0){
            throw new ServiceException(RestCode.BAD_REQUEST_403);
        }
        //返回并执行删除
        return titleMapper.deleteById(id);
    }
}