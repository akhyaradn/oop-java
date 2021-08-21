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
public interface ConnectionInterface {
    public void connect() throws Exception;
    public void close() throws Exception;
    public Statement getStatement();
    public Connection getConnection();
}
