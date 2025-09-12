package com.shimbhu;

public class PaymentService {

    private PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(){
        paymentStrategy.makePayment();
    }
}
