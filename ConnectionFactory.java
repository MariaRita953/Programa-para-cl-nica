/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ary
 */
public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3307/clinica_medica";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection conectar(){
    try{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }catch(SQLException e){
         e.printStackTrace();
            return null;
    }
  }
}

