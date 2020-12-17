package com.answer.api.entity;

import io.swagger.models.auth.In;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AnswerInformation implements Serializable {
    private Integer id;

    private Integer score;

    private Integer user_id;

    private Integer tiger_score;

    private Integer peacock_score;

    private Integer koala_score;

    private Integer owl_score;

    private Integer lizard_score;

    private Date date;


}