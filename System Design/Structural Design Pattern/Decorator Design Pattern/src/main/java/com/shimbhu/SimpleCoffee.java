package com.shimbhu;

public class SimpleCoffee implements BaseCoffee {
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "This is Simple Coffee";
    }
}
