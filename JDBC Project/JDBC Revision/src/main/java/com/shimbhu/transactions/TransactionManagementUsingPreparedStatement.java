package com.shimbhu.transactions;

import com.shimbhu.connect_database.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionManagementUsingPreparedStatement {

    public static void main(String[] args) {

        Connection connection = DBUtil.provideConnection();

        int withdrawAccountNo = 1;
        int depositAccountNo = 2;
        double amount = 1100;

        try {

            // disable the auto commit
            connection.setAutoCommit(false);

            String withdrawQuery = "update accounts set balance = balance - ? where account_no = ?";
            String depositQuery = "update accounts set balance = balance + ? where account_no = ?";

            // withdraw prepare statement

            PreparedStatement preparedStatementWithdraw = connection.prepareStatement(withdrawQuery);

            preparedStatementWithdraw.setDouble(1, amount);
            preparedStatementWithdraw.setInt(2, withdrawAccountNo);

            // deposit prepare statement

            PreparedStatement preparedStatementDeposit = connection.prepareStatement(depositQuery);

            preparedStatementDeposit.setDouble(1, amount);
            preparedStatementDeposit.setInt(2, depositAccountNo);

            // does withdraw account has sufficient balance to commit the transaction

            if (hasSufficientBalance(connection, withdrawAccountNo, amount)) {

                preparedStatementWithdraw.executeUpdate();
                preparedStatementDeposit.executeUpdate();

                connection.commit();
                System.out.println("Transaction completed successfully.");
            } else {
                System.out.println("rolling back the transaction.");
                connection.rollback();
                System.out.println("Can not commit the transaction because you don't have sufficient funds to complete this transaction.");
            }

            preparedStatementDeposit.close();
            preparedStatementWithdraw.close();


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
                connection.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    private static boolean hasSufficientBalance(Connection connection, Integer accountNo, Double balance) {

        String query = "Select * from accounts where account_no = ? AND accounts.balance >= ?";

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setInt(1, accountNo);
            preparedStatement.setDouble(2, balance);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Account has sufficient balance : " + resultSet.getDouble("balance"));
                preparedStatement.close();
                return true;
            } else {
                System.out.println("account does not have the sufficient funds to commit this transaction.");
                preparedStatement.close();
                return false;
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
