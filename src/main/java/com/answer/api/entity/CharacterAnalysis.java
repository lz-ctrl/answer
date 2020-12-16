package com.answer.api.entity;

import java.io.Serializable;

public class CharacterAnalysis implements Serializable {
    private Integer id;

    private String characterName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName == null ? null : characterName.trim();
    }
}