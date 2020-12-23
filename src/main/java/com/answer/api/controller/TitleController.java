package com.answer.api.controller;

import com.answer.api.codec.LayuiRespResult;
import com.answer.api.codec.RestApiResult;
import com.answer.api.codec.RestCode;
import com.answer.api.dto.TitleDto;
import com.answer.api.entity.Title;
import com.answer.api.service.TitleService;
import com.answer.api.vo.TitleVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("list/{id}")
    @ApiOperation(value = "根据userId查询副标题",notes = "根据userId查询副标题")
    public RestApiResult<List<TitleVo>> findAll(@PathVariable Integer id){
        return new RestApiResult<>(RestCode.SUCCESS,titleService.findAll(id));
    }

    @ApiOperation(value = "所有副标题",notes = "所有副标题")
    @GetMapping()
    public LayuiRespResult findAllTitle(){
        return LayuiRespResult.success(titleService.findAllTitle(), 1000);
    }

    @ApiOperation(value = "修改副标题",notes = "修改副标题")
    @PutMapping()
    public RestApiResult update(@RequestBody @Validated TitleDto titleDto){
        return new RestApiResult(RestCode.SUCCESS,titleService.update(titleDto));
    }

    @ApiOperation(value = "添加副标题",notes = "添加副标题")
    @PostMapping("insert")
    public RestApiResult insert(@RequestBody @Validated TitleDto titleDto){
       return new RestApiResult(RestCode.SUCCESS,titleService.insert(titleDto));
    }

    @ApiOperation(value = "删除副标题",notes = "删除副标题")
    @GetMapping("{id}")
    public RestApiResult delete(@PathVariable Integer id){
        return new RestApiResult(RestCode.SUCCESS,titleService.delete(id));
    }
}
