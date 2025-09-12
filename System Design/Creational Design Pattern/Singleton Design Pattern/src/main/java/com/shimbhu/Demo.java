package com.shimbhu;

/**
 * Hello world!
 *
 */
public class Demo
{
    public static void main( String[] args )
    {
        SingletonStaticClass singletonStaticClass = SingletonStaticClass.getInstance();

        singletonStaticClass.display();

        SingletonDoubleLockingClass singletonDoubleLockingClass = SingletonDoubleLockingClass.getInstance();

        singletonDoubleLockingClass.display();

        SingletonEnum.SINGLETON_ENUM.displaySomething();
    }
}
