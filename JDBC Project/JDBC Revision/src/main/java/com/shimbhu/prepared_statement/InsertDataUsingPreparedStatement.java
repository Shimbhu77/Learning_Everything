package com.shimbhu.prepared_statement;

import com.shimbhu.connect_database.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDataUsingPreparedStatement {

    public static void main(String[] args) {

        Connection connection = DBUtil.provideConnection();

        String query = "Insert into d_movies_tbl (movie_name,release_year,collection,budget) values (?,?,?,?)";

        String movieName = "Tumbad";
        String releaseYear = "2018";
        double collection = 15;
        double budget = 10;

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, movieName);
            preparedStatement.setString(2, releaseYear);
            preparedStatement.setDouble(3, collection);
            preparedStatement.setDouble(4, budget);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("New movie data inserted successfully.");
            } else {
                System.out.println("Error occurred during data insertion of movie.");
            }

            preparedStatement.close();

            connection.close();

            System.out.println("Database disconnected successfully.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
