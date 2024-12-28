package com.shimbhu.callable_statement;

import com.shimbhu.database_connection.DBUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatementWithoutParameters {

    public static void main(String[] args) {

        try(Connection connection = DBUtil.getConnection()) {

            // before calling the procedure we have to create procedure into the database
            // procedure database creation query

            /*DELIMITER //

            CREATE PROCEDURE allMovies()
            BEGIN
            SELECT * FROM d_movies_tbl;
            END //

                    DELIMITER ;

            -- calling the procedure
            call allMovies();*/


            // write procedure call query without parameters

            String query = "CALL allMovies()";

            try(CallableStatement callableStatement = connection.prepareCall(query)){

                // execute the callable statement query

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

            }

        }catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
