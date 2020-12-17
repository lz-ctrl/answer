package com.answer.api.service.impl;

import com.answer.api.entity.Title;
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


    /**
     * 查询所有副标题
     */
    @Override
    public List<Title> findAll() {
        return titleMapper.selectList(new EntityWrapper<Title>());
    }
}