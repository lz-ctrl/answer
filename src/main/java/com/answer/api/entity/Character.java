package com.answer.api.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author lz
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_character")
public class Character {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String characterName;
    private String personalityProfile;
    private String personalityCharacteristics;
    private String advantage;
    private String shortcoming;
    private String workStyle;
}
