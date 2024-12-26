package com.shimbhu.connect_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

    static String databaseUrl = "jdbc:mysql://localhost:3306/jdbcdb";
    static String username = "root";
    static String password = "admin";

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            System.out.println("Connection established successfully." + connection.toString());

            // closing the connection
            connection.close();

        } catch (SQLException e) {

            System.out.println("Connection Failed, Error " + e.getMessage());
        }
    }
}
