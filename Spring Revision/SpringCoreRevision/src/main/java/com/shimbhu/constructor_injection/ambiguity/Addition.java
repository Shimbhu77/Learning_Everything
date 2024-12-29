package com.shimbhu.constructor_injection.ambiguity;

import lombok.ToString;

@ToString
public class Addition {
    private int x;
    private int y;

    public Addition(int x, int y) {
        System.out.println("calling int , int constructor");
        this.x = x;
        this.y = y;

        doSum(x, y);
    }

    public Addition(double x, double y) {
        System.out.println("calling double , double constructor");
        this.x = (int) x;
        this.y = (int) y;

        doSum((int) x, (int) y);
    }

    public Addition(String x, String y) {
        System.out.println("calling string , string constructor");
        this.x = Integer.parseInt(x);
        this.y = Integer.parseInt(y);

        doSum(Integer.parseInt(x), Integer.parseInt(y));
    }

    public void doSum(int x, int y) {
        System.out.println("sum of x " + x + " and y " + y + " is " + (x + y));
    }
}
