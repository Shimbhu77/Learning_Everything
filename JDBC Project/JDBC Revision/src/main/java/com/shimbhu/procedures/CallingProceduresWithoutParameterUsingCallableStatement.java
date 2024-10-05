package com.shimbhu.procedures;

import com.shimbhu.connect_database.DBUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallingProceduresWithoutParameterUsingCallableStatement {
    public static void main(String[] args) {

        Connection connection = DBUtil.provideConnection();

        String query = "CALL getAllMovies()";

        try {

            CallableStatement callableStatement = connection.prepareCall(query);
            ResultSet resultSet = callableStatement.executeQuery();

            System.out.println("******************* RETRIEVE DATA USING CALLABLE STATEMENT ********************");

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

            callableStatement.close();

            connection.close();

            System.out.println("Database disconnected successfully.");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
