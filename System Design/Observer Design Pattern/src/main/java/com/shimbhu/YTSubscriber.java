package com.shimbhu;

public class YTSubscriber implements Subscriber{
    @Override
    public void update(String message) {
        System.out.println("Checkout our new Video : "+message);
    }
}
