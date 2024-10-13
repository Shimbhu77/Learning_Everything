package com.shimbhu.spring_expression_language;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Demo {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("springExpLang.xml");

        Something something = context.getBean("something", Something.class);

        System.out.println(something);

        // another method
        // but generally we use spEL with @Value annotation

        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
        Expression expression = spelExpressionParser.parseExpression("7+11");
        System.out.println(expression.getValue());

    }
}
