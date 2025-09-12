package com.shimbhu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RemoteControl remoteControl = new RemoteControl();

        System.out.println(remoteControl);

        remoteControl.setCommand(new LightCommand(new Light()),1);
        remoteControl.setCommand(new FanCommand(new Fan()),2);

        System.out.println(remoteControl);

        remoteControl.pressButton(1);
        System.out.println(remoteControl);
        remoteControl.pressButton(1);


        remoteControl.pressButton(2);
        remoteControl.pressButton(2);

        System.out.println(remoteControl);
    }
}
