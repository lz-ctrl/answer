package com.answer.api.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author YinJunjie
 * @date 2020-12-14 15:44
 */

@Data
public class AnswerVo {
    @ApiModelProperty("typeId")
    private Integer typeId;
    @ApiModelProperty("最大分数")
    private Integer maxScore;

}
