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

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String questions;
    @TableField(exist = false)
    private Option option;

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

    private static final long serialVersionUID = 1L;



}