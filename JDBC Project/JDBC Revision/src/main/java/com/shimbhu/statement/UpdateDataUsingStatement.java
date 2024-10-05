package com.shimbhu.statement;

import com.shimbhu.connect_database.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDataUsingStatement {

    public static void main(String[] args) {

        // getting the database connection

        Connection connection = DBUtil.provideConnection();

        // updating the data inside d_movies_tbl
        // updating data using statement

        // creating statement


        String query = "update d_movies_tbl SET movie_name='Stree-2 Horror Comedy' where movie_id = 3";

        try {

            Statement statement = connection.createStatement();

            int rowsAffected = statement.executeUpdate(query);

            if (rowsAffected > 0) {
                System.out.println("Movie data updated successfully.");
            } else {
                System.out.println("Error occurred during the update data of movies.");
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
