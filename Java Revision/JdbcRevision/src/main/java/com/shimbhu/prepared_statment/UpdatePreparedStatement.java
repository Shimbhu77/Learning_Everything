package com.shimbhu.prepared_statment;

import com.shimbhu.database_connection.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePreparedStatement {

    public static void main(String[] args) {

        try (Connection connection = DBUtil.getConnection()) {

            // sql parameterized query

            String query = "update d_movies_tbl set movie_name = ?, release_year = ? where movie_id = ?";

            int movieId = 9;
            String movieName = "Tumbad Re-release";
            int releaseYear = 2024;

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {

                // set the parameters into the compiled query

                preparedStatement.setString(1, movieName);
                preparedStatement.setInt(2, releaseYear);
                preparedStatement.setInt(3,movieId);

                // execute the prepared statement

                int affectedRows = preparedStatement.executeUpdate();

                if (affectedRows > 0) {
                    System.out.println("Movie updated Successfully.");
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
