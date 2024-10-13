package com.shimbhu.spring_expression_language;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Something {

    @Value("#{7+11+16}")
    private String x;

    @Value("#{77+57}")
    private String s;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Something{" +
                "x='" + x + '\'' +
                ", s='" + s + '\'' +
                '}';
    }
}
