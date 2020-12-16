package com.answer.api.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author YinJunjie
 * @date 2020-12-14 15:44
 */

@Data
public class AnswerDto {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("问题")
    private String questions;
    @ApiModelProperty("选项A")
    private String a;
    @ApiModelProperty("选项B")
    private String b;
    @ApiModelProperty("选项C")
    private String c;
    @ApiModelProperty("选项D")
    private String d;
    @ApiModelProperty("选项E")
    private String e;
    @ApiModelProperty("A的分值")
    private Integer af;
    @ApiModelProperty("B的分值")
    private Integer bf;
    @ApiModelProperty("C的分值")
    private Integer cf;
    @ApiModelProperty("D的分值")
    private Integer df;
    @ApiModelProperty("E的分值")
    private Integer ef;
    @ApiModelProperty("所属类型的ID")
    private Integer typeId;

}
