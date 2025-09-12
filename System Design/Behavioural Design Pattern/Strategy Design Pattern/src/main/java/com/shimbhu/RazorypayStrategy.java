package com.shimbhu;

public class RazorypayStrategy implements PaymentStrategy {
    @Override
    public void makePayment() {
        System.out.println("Making Domestic payment through Razorpay.");
    }
}
