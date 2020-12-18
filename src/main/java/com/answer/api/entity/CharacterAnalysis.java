package com.answer.api.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author YinJunjie
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_character_analysis")
public class CharacterAnalysis implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String characterName;

    private String personalityProfile;

    private String personalityCharacteristics;

    private String advantage;

    private String shortcoming;

    private String workStyle;

}