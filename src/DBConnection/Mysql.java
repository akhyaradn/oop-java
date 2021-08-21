/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;

import java.sql.*;  

/**
 *
 * @author akhyar
 */

public class Mysql implements ConnectionInterface {
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DB_PATH = "jdbc:mysql://[::1]:3306/bike";
    private String userName;
    private String password;
    private Connection con;
    private Statement stmt;
    
    public Mysql(
        String userName, 
        String password
    ) {
        this.userName = userName;
        this.password = password;
    }
    
    public void connect() throws SQLException, Exception
    {
        Class.forName(DRIVER);
        con = DriverManager.getConnection(DB_PATH, userName, password);
        stmt = con.createStatement();
    }
    
    public void close() throws SQLException, Exception
    {
        stmt.close();
        con.close();
    }
    
    public Statement getStatement()
    {
        return stmt;
    }
    
    public Connection getConnection()
    {
        return con;
    }
}
