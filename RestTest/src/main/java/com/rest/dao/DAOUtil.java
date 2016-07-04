package com.rest.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created by Yongpeng Qu on 7/1/2016.
 */
public class DAOUtil {

    public User getUserById(String id){
        User u = new User();
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "select * from user where userId = " + id;
        Connection conn = DataSource.getConn();
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()){
                u.setUserId(rs.getString(1));
                u.setUserName(rs.getString(2));
                u.setAge(rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                DataSource.releaseConn();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return u;
    }

    public boolean deleteUserById(String id){
        return  false;
    }

    public boolean createUser(User user){
        return false;
    }

    public boolean updateUser(User user){
        return false;
    }

    public List<User> getAllUsers(){
        return  null;
    }
}
