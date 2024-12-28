package com.shimbhu.prepared_statment;

import com.shimbhu.database_connection.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectPreparedStatement {

    public static void main(String[] args) {

        try (Connection connection = DBUtil.getConnection()) {

            // sql parameterized query

            String query = "select * from d_movies_tbl";

            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {

                // set the parameters into the compiled query

                // execute the prepared statement

                ResultSet resultSet = preparedStatement.executeQuery();

                System.out.println("********* Fetching Data Using Prepared Statement ********");

                // using column name
                while(resultSet.next())
                {
                    // getting data using column name
                    int movieId = resultSet.getInt("movie_id");
                    String movieName = resultSet.getString("movie_name");
                    int releaseYear = resultSet.getInt("release_year");
                    double collection = resultSet.getInt("collection");
                    double budget = resultSet.getInt("budget");


                    System.out.println("**********************************************");

                    System.out.println("movieId : "+movieId);
                    System.out.println("movieName : "+movieName);
                    System.out.println("releaseYear : "+releaseYear);
                    System.out.println("collection : "+collection);
                    System.out.println("budget : "+budget);

                    System.out.println("**********************************************");
                }

                // it should be inside the finally block
                System.out.println("database disconnected successfully.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
