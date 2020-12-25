package com.answer.api.controller;

import com.answer.api.codec.RestApiResult;
import com.answer.api.codec.RestCode;
import com.answer.api.dto.OptionDto;
import com.answer.api.service.OptionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author YinJunjie
 * @date 2020-12-24 16:32
 */
@Api("选项操作")
@RestController
@RequestMapping("option")
public class OptionController {

    @Autowired
    private OptionService optionService;

    /**
     * 根据id查题目
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public RestApiResult finfById(@PathVariable Integer id){
        return new RestApiResult(RestCode.SUCCESS, optionService.get(id));
    }

    /**
     * 增加选项
     * @param optionDto
     * @return
     */
    @PostMapping()
    public RestApiResult insert(@RequestBody @Validated OptionDto optionDto){
        return new RestApiResult(RestCode.SUCCESS,optionService.create(optionDto));
    }

    /**
     * 删除选项
     * @param id
     * @return
     */
    @DeleteMapping("{id}")
    public RestApiResult delete(@PathVariable Integer id){
        return new RestApiResult(RestCode.SUCCESS,optionService.del(id));
    }


    /**
     * 修改选项
     * @param optionDto
     * @return
     */
    @PutMapping()
    public RestApiResult update(@RequestBody @Validated OptionDto optionDto){
        return new RestApiResult(RestCode.SUCCESS,optionService.update(optionDto));
    }
}
