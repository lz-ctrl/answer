package com.answer.api.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author YinJunjie
 * @date 2020-12-14 15:44
 */

@Data
public class AnswerInformationVo {
    @ApiModelProperty("id")
    private Integer id;
    @ApiModelProperty("用户id")
    private Integer userId;
    @ApiModelProperty("总分数")
    private Integer score;
    @ApiModelProperty("老虎分数")
    private Integer tigerScore;
    @ApiModelProperty("孔雀分数")
    private Integer peacockScore;
    @ApiModelProperty("考拉分数")
    private Integer koalaScore;
    @ApiModelProperty("猫头鹰分数")
    private Integer owlScore;
    @ApiModelProperty("变色龙分数")
    private Integer lizardScore;
    @ApiModelProperty("答题时间")
    private Date date;

}
