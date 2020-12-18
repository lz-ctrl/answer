package com.answer.api.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author lz
 */
@Data
public class AnswerAllDto {
    @ApiModelProperty("标题id")
    private Integer titleId;
    @ApiModelProperty("用户id")
    private Integer userId;
    @ApiModelProperty("题目list")
    private List<AnswerDto> list;
}
