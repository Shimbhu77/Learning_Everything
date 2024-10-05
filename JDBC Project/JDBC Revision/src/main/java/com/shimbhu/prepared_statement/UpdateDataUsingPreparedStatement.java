package com.shimbhu.prepared_statement;

import com.shimbhu.connect_database.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDataUsingPreparedStatement {

    public static void main(String[] args) {

        Connection connection = DBUtil.provideConnection();

        String query = "update d_movies_tbl SET release_year = ? , collection = ? where movie_name = ?";

        // we can take these input from user as well using Scanner class
        String movieName = "Tumbad";
        String releaseYear = "2024";
        double collection = 30;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, releaseYear);
            preparedStatement.setDouble(2, collection);
            preparedStatement.setString(3, movieName);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Movie data updated successfully.");
            } else {
                System.out.println("Error occurred during data updation of movie.");
            }

            preparedStatement.close();

            connection.close();

            System.out.println("Database disconnected successfully.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
