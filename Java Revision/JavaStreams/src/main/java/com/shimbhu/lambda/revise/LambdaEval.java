package com.shimbhu.lambda.revise;

public class LambdaEval {

    public static void main(String[] args) {

        Eval eval1 = (int a,int b) -> {
            return a+b;
        };

        System.out.println(eval1.sum(7,5));

        Eval eval2 = (a,b) -> {
            return a+b;
        };

        System.out.println(eval2.sum(77,57));

        Eval eval3 = (a,b) -> a+b;

        System.out.println(eval3.sum(4,5));

        Eval eval4 = Integer::sum;

        System.out.println(eval4.sum(4,5));

        SingleEval singleEval1 = (a) -> 2 * a;

        System.out.println(singleEval1.anyFold(7));

        SingleEval singleEval2 = a -> 7 * a;

        System.out.println(singleEval2.anyFold(7));
    }

}
