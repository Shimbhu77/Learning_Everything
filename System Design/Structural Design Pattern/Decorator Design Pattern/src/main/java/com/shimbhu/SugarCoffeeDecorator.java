package com.shimbhu;

public class SugarCoffeeDecorator extends CoffeeDecorator{

    public SugarCoffeeDecorator(BaseCoffee baseCoffee) {
        super(baseCoffee);
    }

    @Override
    public int getCost() {
        return baseCoffee.getCost()+10;
    }

    @Override
    public String getDescription() {
        return baseCoffee.getDescription()+" , Sugar";
    }
}
