package com.answer.api.controller;

import com.answer.api.codec.RestApiResult;
import com.answer.api.codec.RestCode;
import com.answer.api.service.AnswerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author YinJunjie
 * @date
 */
@Api
@Controller("答题接口")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    /**
     *
     * @param id
     * @param answer
     * @return
     * 用户答题
     */
    @RequestMapping(value = "question",method = RequestMethod.GET)
    @ApiOperation(value = "用户答题",notes = "用户答题")
    public RestApiResult question(@RequestParam(value = "id",defaultValue = "4") int[] id , @RequestParam(value = "answer",defaultValue = "D") String[] answer){
        //返回调用答题方法
        return new RestApiResult<>(RestCode.SUCCESS, answerService.questionAnswering(id, answer));
    }

}
