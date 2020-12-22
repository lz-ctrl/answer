package com.answer.api.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author YinJunjie
 * @date 2020-12-17 14:10
 */

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_title")
public class Title {

    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    private String title;

    private String content;

//    @TableField(exist = false)
//    private int number1;
//
//    @TableField(exist = false)
//    private int number2;
//
//    @TableField(exist = false)
//    private int number3;
//
//    @TableField(exist = false)
//    private int situation1;
//
//    @TableField(exist = false)
//    private int situation2;
//
//    @TableField(exist = false)
//    private int situation3;
}
