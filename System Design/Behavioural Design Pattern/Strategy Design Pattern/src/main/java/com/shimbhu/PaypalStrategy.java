package com.shimbhu;

public class PaypalStrategy implements PaymentStrategy {
    @Override
    public void makePayment() {
        System.out.println("Making International payment through Paypal.");
    }
}
