package com.answer.api.service;

import com.answer.api.entity.Title;
import com.answer.api.vo.TitleVo;


/**
 * @author YinJunjie
 * @date 2020-12-17 14:23
 */
public interface TitleService {

    /**
     * 获取所有副标题及其状态
     * @param user_id
     * @param title_id
     * @return
     */
    TitleVo findAll(Integer user_id, Integer title_id);

}
