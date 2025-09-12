package com.shimbhu;

public class Connection {

    public static Connection connection;
    public static Connection getConnection(){

        if(connection == null){
            synchronized (Connection.class){

                if(connection == null){
                    connection = new Connection();
                }
            }
        }
        return connection;
    }
}
