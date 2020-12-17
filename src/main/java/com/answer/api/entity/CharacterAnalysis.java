package com.answer.api.entity;

import java.io.Serializable;

public class CharacterAnalysis implements Serializable {
    private Integer id;

    private String characterName;

    private String personalityProfile;

    private String personalityCharacteristics;

    private String advantage;

    private String shortcoming;

    private String workStyle;

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

    public String getPersonalityProfile() {
        return personalityProfile;
    }

    public void setPersonalityProfile(String personalityProfile) {
        this.personalityProfile = personalityProfile == null ? null : personalityProfile.trim();
    }

    public String getPersonalityCharacteristics() {
        return personalityCharacteristics;
    }

    public void setPersonalityCharacteristics(String personalityCharacteristics) {
        this.personalityCharacteristics = personalityCharacteristics == null ? null : personalityCharacteristics.trim();
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage == null ? null : advantage.trim();
    }

    public String getShortcoming() {
        return shortcoming;
    }

    public void setShortcoming(String shortcoming) {
        this.shortcoming = shortcoming == null ? null : shortcoming.trim();
    }

    public String getWorkStyle() {
        return workStyle;
    }

    public void setWorkStyle(String workStyle) {
        this.workStyle = workStyle == null ? null : workStyle.trim();
    }
}