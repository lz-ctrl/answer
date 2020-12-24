package com.answer.api.service;

import com.answer.api.dto.OptionDto;
import com.answer.api.entity.Option;

/**
 * @author lz
 */
public interface OptionService {

    /**
     * 根据id查询
     * @param id
     * @return
     */
     Option get(Integer id);
    /**
     * 删除
     * @param id
     * @return
     */
    Integer del(Integer id);
    /**
     * 修改
     * @param optionDto
     * @return
     */
    Option update(OptionDto optionDto);
    /**
     * 新增
     * @param optionDto
     * @return
     */
    Option create(OptionDto optionDto);
}
