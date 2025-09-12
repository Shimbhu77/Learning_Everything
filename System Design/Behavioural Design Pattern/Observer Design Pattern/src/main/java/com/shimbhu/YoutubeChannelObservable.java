package com.shimbhu;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelObservable implements Observable{

    private final List<Observer> subscribers = new ArrayList<>();
    private String channelName;

    public YoutubeChannelObservable(String channelName){
        this.channelName = channelName;
    }

    @Override
    public void add(Observer observer) {
        subscribers.add(observer);
        System.out.println("new subscriber added to "+channelName);
    }

    @Override
    public void remove(Observer observer) {

        subscribers.remove(observer);
        System.out.println("subscriber removed from "+channelName);
    }

    @Override
    public void notifySubscribers() {
       for(Observer observer : subscribers){
           observer.update(channelName);
       }
    }

    @Override
    public void setData(String newName) {
       this.channelName = newName;
       notifySubscribers();
    }
}
