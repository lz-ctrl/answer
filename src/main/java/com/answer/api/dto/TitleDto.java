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
    private Integer user_id;
}
