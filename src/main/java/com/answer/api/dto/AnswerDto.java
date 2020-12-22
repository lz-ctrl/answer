package com.answer.api.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author lz
 */
@Data
public class AnswerDto {
    @ApiModelProperty("答题选项 A B C D E")
    private String optionStr;
    @ApiModelProperty("题目的id")
    private Integer id;
    @ApiModelProperty("问题")
    private String questions;
    @ApiModelProperty("A选项")
    private String a;
    @ApiModelProperty("B选项")
    private String b;
    @ApiModelProperty("C选项")
    private String c;
    @ApiModelProperty("D选项")
    private String d;
    @ApiModelProperty("E选项")
    private String e;
    @ApiModelProperty("A选项的分数")
    private Integer af;
    @ApiModelProperty("B选项的分数")
    private Integer bf;
    @ApiModelProperty("C选项的分数")
    private Integer cf;
    @ApiModelProperty("D选项的分数")
    private Integer df;
    @ApiModelProperty("E选项的分数")
    private Integer ef;
    @ApiModelProperty("性格类型")
    private Integer type;
    @ApiModelProperty("副标题id")
    private Integer titleId;
    @ApiModelProperty("题目的类型")
    private Integer answerType;
}