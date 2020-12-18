package com.answer.api.vo;

import com.answer.api.entity.CharacterAnalysis;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author lz
 */
@Data
public class CompleteVo {
    @ApiModelProperty("所得分数")
    private Integer score;
    @ApiModelProperty("模板id")
    private Integer modelId;

    private CharacterAnalysis characterAnalysis;
}
