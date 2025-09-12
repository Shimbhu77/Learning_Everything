package com.shimbhu;

public class FanCommand implements Command{

    private Fan fan;

    public FanCommand(Fan fan){
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOn();
    }

    @Override
    public void undo() {
       fan.turnOff();
    }
}
