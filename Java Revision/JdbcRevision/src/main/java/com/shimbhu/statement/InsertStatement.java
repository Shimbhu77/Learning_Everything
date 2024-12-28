package com.shimbhu.statement;

import com.shimbhu.database_connection.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatement {

    public static void main(String[] args) {

        try (Connection connection = DBUtil.getConnection(); Statement statement = connection.createStatement()) {

            // sql query

            String query = "insert into d_movies_tbl (movie_name,release_year, collection, budget) values ('Mission Impossible 8 Dead Recogning part 2', 2025,12000,2000)";

            // execute the statement

            int affectedRows = statement.executeUpdate(query);

            if (affectedRows > 0) {
                System.out.println("Movie inserted Successfully.");
            } else {
                System.out.println("something went wrong during query execution.");
            }

            System.out.println("database disconnected successfully.");

        } catch (RuntimeException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
