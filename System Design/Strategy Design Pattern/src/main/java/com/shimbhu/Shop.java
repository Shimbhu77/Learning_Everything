package com.shimbhu;

public class Shop {

    private PaymentStrategy paymentStrategy;

    public Shop(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount){
        paymentStrategy.pay(amount);
    }
}
