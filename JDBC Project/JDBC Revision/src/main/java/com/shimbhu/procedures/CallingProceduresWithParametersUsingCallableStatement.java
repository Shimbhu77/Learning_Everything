package com.shimbhu.procedures;

import com.shimbhu.connect_database.DBUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class CallingProceduresWithParametersUsingCallableStatement {
    public static void main(String[] args) {

        Connection connection = DBUtil.provideConnection();

        String query = "CALL getAllMoviesByReleaseYearWithINAndOUT(?,?)";
        String year = "2023";
        try {

            CallableStatement callableStatement = connection.prepareCall(query);
            callableStatement.setString(1,year); // IN parameter
            callableStatement.registerOutParameter(2, Types.INTEGER); // OUT parameter

            ResultSet resultSet = callableStatement.executeQuery();

            int moviesCount = callableStatement.getInt(2);

            System.out.println("Total movies count "+moviesCount+" in year "+year);

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
