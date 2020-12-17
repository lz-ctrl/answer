package com.answer.api.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author lz
 */
@Data
public class CompleteVo {
    @ApiModelProperty("所得分数")
    private Integer score;
    private Character character;
    @ApiModelProperty("模板id")
    private Integer modelId;

    CharacterAnalysis characterAnalysis;
}
