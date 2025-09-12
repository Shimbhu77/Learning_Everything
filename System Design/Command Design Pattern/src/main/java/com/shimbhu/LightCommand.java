package com.shimbhu;

public class LightCommand implements Command{

    private Light light;

    public LightCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
       light.turnOff();
    }
}
