package com.allaber.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Set;

public class Params {

    public Params() {
    }

    @JsonProperty("list")
    public Set<Integer> list;

    @JsonProperty("date")
    public Date date;

    @JsonProperty("text")
    public String text;

    public Params(Set<Integer> list, Date date, String text) {
        this.list = list;
        this.date = date;
        this.text = text;
    }

    public Set<Integer> getList() {
        return list;
    }

    public void setList(Set<Integer> list) {
        this.list = list;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
