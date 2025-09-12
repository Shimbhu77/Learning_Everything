package com.shimbhu;

public interface Channel {
    void subscribe(String name, Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers(String message);
    void uploadVideo(String message);
}
