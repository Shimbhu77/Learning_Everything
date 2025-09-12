package com.shimbhu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Shop shop1 = new Shop(new CreditCardStrategy());
        Shop shop2 = new Shop(new UPIStrategy());
        Shop shop3 = new Shop(new NetBankingStrategy());

        shop1.checkout(100);
        shop2.checkout(300);
        shop3.checkout(500);
    }
}
