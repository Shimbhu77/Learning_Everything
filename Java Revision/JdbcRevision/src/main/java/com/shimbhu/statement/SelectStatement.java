package com.shimbhu.statement;

import com.shimbhu.database_connection.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStatement {

    public static void main(String[] args) {

        try (Connection connection = DBUtil.getConnection(); Statement statement = connection.createStatement()) {

            // sql query

            String query = "select * from d_movies_tbl";

            // execute the statement

            ResultSet resultSet = statement.executeQuery(query);

            System.out.println("********* Fetching Data Using Statement ********");

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

            // using column index

            /*while(resultSet.next())
            {
                // getting data using column index
                int movieId = resultSet.getInt(1);
                String movieName = resultSet.getString(2);
                int releaseYear = resultSet.getInt(3);
                double collection = resultSet.getInt(4);
                double budget = resultSet.getInt(5);


                System.out.println("**********************************************");

                System.out.println("movieId : "+movieId);
                System.out.println("movieName : "+movieName);
                System.out.println("releaseYear : "+releaseYear);
                System.out.println("collection : "+collection);
                System.out.println("budget : "+budget);

                System.out.println("**********************************************");
            }*/

            System.out.println("database disconnected successfully.");

        } catch (RuntimeException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
