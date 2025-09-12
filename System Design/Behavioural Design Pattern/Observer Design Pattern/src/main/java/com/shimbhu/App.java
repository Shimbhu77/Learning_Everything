package com.shimbhu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        YoutubeChannelObservable youtubeChannelObservable = new YoutubeChannelObservable("Super Think");

        youtubeChannelObservable.add(new SubscriberObserver("Shimbhu"));
        youtubeChannelObservable.add(new SubscriberObserver("Payal"));
        youtubeChannelObservable.add(new SubscriberObserver("Ram"));
        youtubeChannelObservable.remove(new SubscriberObserver("Ram"));

        youtubeChannelObservable.setData("Shimbhu's Thinking");
    }
}
