package com.shimbhu;

public class UPIStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount){
        System.out.println(amount + " Rupees is paid via UPI.");
    }
}
