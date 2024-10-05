package com.shimbhu.prepared_statement;

import com.shimbhu.connect_database.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveDataUsingPreparedStatement {

    public static void main(String[] args) {

        Connection connection = DBUtil.provideConnection();

        String query = "select * from d_movies_tbl";

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("******************* RETRIEVE DATA USING PREPARED STATEMENT ********************");

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

            preparedStatement.close();

            connection.close();

            System.out.println("Database disconnected successfully.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
