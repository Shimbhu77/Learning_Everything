package com.shimbhu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SimpleCoffee simpleCoffee = new SimpleCoffee();

        System.out.println(simpleCoffee.getDescription()+" , Price : "+simpleCoffee.getCost());

        CoffeeDecorator  milkCoffee = new MilkCoffeeDecorator(simpleCoffee);

        System.out.println(milkCoffee.getDescription()+" , Price : "+milkCoffee.getCost());

        CoffeeDecorator sugarCoffee = new SugarCoffeeDecorator(milkCoffee);

        System.out.println(sugarCoffee.getDescription()+" , Price : "+sugarCoffee.getCost());

        CoffeeDecorator creamCoffee = new CreamCoffeeDecorator(sugarCoffee);

        System.out.println(creamCoffee.getDescription()+" , Price : "+creamCoffee.getCost());
    }
}
