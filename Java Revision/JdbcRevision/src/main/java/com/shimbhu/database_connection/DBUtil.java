package com.shimbhu.database_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class DBUtil {

    static String databaseUrl = "jdbc:mysql://localhost:3306/movies";
    static String username = "root";
    static String password = "admin";
    static Connection connection = null;

    public static Connection getConnection() {

        try {
            if (Objects.isNull(connection)) {
                connection = DriverManager.getConnection(databaseUrl, username, password);
                System.out.println("database connected successfully.");
            }
            // no need for closing the connection because we are using for doing crud operations
        } catch (SQLException e) {
            System.out.println("Connection Failed, Error " + e.getMessage());
        }

        return connection;
    }
}
