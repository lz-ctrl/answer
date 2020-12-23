package com.answer.api.service;

import com.answer.api.dto.TitleDto;
import com.answer.api.entity.Title;
import com.answer.api.vo.TitleVo;

import java.util.List;


/**
 * @author YinJunjie
 * @date 2020-12-17 14:23
 */
public interface TitleService {

    /**
     * 获取所有副标题及其状态
     * @param userId
     * @return
     */
    List<TitleVo> findAll(Integer userId);

    /**
     * 查询所有副标题
     * @return
     */
    List<Title> findAllTitle();
}
