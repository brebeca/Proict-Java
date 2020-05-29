package com.test.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    Connection connection=null;
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/java-app";
        String user = "app";
        String password = "app";
        Class.forName(driverName);
        if(connection==null)
          this.connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}
