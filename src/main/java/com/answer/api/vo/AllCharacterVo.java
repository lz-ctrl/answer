package com.answer.api.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author YinJunjie
 * @date 2020-12-22 16:07
 */
@Data
public class AllCharacterVo {
    @ApiModelProperty("所有性格")
    private List all;

}
