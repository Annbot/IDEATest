package com.rest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Yongpeng Qu on 7/1/2016.
 */
public class DataSource {
    private static Connection conn = null;

    public static Connection getConn() {
        try {
            if (conn == null || conn.isClosed()) {
                conn = connToMysql();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void releaseConn() {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        conn = null;
    }

    private static Connection connToMysql() {
        String driver="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://169.50.101.160:6603/test?useUnicode=true&characterEncoding=UTF-8";
        String userName ="root";
        String passWord="123456";
        try {
            Class.forName(driver);
            conn= DriverManager.getConnection(url, userName, passWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
