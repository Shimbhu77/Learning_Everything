package com.shimbhu.statement;

import com.shimbhu.connect_database.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataUsingStatement {

    public static void main(String[] args) {

        // getting the connection
        Connection connection = DBUtil.provideConnection();

        // inserting data into d_movies_tbl

        // inserting data using Statement

        String query = "insert into d_movies_tbl (movie_name,release_year, collection, budget) values ('Jawan', 2023,300,1200)";

        try {

            Statement statement = connection.createStatement();

            int rowsAffected = statement.executeUpdate(query);

            if (rowsAffected > 0) {
                System.out.println("Movies data inserted successfully.");
            } else {
                System.out.println("Error occurred, Unable to insert movies data");
            }

            // closing statement
            statement.close();

            // closing connection
            connection.close();

            System.out.println("Database disconnected successfully.");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
