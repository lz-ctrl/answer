package com.answer.api.controller;

import com.answer.api.codec.RestApiResult;
import com.answer.api.codec.RestCode;
import com.answer.api.dto.TitleDto;
import com.answer.api.service.TitleService;
import com.answer.api.vo.TitleVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YinJunjie
 * @date 2020-12-17 14:44
 */
@Api(tags = "副标题接口")
@RestController
@RequestMapping("title")
public class TitleController {

    @Autowired
    private TitleService titleService;

    @PostMapping("list")
    @ApiOperation(value = "查询所有副标题",notes = "查询所有副标题")
    public RestApiResult<TitleVo> findAll(TitleDto tItleDto){
        return new RestApiResult<TitleVo>(RestCode.SUCCESS,titleService.findAll(tItleDto));
    }
}
