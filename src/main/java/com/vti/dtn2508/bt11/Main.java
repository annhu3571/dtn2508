package com.vti.dtn2508.bt11;

import com.vti.dtn2508.bt11.dao.DepartmentDao;

import java.sql.*;
import java.util.Scanner;

public class Main {
    private static DepartmentDao departmentDao = new DepartmentDao();

    public static void main(String[] args) throws Exception {
        Connection  connection = departmentDao.getConnection();
        departmentDao.deleteDepartmentUsingProcedure(connection, 16);
    }

    /* Question 1: (Sử dụng Database Testing System đã xây dựng ở SQL)
    Tạo connection tới database Testing System
    In ra "Connect success!" khi kết nối thành công.*/

    public static Connection returnConnect() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/testing_system";
        String userName = "root";
        String password = "12345678";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, userName, password);
        System.out.println("Connect success!");
        return connection;
    }

    /*Question 2:ba
    Tạo method để in ra các thông tin của position gồm có id, name*/
    public static void printPositionInfor(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT position_id, position_name FROM position");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("position_id"));
            System.out.println(resultSet.getString(2));
        }
        connection.close();
    }

    /*Question 3:
    Tạo method để tạo position, user sẽ nhập vào name.*/
    public static void insertPosition(Connection connection) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập tên của chức vụ:");
        String positionName = scanner.nextLine();
        String sql = "INSERT INTO position (position_name)" +
                "VALUES                (?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,positionName);
        int effetedRecordAmount = preparedStatement.executeUpdate();
        System.out.println("Effected Record Amount: "+ effetedRecordAmount);
        connection.close();
    }

    /*Question 4:
    Tạo method để update tên của position gồm có id = 5 thành "Dev".*/

    public static void updatePosition(Connection connection) throws SQLException {
        @Deprecated
        Connection connection1 = connection;
        Statement statement = connection1.createStatement();
        int effectedRecordAmount = statement.executeUpdate("UPDATE position SET position_name = 'Scrum Master' WHERE position_id = 5 ");
        System.out.println("Effected Record Amount: "+ effectedRecordAmount);
        connection1.close();
    }

    /*Question 5:
    Tạo method để delete của position theo id và user sẽ nhập vào id*/

    public static void deletePosition(Connection connection) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào id của position cần xóa: ");
        int positionId = scanner.nextInt();
        String sql = "DELETE FROM position WHERE position_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,positionId);
        int effectedRecordAmount = preparedStatement.executeUpdate();
        System.out.println("Effected Record Amount: "+effectedRecordAmount);
    }
}
