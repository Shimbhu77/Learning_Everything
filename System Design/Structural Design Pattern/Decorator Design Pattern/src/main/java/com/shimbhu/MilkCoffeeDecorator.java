package com.shimbhu;

public class MilkCoffeeDecorator extends CoffeeDecorator{

    public MilkCoffeeDecorator(BaseCoffee baseCoffee) {
        super(baseCoffee);
    }

    @Override
    public int getCost() {
        return baseCoffee.getCost()+20;
    }

    @Override
    public String getDescription() {
        return baseCoffee.getDescription()+" , Milk";
    }
}
