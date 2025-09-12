package com.shimbhu;

public class CreamCoffeeDecorator extends CoffeeDecorator{

    public CreamCoffeeDecorator(BaseCoffee baseCoffee) {
        super(baseCoffee);
    }

    @Override
    public int getCost() {
        return baseCoffee.getCost()+50;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" , Cream";
    }
}
