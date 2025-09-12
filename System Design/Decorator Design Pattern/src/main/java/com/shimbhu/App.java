package com.shimbhu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Text text = new SimpleText();

//        System.out.println(text.getText("Shimbhu"));

        text = new BoldTextDecorator(text);

//        System.out.println(text.getText("Shimbhu"));

        text = new ItalicTextDecorator(text);

        System.out.println(text.getText("Shimbhu"));
    }
}
