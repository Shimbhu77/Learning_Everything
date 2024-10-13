package com.shimbhu.bean_config_without_xml.without_xml_with_component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Raja {
    @Value("Maharana Sanga")
    private String name;

    @Value("Member of the Sisodia dynasty")
    private String kingdom;

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
