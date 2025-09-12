package com.shimbhu;

public class ItalicTextDecorator extends TextDecorator{

    ItalicTextDecorator(Text text){
        super(text);
    }

    public String getText(String message){
        return "Italic : "+text.getText(message)+" : Italic";
    }
}
