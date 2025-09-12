package com.shimbhu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PaymentStrategy paymentStrategy1 = new PaypalStrategy();
        PaymentService paymentService1 = new PaymentService(paymentStrategy1);
        paymentService1.makePayment();

        PaymentStrategy paymentStrategy2 = new RazorypayStrategy();
        PaymentService paymentService2 = new PaymentService(paymentStrategy2);
        paymentService2.makePayment();
    }
}
