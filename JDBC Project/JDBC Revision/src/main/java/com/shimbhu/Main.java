package com.shimbhu;

import com.shimbhu.connect_database.DBUtil;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = DBUtil.provideConnection();
        System.out.println(connection.toString());
    }
}