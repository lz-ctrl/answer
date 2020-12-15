package com.answer.api.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author lz
 */
@Data
public class AnswerDto {
    @ApiModelProperty("答题选项 A B C")
    private String optionStr;
    @ApiModelProperty("题目的id A B C")
    private Integer id;
}
