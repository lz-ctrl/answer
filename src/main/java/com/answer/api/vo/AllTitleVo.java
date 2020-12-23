package com.answer.api.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author YinJunjie
 * @date 2020-12-22 16:04
 */
@Data
public class AllTitleVo {

    @ApiModelProperty("所有副标题")
    private List all;
}
