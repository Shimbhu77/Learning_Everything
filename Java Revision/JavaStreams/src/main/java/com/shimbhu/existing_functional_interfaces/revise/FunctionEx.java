package com.shimbhu.existing_functional_interfaces.revise;

import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {

        Function<String,Integer> function = name -> 22;

        Function<String,String> function1 = name -> name+ " age is "+ 22;
        Function<String,String> function2 = name -> name+ " age is "+ 22;

        System.out.println(function.apply("Payal"));
        System.out.println(function1.apply("Payal"));
    }
}
