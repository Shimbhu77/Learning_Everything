package com.shimbhu.factory;

public class DogFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
