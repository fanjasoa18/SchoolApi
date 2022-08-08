package com.example.schoolapigroupone.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DBConnect {
    /**
     * Connect to the database
     *
     * @param url      url to the db
     * @param username
     * @param password
     * @return Connection
     */

    public Connection connect(String url, String username, String password) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("Error occurred during connection");
            throw new RuntimeException(e);
        }

        return con;
    }
}
