package com.shimbhu.bean_config_without_xml.with_xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MahaRaja {

    @Value("Maharana Pratap")
    private String name;

    @Value("Maharana of Mewar")
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
