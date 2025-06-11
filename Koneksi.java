/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gudangpintar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class Koneksi {
    private static Connection conn;
    private static final String dbDriver = "com.mysql.jdbc.Driver";
    private static final String dbName = "gudangpintar";
    private static final String dbUrl = "jdbc:mysql://127.0.0.1:3306/gudangpintar";
    private static final String userName = "root";
    private static final String dbPass = "";
    
    
    public static Connection bukaKoneksi(){
        if(conn == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(dbUrl, userName, dbPass);
                
            }catch(ClassNotFoundException e){
                System.err.format("class not found");
            }catch(SQLException e){
                System.err.print(e);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return conn;
    }
}
