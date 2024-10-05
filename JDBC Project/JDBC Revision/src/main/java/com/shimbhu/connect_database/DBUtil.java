package com.shimbhu.connect_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class DBUtil {

    private static final String url = "jdbc:mysql://localhost:3306/movie_ticket";
    private static final String userName = "root";
    private static final String password = "admin";
    static Connection connection = null;

    public static Connection provideConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {

            if (Objects.isNull(connection)) {
                System.out.println("Creating new instance of connection.");
                connection = DriverManager.getConnection(url, userName, password);
            }

            System.out.println("Database connected successfully.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
