package com.answer.api.controller;

import com.answer.api.codec.RestApiResult;
import com.answer.api.codec.RestCode;
import com.answer.api.dto.AnswerDto;
import com.answer.api.entity.Answer;
import com.answer.api.service.AnswerService;
import com.answer.api.utils.BeanMapper;
import com.answer.api.utils.BeanUtil;
import com.answer.api.vo.AnswerVo;
import com.answer.api.vo.CompleteVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    //用户答题
    @RequestMapping(value = "question",method = RequestMethod.GET)
    public String question(@RequestParam(value = "id",defaultValue = "2") int[] id , @RequestParam(value = "answer",defaultValue = "A") String[] answer){
        //返回调用答题方法
        Answer answering = answerService.questionAnswering(id, answer);
        System.out.println(answering);
        return null;
    }


    @GetMapping("list")
    public RestApiResult<List<AnswerVo>> list(){
        return new RestApiResult<>(RestCode.SUCCESS, BeanMapper.mapList(answerService.findAll(),AnswerVo.class));
    }


    @ApiOperation(value = "完成题目结算", notes = "所有题目答完提交")
    @PostMapping("complete")
    public RestApiResult<CompleteVo> complete(@RequestBody List<AnswerDto> list){
        return new RestApiResult<>(RestCode.SUCCESS, answerService.complete(list));
    }
}
