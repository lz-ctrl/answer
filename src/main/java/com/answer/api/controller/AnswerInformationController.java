package com.answer.api.controller;

import com.answer.api.codec.RestApiResult;
import com.answer.api.codec.RestCode;
import com.answer.api.service.AnswerInformationService;
import com.answer.api.utils.BeanMapper;
import com.answer.api.vo.AnswerVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author yjj
 */
@Controller("用户答题分数")
@Api
public class AnswerInformationController {

    @Autowired
    private AnswerInformationService answerInformationService;

    @ApiOperation(value = "用户答题分数",notes = "用户答题分数")
    @RequestMapping(value = "getScore",method = RequestMethod.GET)
    @ResponseBody
    public RestApiResult getScore(@RequestParam(value = "id") int id){
        return new RestApiResult<>(RestCode.SUCCESS, answerInformationService.getPoints(id));
    }
}