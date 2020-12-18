package com.answer.api.controller;

import com.answer.api.codec.RestApiResult;
import com.answer.api.codec.RestCode;
import com.answer.api.dto.AnswerDto;
import com.answer.api.entity.Answer;
import com.answer.api.entity.AnswerInformation;
import com.answer.api.exception.ServiceException;
import com.answer.api.service.AnswerService;
import com.answer.api.utils.BeanMapper;
import com.answer.api.vo.AnswerVo;
import com.answer.api.vo.CompleteVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "答题接口")
@RestController
@RequestMapping("answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @RequestMapping(value = "question",method = RequestMethod.GET)
    public String question(@RequestParam(value = "id",defaultValue = "2") int[] id , @RequestParam(value = "answer",defaultValue = "A") String[] answer){
        //返回调用答题方法
        Answer answering = answerService.questionAnswering(id, answer);
        System.out.println(answering);
        return null;
    }

    @ApiOperation(value = "查询所有题目", notes = "查询所有题目")
    @GetMapping("list")
    public RestApiResult<List<AnswerVo>> list(@RequestParam(value = "page",defaultValue = "0")Integer page,
                                              @RequestParam(value = "size",defaultValue = "30")Integer size){
        return new RestApiResult<>(RestCode.SUCCESS, BeanMapper.mapList(answerService.findAll(page,size),AnswerVo.class));
    }


    @ApiOperation(value = "完成题目结算(传对象数组)", notes = "10道题目答完提交")
    @PostMapping("complete")
    public RestApiResult<AnswerInformation> complete(@RequestBody List<AnswerDto> list,@RequestParam("title_id")Integer titleId
            ,@RequestParam("user_id")Integer userId){
        if(list.size()<=0){
            throw new ServiceException(RestCode.BAD_REQUEST_408);
        }
        return new RestApiResult<>(RestCode.SUCCESS, answerService.complete(list,titleId,userId));
    }


    @ApiOperation(value = "所以题目提交", notes = "所以题目提交")
    @PostMapping("submit")
    public RestApiResult submit(@RequestParam("user_id") Integer userId){
        if(userId==null){
            throw new ServiceException(RestCode.BAD_REQUEST_403,"用户id不能为空");
        }
        return new RestApiResult<>(RestCode.SUCCESS, answerService.submit(userId));
    }
}