package com.shimbhu.connect_database;

import java.sql.Connection;

public class Demo {
    public static void main(String[] args) {
        // checking the database connection
        Connection connection = DBUtil.provideConnection();
        System.out.println(connection.toString());
    }
}