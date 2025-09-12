package com.shimbhu.existing_functional_interfaces.revise;

import java.util.function.Supplier;

public class SupplierEx {

    public static void main(String[] args) {

        String name = "Payal";

        Supplier<String> supplier = () -> name;

        System.out.println("Name : "+supplier.get());
    }
}
