package com.shimbhu.statement;

import com.shimbhu.connect_database.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDataUsingStatement {

    public static void main(String[] args) {

        // getting the database connection

        Connection connection = DBUtil.provideConnection();

        // deleting the data inside d_movies_tbl
        // deleting data using statement

        // creating statement


        String query = "delete from d_movies_tbl where movie_id = 2";

        try {

            Statement statement = connection.createStatement();

            int rowsAffected = statement.executeUpdate(query);

            if (rowsAffected > 0) {
                System.out.println("Movie data deleted successfully.");
            } else {
                System.out.println("Error occurred during the deleting data of movies.");
            }

            // closing the statement
            statement.close();

            // closing the database connection

            connection.close();

            System.out.println("Database disconnected successfully.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
