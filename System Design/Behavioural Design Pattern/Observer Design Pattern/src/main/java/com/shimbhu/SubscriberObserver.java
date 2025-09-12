package com.shimbhu;

public class SubscriberObserver implements Observer{

    private final String name;

    public SubscriberObserver(String name){
        this.name = name;
    }
    @Override
    public void update(String name) {
        System.out.println("Notified the subscriber : "+name);
    }
}
