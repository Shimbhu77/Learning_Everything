package com.shimbhu.constructor_injection;

public class Addition {
    private int x;
    private int y;

    public Addition(int x, int y)
    {
        System.out.println("int ,int constructor called.");
        this.x=x;
        this.y=y;
    }

    public Addition(double x, double y)
    {
        System.out.println("double ,double constructor called.");
        this.x=(int)x;
        this.y=(int)y;
    }

//    public Addition(String x, String y)
//    {
//        System.out.println("string ,string constructor called.");
//        this.x=Integer.parseInt(x);
//        this.y=Integer.parseInt(y);
//    }

    public void doSum()
    {
        System.out.println("sum of x "+ this.x + " and y "+ this.y + " is : "+(this.x+this.y));
    }

}
