package com.vti.dtn2508.bai11;

import java.sql.*;

public class bai11 {

    public static void main(String[] args) throws SQLException {
       Connection connection = getConnection();
        insertGroupByPrepareState(connection, "New Department2");
        connection.close();
    }

    private static void insertGroupByPrepareState(Connection connection, String departmentName) throws SQLException {
        String insertGroupSql = "INSERT INTO `department` (`department_name`) VALUES ( ? )";
        PreparedStatement statement = connection.prepareStatement(insertGroupSql);
        statement.setString(2, departmentName);
        int rowEffect =  statement.executeUpdate();
        System.out.println("So ban ghi duoc insert la: " + rowEffect);
    }

    private static void insertGroup(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String insertGroupSql = "INSERT INTO `department` (`department_name`) " +
                                             "VALUES ('NEW GROUP')";
        int rowEffect =  statement.executeUpdate(insertGroupSql);
        System.out.println("So ban ghi duoc insert la: " + rowEffect);
    }

    private static void selectAccount(Connection connection) throws SQLException {
        // execute
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("Select account_id, email from account limit 10");
        int i = 1;
        while (resultSet.next()) {
            System.out.println("Phan thu tu " + i + ": account_id = "
                    + resultSet.getString("account_id")
                    + ", " + resultSet.getString("email"));
            i++;
        }
    }

    private static Connection getConnection () throws SQLException {
        // conect
        String dbUrl = "jdbc:mysql://localhost:3306/testing_system";
        String userName = "root";
        String passWord = "12345678";
        Connection connection = DriverManager.getConnection(dbUrl, userName, passWord);
        System.out.println("Connect successfully!");
        return connection;
    }
}
