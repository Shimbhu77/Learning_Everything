package com.shimbhu;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifySubscribers();
    void setData(String name);
}
