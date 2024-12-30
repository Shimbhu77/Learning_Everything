package com.shimbhu.bean_configuration_methods.bean_configuration_with_bean_annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
public class Home {

    private String name;

    private String city;

    private String price;
}
