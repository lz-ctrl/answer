package com.answer.api.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author YinJunjie
 * @date 2020-12-14 15:44
 */

@Data
public class AnswerInformationDto {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("分数")
    private Integer score;
    @ApiModelProperty("答题时间")
    private Date date;
}
