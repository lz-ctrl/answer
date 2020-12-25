package com.answer.api.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author lz
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_option")
public class Option {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private String content;
    private Integer score;
    private Integer excludeScore;
    private Integer type;
    private Integer answerId;
    private Date createTime;
    @TableField(exist = false)
    private String A;
    @TableField(exist = false)
    private String B;
    @TableField(exist = false)
    private String C;
    @TableField(exist = false)
    private String D;
    @TableField(exist = false)
    private String E;
}
