package com.answer.api.vo;

import com.answer.api.entity.Title;
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

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("题目数量")
    private int number;

    @ApiModelProperty("副标题的状态，0未作，1已作")
    private int situation;

}
