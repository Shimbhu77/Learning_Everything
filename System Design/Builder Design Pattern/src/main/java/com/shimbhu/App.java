package com.shimbhu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User user = new User.UserBuilder("Shimbhu").setAge(23).setCity("Jaipur").build();
        System.out.println(user);

        User user2 = new User.UserBuilder("Payal").setAge(23).setCity("Berlin").setState("Germany").build();
        System.out.println(user2);
    }
}
