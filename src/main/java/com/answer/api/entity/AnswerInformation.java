package com.answer.api.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_answerInformation")
public class AnswerInformation implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Integer score;
    private Integer userId;
    private Integer tigerScore;
    private Integer peacockScore;
    private Integer koalaScore;
    private Integer owlScore;
    private Integer lizardScore;
    private Integer titleId;
    private Date date;


}