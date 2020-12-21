package com.answer.api.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author YinJunjie
 * @date 2020-12-18 14:35
 */
@Data
public class TitleVo {
    @ApiModelProperty("id")
    private int id;

    @ApiModelProperty("副标题")
    private String title;

    @ApiModelProperty("题目数量")
    private int number1;

    @ApiModelProperty("题目数量")
    private int number2;

    @ApiModelProperty("题目数量")
    private int number3;

    @ApiModelProperty("副标题的状态，0未作，1已作")
    private int situation1;

    @ApiModelProperty("副标题的状态，0未作，1已作")
    private int situation2;

    @ApiModelProperty("副标题的状态，0未作，1已作")
    private int situation3;

    @ApiModelProperty("所有副标题")
    private List titleList;
}
