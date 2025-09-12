package com.shimbhu;

public class NetBankingStrategy implements PaymentStrategy {

    @Override
    public void pay(int amount){
        System.out.println( amount + " is paid by Net Banking.");
    }
}
