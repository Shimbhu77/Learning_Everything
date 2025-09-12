package com.shimbhu.simplefactory;

public class AnimalFactory {

    public Animal createAnimal(String type) {

        if (type.equals("Cat")) {
            return new Cat();
        } else if (type.equals("Dog")) {
            return new Dog();
        } else {
            System.out.println(" Not a valid type");
            throw new RuntimeException("Not valid type");
        }
    }
}
