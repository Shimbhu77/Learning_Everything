package com.shimbhu.bean_config_without_xml.with_bean_annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    // by default beanName is method name : getMaharani
    // if want custom name then do like this
    @Bean(name = {"maharani","rani","queen"})
//    @Bean
    public MahaRani getMaharani()
    {
        return new MahaRani("Lakshmibai Newalkar, the Rani of Jhansi","Jhansi");
    }
}
