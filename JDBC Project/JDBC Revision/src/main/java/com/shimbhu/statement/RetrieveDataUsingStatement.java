package com.shimbhu.statement;

import com.shimbhu.connect_database.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveDataUsingStatement {

    public static void main(String[] args) {

        // creating new connection with database

        Connection connection = DBUtil.provideConnection();

        // reading data from database using select statements from d_movies_tbl

        // using here Statement interface

        try {

            Statement statement = connection.createStatement();

            String query = "select * from d_movies_tbl";

            ResultSet resultSet = statement.executeQuery(query);

            System.out.println("******************** RETRIEVE DATA USING STATEMENT *********************");

            while(resultSet.next())
            {
                int movieId = resultSet.getInt("movie_id");
                String movieName = resultSet.getString("movie_name");
                String releaseYear = resultSet.getString("release_year");
                double collection = resultSet.getDouble("collection");
                double budget = resultSet.getDouble("budget");

                System.out.println("================================================================");

                System.out.println("Movie ID : "+movieId);
                System.out.println("Movie Name : "+movieName);
                System.out.println("Movie Release Year : "+releaseYear);
                System.out.println("Movie Collection in Crores : "+collection);
                System.out.println("Movie Budget in Crores : "+budget);

                System.out.println("================================================================");
            }

            // closing statement
            statement.close();

            // closing database connection
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
