/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Conexion {
    Connection conectar = null;
    String host = "localhost";
    String user = "root";
    String password = "";
    String database = "adso8com_softech_db";
    int port = 3306;
    
    String cadena = "jdbc:mysql://"+host+":"+port+"/"+database;
    
    public Connection establecerConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, user, password);
            /*JOptionPane.showMessageDialog(null, "La conexion se ha realizado con exito");*/
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al conectarse a la base de datos "+ e.toString());
            
        }
        return conectar;
    }
    
} 

