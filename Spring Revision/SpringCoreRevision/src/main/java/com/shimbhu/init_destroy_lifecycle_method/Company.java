package com.shimbhu.init_destroy_lifecycle_method;

import lombok.Data;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
public class Company implements InitializingBean, DisposableBean {

    private String name;
    private String field;

    @Override
    public void destroy() throws Exception {
        System.out.println("calling the destroy method using interface.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("calling the init method using interface.");
    }
}
