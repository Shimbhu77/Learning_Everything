package com.shimbhu;

public abstract class CoffeeDecorator implements BaseCoffee{

    protected BaseCoffee baseCoffee;

    public CoffeeDecorator(BaseCoffee baseCoffee) {
        this.baseCoffee = baseCoffee;
    }

    @Override
    public int getCost() {
        return baseCoffee.getCost();
    }

    @Override
    public String getDescription() {
        return baseCoffee.getDescription();
    }
}
