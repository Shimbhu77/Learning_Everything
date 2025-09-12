package com.shimbhu;

public class TextDecorator implements Text{

    Text text;

    public TextDecorator(Text text){
        this.text = text;
    }

    @Override
    public String getText(String message) {
        return text.getText(message);
    }
}
