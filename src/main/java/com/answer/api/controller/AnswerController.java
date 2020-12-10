package com.answer.api.controller;

import com.answer.api.entity.Answer;
import com.answer.api.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
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

}
