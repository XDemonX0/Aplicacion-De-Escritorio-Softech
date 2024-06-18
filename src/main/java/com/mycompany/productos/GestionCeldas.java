/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author usuario
 */
public class GestionCeldas extends DefaultTableCellRenderer{
    
    private String tipo = "text";
    
    private Font normal = new Font ("Monserrat", Font.PLAIN,18);
    private Color colorFondoPar = Color.WHITE;
    private Color colorFondoImpar = new Color(187, 232, 242);
    private Color colorFondoSeleccion = new Color(140,140,140);
    
    
    public GestionCeldas(){
        
    }
    public GestionCeldas(String tipo){
        this.tipo = tipo;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column){
        
        Component cell = super.getTableCellRendererComponent(table , value, selected, focused, row, column);
        
        if (selected) {
            cell.setBackground(colorFondoSeleccion);
        } else {
            if (row % 2 == 0) {
                cell.setBackground(colorFondoPar);
            } else {
                cell.setBackground(colorFondoImpar);
            }
        }
        
        if(tipo.equals("texto")){
            this.setHorizontalAlignment(JLabel.LEFT);
            this.setText((String) value);
            this.setFont(normal);
            
            return this;
        }
        
        if(tipo.equals("numerico")){ 
            this.setHorizontalAlignment(JLabel.CENTER);
            this.setText((String) value);
            this.setForeground(Color.black);
            this.setFont(normal);
            
            return this;
        }
        
        return this;
    }
}
