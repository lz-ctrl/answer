package com.answer.api.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Answer implements Serializable {
    private Integer id;

    private String questions;

    private Option option;

    private String a;

    private String b;

    private String c;

    private String d;

    private String e;

    private Integer af;

    private Integer bf;

    private Integer cf;

    private Integer df;

    private Integer ef;

    private Integer type;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions == null ? null : questions.trim();
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a == null ? null : a.trim();
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b == null ? null : b.trim();
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c == null ? null : c.trim();
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d == null ? null : d.trim();
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e == null ? null : e.trim();
    }

    public Integer getAf() {
        return af;
    }

    public void setAf(Integer af) {
        this.af = af;
    }

    public Integer getBf() {
        return bf;
    }

    public void setBf(Integer bf) {
        this.bf = bf;
    }

    public Integer getCf() {
        return cf;
    }

    public void setCf(Integer cf) {
        this.cf = cf;
    }

    public Integer getDf() {
        return df;
    }

    public void setDf(Integer df) {
        this.df = df;
    }

    public Integer getEf() {
        return ef;
    }

    public void setEf(Integer ef) {
        this.ef = ef;
    }


}