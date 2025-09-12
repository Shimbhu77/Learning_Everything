package com.shimbhu;

import java.util.HashMap;
import java.util.Map;

public class YTChannel implements Channel{

    Map<Subscriber,String> subscriberList;
    String channelName;

    public YTChannel(String channelName){
        this.subscriberList = new HashMap<>();
        this.channelName = channelName;
    }

    @Override
    public void subscribe(String name, Subscriber subscriber) {

        if(!subscriberList.containsKey(subscriber)){
            subscriberList.put(subscriber,name);
            System.out.println("subscriber "+name+" is subscribed.");
        }
        else{
            System.out.println("subscriber is already subscribed.");
        }
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {

        if(subscriberList.containsKey(subscriber)){
            subscriberList.remove(subscriber);
            System.out.println("subscriber "+ subscriberList.get(subscriber)+ " is unsubscribed.");
        }
        else{
            System.out.println("subscriber is already unsubscribed.");
        }
    }

    @Override
    public void uploadVideo(String message) {
        System.out.println(message+" Video is uploaded successfully.");
        notifySubscribers(message);
    }

    @Override
    public void notifySubscribers(String message) {

        for(Subscriber subscriber : subscriberList.keySet()){
            System.out.println("Hey "+subscriberList.get(subscriber));
            subscriber.update(message);
        }
    }
}
