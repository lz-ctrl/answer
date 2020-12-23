package com.answer.api.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author YinJunjie
 * @date 2020-12-21 9:31
 */
@Data
public class TitleDto {

    @ApiModelProperty("用户ID")
    private Integer userId;

    @ApiModelProperty("标题id")
    private Integer id;

    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("正文")
    private String content;
}
