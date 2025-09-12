package com.shimbhu;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class RemoteControl {

    List<Command> list;
    List<Boolean> state;

    public RemoteControl(){
        list = new LinkedList<>();
        state = new LinkedList<>();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "list=" + list +
                ", state=" + state +
                '}';
    }

    public void setCommand(Command command, Integer number){

        if(list.contains(command)){
            list.set(number-1,command);
            state.set(number-1,false);
        }
        else{
            list.add(command);
            state.add(false);
        }
    }

    public void pressButton(Integer button){

        Command command = list.get(button-1);
        Boolean status = state.get(button-1);

        if(status != null && status){
            command.undo();
            state.set(button-1,false);
        }else{
            command.execute();
            state.set(button-1,true);
        }
    }
}
