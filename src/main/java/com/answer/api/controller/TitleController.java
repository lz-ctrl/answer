package com.answer.api.controller;

import com.answer.api.codec.RestApiResult;
import com.answer.api.codec.RestCode;
import com.answer.api.entity.Title;
import com.answer.api.service.TitleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author YinJunjie
 * @date 2020-12-17 14:44
 */
@RestController
@Api
@RequestMapping("find")
public class TitleController {

    @Autowired
    private TitleService titleService;

    @PostMapping("title")
    @ApiOperation(value = "查询所有副标题",notes = "查询所有副标题")
    public RestApiResult<List<Title>> findAll(){
        return new RestApiResult<>(RestCode.SUCCESS,titleService.findAll());
    }
}
