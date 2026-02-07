package com.vti.springcourse.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/testing_system";
        String user_name = "root";
        String password = "12345678";
        Connection connection = DriverManager.getConnection(url, user_name, password);
        System.out.println("Connection success");
        return connection;
    }
}
