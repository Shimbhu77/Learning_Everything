package com.shimbhu;

/**
 * Hello world!
 *
 */
public class Singleton
{
    public static void main( String[] args )
    {
        Connection connection1 = Connection.getConnection();
        Connection connection2 = Connection.getConnection();

        if(connection2 == connection1){
            System.out.println("Same object location.");
        }
        else{
            System.out.println("Different Objects.");
        }
    }
}
