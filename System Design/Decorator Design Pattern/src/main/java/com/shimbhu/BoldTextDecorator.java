package com.shimbhu;

public class BoldTextDecorator extends TextDecorator{

    BoldTextDecorator(Text text){
        super(text);
    }

    public String getText(String message){
        return "Bold : "+text.getText(message)+" : Bold ";
    }
}
