package com.shimbhu.bean_configuration_methods.bean_configuration_with_bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

//    @Bean
    @Bean(name = {"payalHome","payalMansion","payalAbroadHome"}) // we can give the object name which we fetch from application context
    public Home payalHome()
    {
        Home home = new Home();
        home.setName("Payal London House");
        home.setCity("London");
        home.setPrice("300 crore");

        return home;
    }
}
