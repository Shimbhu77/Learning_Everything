package com.shimbhu.prepared_statment;

import com.shimbhu.database_connection.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletePreparedStatement {

    public static void main(String[] args) {

        try (Connection connection = DBUtil.getConnection()) {

            // sql parameterized query

            String query = "delete from d_movies_tbl where movie_id = ?";

            int movieId = 9;

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {

                // set the parameters into the compiled query

                preparedStatement.setInt(1,movieId);

                // execute the prepared statement

                int affectedRows = preparedStatement.executeUpdate();

                if (affectedRows > 0) {
                    System.out.println("Movie deleted Successfully.");
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
