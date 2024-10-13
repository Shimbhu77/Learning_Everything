package com.shimbhu.bean_config_without_xml.with_bean_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class MahaRani {

    private String name;

    private String kingdom;

    public MahaRani(String s, String jhansi) {
        this.name=s;
        this.kingdom=jhansi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    @Override
    public String toString() {
        return "MahaRani{" +
                "name='" + name + '\'' +
                ", kingdom='" + kingdom + '\'' +
                '}';
    }
}
