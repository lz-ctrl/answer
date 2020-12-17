package com.answer.api.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AnswerInformation implements Serializable {
    private Integer id;

    private Integer score;

    private Integer userId;

    private Integer tigerScore;

    private Integer peacockScore;

    private Integer koalaScore;

    private Integer owlScore;

    private Integer lizardScore;

    private Date date;


}