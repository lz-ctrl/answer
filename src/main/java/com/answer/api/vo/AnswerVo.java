package com.answer.api.vo;

import com.answer.api.entity.Option;
import lombok.Data;

/**
 * @author lz
 */
@Data
public class AnswerVo {
    private Integer id;
    private String questions;
    private Option option;
}
