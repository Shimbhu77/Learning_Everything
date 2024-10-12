package com.shimbhu.spring_bean_life_cycle.using_interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Waterfall implements InitializingBean, DisposableBean {

    private String waterfallName;
    private String location;

    public String getWaterfallName() {
        return waterfallName;
    }

    public void setWaterfallName(String waterfallName) {
        this.waterfallName = waterfallName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Waterfall{" +
                "waterfallName='" + waterfallName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("calling the destroy method using interface;");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("calling the init method using interface;");
    }
}
