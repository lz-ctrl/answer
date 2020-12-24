package com.answer.api.service.impl;

import com.answer.api.codec.RestCode;
import com.answer.api.dto.OptionDto;
import com.answer.api.entity.Option;
import com.answer.api.exception.ServiceException;
import com.answer.api.mapper.OptionMapper;
import com.answer.api.service.OptionService;
import com.answer.api.utils.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author lz
 */
@Service
public class OptionServiceImpl implements OptionService {


    @Autowired
    OptionMapper optionMapper;

    @Override
    public Option get(Integer id) {
        if(id==null){
            throw new ServiceException(RestCode.BAD_REQUEST_403);
        }
        Option option= optionMapper.selectById(id);
        return option;
    }

    @Override
    public Integer del(Integer id) {
        if(id==null){
            throw new ServiceException(RestCode.BAD_REQUEST_403);
        }
        return optionMapper.deleteById(id);
    }

    @Override
    public Option update(OptionDto optionDto) {
        Option option=new Option();
        BeanUtil.copyProperties(optionDto, option);
        option.setCreateTime(new Date());
        optionMapper.insert(option);
        return option;
    }

    @Override
    public Option create(OptionDto optionDto) {
        if(optionDto.getId()==null){
            throw new ServiceException(RestCode.BAD_REQUEST_403);
        }
        Option option=new Option();
        BeanUtil.copyProperties(optionDto, option);
        optionMapper.updateById(option);
        return option;
    }
}
