package com.shimbhu;

public class CreditCardStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount){
        System.out.println("Payment is paid by Credit Card.");
    }
}
