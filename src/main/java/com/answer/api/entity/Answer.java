package com.answer.api.entity;

import java.io.Serializable;

public class Answer implements Serializable {
    private Integer id;

    private String questions;

    private String a;

    private String b;

    private String c;

    private String d;

    private String e;

    private String af;

    private String bf;

    private String cf;

    private String df;

    private String ef;

    private Integer typeId;

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

    public String getAf() {
        return af;
    }

    public void setAf(String af) {
        this.af = af == null ? null : af.trim();
    }

    public String getBf() {
        return bf;
    }

    public void setBf(String bf) {
        this.bf = bf == null ? null : bf.trim();
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf == null ? null : cf.trim();
    }

    public String getDf() {
        return df;
    }

    public void setDf(String df) {
        this.df = df == null ? null : df.trim();
    }

    public String getEf() {
        return ef;
    }

    public void setEf(String ef) {
        this.ef = ef == null ? null : ef.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}