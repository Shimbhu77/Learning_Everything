package com.shimbhu.bean_configuration_methods.bean_without_xml_with_component_and_component_scan_annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component("payalMansion")
public class Home {

    @Value("Payal Bhawan")
    private String name;

    @Value("Bharatvarsh")
    private String city;

    @Value("50 crore")
    private String price;
}
