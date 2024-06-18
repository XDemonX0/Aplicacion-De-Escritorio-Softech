/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.marca;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Camila
 */
public class Database {
         Connection  conectar = null;
    
        String user = "root";
        String password = "";
        String db = "adso8com_softech_db";
        String host = "localhost";
        String port = "3306";
        
        
        String cadena = "jdbc:mysql://"+host+":"+port+"/"+db;
        
        public Connection estableceConexion() {
           try {
               Class.forName("com.mysql.cj.jdbc.Driver");
               conectar = DriverManager.getConnection(cadena,user,password);
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,"Error al conectarse a la base de datos:"+ e.toString());
               
        }
           return conectar;
        
        }

    
}
