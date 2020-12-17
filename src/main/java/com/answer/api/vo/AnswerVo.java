package com.answer.api.vo;

import com.answer.api.entity.Option;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author lz
 */
@Data
public class AnswerVo {
    private Integer id;
    @ApiModelProperty("题目")
    private String questions;
    @ApiModelProperty("选项")
    private Option option;
    @ApiModelProperty("类型 1老虎 2孔雀 3考拉 4猫头鹰 5变色龙")
    private Integer type;
}
