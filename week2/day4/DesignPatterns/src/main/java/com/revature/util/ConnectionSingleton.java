package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class will create and manage a singleton of type Connection
 */
public class ConnectionSingleton {

    private static final String url = "jdbc:postgresql://enterprise.chenkhwxqq2k.us-east-2.rds.amazonaws.com:5432/postgres";
    private static final String username = "postgres";
    private static final String password = "1324Pass!";

    private static Connection instance;

    private ConnectionSingleton(

    ){}

    public static Connection getInstance(){
        if(instance == null){
            try {
                Class.forName("org.postgresql.Driver");

                instance = DriverManager.getConnection(url, username, password);
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }


}
