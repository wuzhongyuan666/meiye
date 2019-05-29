package com.cn.bean;

import java.io.Serializable;

public class Admin implements Serializable {

    private Integer id;
    private String name;
    private String paString;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaString() {
        return paString;
    }

    public void setPaString(String paString) {
        this.paString = paString;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", paString='" + paString + '\'' +
                '}';
    }
}
