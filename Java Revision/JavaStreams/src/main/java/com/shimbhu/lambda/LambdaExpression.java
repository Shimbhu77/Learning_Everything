package com.shimbhu.lambda;

public class LambdaExpression {

    public static void main(String[] args) {

        // lambda expression without parameters and without return type
        TestLambda testLambda = () -> {
            System.out.println("Printing using Lambda.");
        };

        testLambda.test();

        // better way

        TestLambda testLambda2 = () -> System.out.println("Printing using Lambda With better way.");

        testLambda2.test();

        // lambda expression with parameters and without return type
        TestLambdaWithParameterAndReturnType withParameterAndReturnType = name -> name.toUpperCase();

        System.out.println(withParameterAndReturnType.upper("Shimbhu"));

        // lambda expression with parameters and with return type

        Calculator calculator = (a,b) -> a+b;

        System.out.println(calculator.sum(10,15));
    }

    public int sum(int a, int b)
    {
        return a+b;
    }
}
