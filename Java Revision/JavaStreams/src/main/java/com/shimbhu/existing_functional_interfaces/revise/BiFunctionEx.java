package com.shimbhu.existing_functional_interfaces.revise;

import javax.xml.namespace.QName;
import java.util.function.BiFunction;

public class BiFunctionEx {

    public static void main(String[] args) {

        BiFunction<String,Integer,String> biFunction = (name, age) -> name +" age is "+age;

        System.out.println(biFunction.apply("Payal",22));
    }
}
