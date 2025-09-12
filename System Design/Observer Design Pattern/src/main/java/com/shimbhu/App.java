package com.shimbhu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Subscriber subscriber1 = new YTSubscriber();
        Subscriber subscriber2 = new YTSubscriber();

        Channel channel = new YTChannel("SK production");

        channel.subscribe("Shimbhu",subscriber1);

        channel.subscribe("Payal",subscriber2);

        channel.uploadVideo("How Neural Networks works?");

        channel.unsubscribe(subscriber2);

        channel.uploadVideo("How LLMs works internally ?");
    }
}
