package com.answer.api.service;

import com.answer.api.dto.TitleDto;
import com.answer.api.vo.TitleVo;


/**
 * @author YinJunjie
 * @date 2020-12-17 14:23
 */
public interface TitleService {

    /**
     * 获取所有副标题及其状态
     * @param tItleDto
     * @return
     */
    TitleVo findAll(TitleDto tItleDto);

}
