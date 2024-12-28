package com.shimbhu.jdbc_transactions;

import com.shimbhu.database_connection.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTransactionsPreparedStatement {

    public static void main(String[] args) {

        try (Connection connection = DBUtil.getConnection()) {

            // disable the auto commit
            connection.setAutoCommit(false);

            // sql parameterized query
            String withdrawQuery = "update d_account_tbl set balance = balance - ? where account_no = 1";
            String depositQuery = "update d_account_tbl set balance = balance + ? where account_no = 2";
            String readBalanceQuery = "select * from d_account_tbl where account_no = ?";

            double amount = 3200;

            // withdrawing the amount from Shimbhu Account

            try (PreparedStatement preparedStatement = connection.prepareStatement(withdrawQuery)) {

                // set the parameters into the compiled query

                preparedStatement.setDouble(1, amount);

                // execute the prepared statement

                int affectedRows = preparedStatement.executeUpdate();

                if (affectedRows > 0) {
                    System.out.println("Withdraw amount Successfully.");
                } else {
                    System.out.println("something went wrong during query execution.");
                }
            }

            // depositing amount into the Payal Account
            try (PreparedStatement preparedStatement = connection.prepareStatement(depositQuery)) {

                // set the parameters into the compiled query

                preparedStatement.setDouble(1, amount);

                // execute the prepared statement

                int affectedRows = preparedStatement.executeUpdate();

                if (affectedRows > 0) {
                    System.out.println("Deposit amount Successfully.");
                } else {
                    System.out.println("something went wrong during query execution.");
                }
            }

            // check if I have the sufficient funds or not?

            if (!hasSufficientFunds(readBalanceQuery, amount, connection)) {
                System.out.println("Insufficient funds detected.");
                System.out.println("Rollback the entire transaction.");
                connection.rollback();
            } else {
                // commit the data
                System.out.println("Save the Commit.");
                connection.commit();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean hasSufficientFunds(String query, Double amount, Connection connection) {
        // reading balance from the Shimbhu Account
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // set the parameters into the compiled query

            int accountId = 1;
            preparedStatement.setInt(1, accountId);

            // execute the prepared statement

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("account_no");
                String accountName = resultSet.getString("account_name");
                double balance = resultSet.getDouble("balance");

                System.out.println("accountId : " + id);
                System.out.println("accountName : " + accountName);
                System.out.println("balance : " + balance);

                if (balance >= 0) {
                    return true;
                } else {

                    System.out.println(accountName + " don't have the sufficient funds : " + amount + ". Your current balance is : " + (amount+balance));

                    return false;
                }

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
}
