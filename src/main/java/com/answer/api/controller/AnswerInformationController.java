package com.answer.api.controller;

import com.answer.api.service.AnswerInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author 67403
 */
@Controller
public class AnswerInformationController {

    @Autowired
    private AnswerInformationService answerInformationService;

    @RequestMapping(value = "getScore",method = RequestMethod.GET)
    @ResponseBody
    public Integer getScore(@RequestParam(value = "id") int id){
        return answerInformationService.getPoints(id);
    }
}