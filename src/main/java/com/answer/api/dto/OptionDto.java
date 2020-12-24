package com.answer.api.dto;

import lombok.Data;

/**
 * @author lz
 */
@Data
public class OptionDto {
    private Integer id;
    private String name;
    private String content;
    private Integer score;
    private Integer type;
    private Integer answer_id;
}
