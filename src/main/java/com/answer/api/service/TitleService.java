package com.answer.api.service;

import com.answer.api.entity.Title;

import java.util.List;

/**
 * @author YinJunjie
 * @date 2020-12-17 14:23
 */
public interface TitleService {

    /**
     * 获取所有副标题
     * @return
     */
    List<Title> findAll();

    /**
     * 获取副标题内题目状态
     * @param user_id
     * @param title_id
     * @return
     */
    boolean titleMode(Integer user_id,Integer title_id);
}
