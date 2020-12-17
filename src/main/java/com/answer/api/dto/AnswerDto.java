package com.answer.api.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author lz
 */
@Data
public class AnswerDto {
    @ApiModelProperty("用户id")
    private Integer userId;
    @ApiModelProperty("答题选项 A B C D E")
    private String optionStr;
    @ApiModelProperty("题目的id")
    private Integer id;
}