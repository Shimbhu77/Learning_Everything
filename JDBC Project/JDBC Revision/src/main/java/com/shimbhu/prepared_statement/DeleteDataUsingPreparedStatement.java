package com.shimbhu.prepared_statement;

import com.shimbhu.connect_database.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDataUsingPreparedStatement {

    public static void main(String[] args) {

        Connection connection = DBUtil.provideConnection();

        String query = "delete from d_movies_tbl where movie_name = ?";

        // we can take these input from user as well using Scanner class

        // failing with this name
//        String movieName = "Jigra Alia Bhatt";

//        correct name
        String movieName = "Jigra";

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, movieName);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Movie data deleted successfully.");
            } else {
                System.out.println("Error occurred during data deletion of movie.");
            }

            preparedStatement.close();

            connection.close();

            System.out.println("Database disconnected successfully.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
