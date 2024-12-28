package com.shimbhu.statement;

import com.shimbhu.database_connection.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStatement {

    public static void main(String[] args) {

        // get the connection

        // write update sql query
        String query = "delete from d_movies_tbl where movie_id = 8";

        try (Connection connection = DBUtil.getConnection(); Statement statement = connection.createStatement()) {

            int updatedRows = statement.executeUpdate(query);

            if (updatedRows > 0) {
                System.out.println(updatedRows + " rows deleted successfully.");
            } else {
                System.out.println("something went wrong during update.");
            }

            System.out.println("database disconnected successfully.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
