package com.shimbhu.simplefactory;

public class SimpleFactory {

    public static void main(String[] args) {

        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal1 = animalFactory.createAnimal("Cat");
        animal1.sound();

        Animal animal2 = animalFactory.createAnimal("Dog");
        animal2.sound();
    }
}
