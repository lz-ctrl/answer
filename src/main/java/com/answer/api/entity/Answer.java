package com.answer.api.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_answer")
public class Answer implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String questions;

    private String a;

    private String b;

    private String c;

    private String d;

    private String e;

    private Integer af;

    private Integer bf;

    private Integer cf;

    private Integer df;

    private Integer ef;

    private Integer type;

    private Integer titleId;

    private Integer answerType;


    @TableField(exist = false)
    private Option option;





}