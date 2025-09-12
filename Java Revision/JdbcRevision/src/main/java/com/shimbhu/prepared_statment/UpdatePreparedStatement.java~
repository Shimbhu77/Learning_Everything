package com.shimbhu.prepared_statment;

import com.shimbhu.database_connection.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPreparedStatement {

    public static void main(String[] args) {

        try (Connection connection = DBUtil.getConnection()) {

            // sql parameterized query

            String query = "insert into d_movies_tbl (movie_name,release_year, collection, budget) values (?,?,?,?)";

            String movieName = "Tumbad";
            int releaseYear = 2018;
            double collection = 40;
            double budget = 10;

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {

                // set the parameters into the compiled query

                preparedStatement.setString(1, movieName);
                preparedStatement.setInt(2, releaseYear);
                preparedStatement.setDouble(3, collection);
                preparedStatement.setDouble(4, budget);

                // execute the prepared statement

                int affectedRows = preparedStatement.executeUpdate();

                if (affectedRows > 0) {
                    System.out.println("Movie inserted Successfully.");
                } else {
                    System.out.println("something went wrong during query execution.");
                }

                System.out.println("database disconnected successfully.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
