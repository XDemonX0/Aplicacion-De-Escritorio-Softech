/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud_clientes;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author David
 */
public class FormIntercalado extends DefaultTableCellRenderer{
    
    public Component getTableCellRendererComponent(JTable table,
                                                   Object value,
                                                   boolean isSelected,
                                                   boolean hasFocus,
                                                   int row,
                                                   int column){
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        if(evaluarPar(row)){
            this.setBackground(Color.WHITE);
        }
        else{
            this.setBackground(Color.decode("#94D7F2"));
        }
        
        return this;
    }
    
    
    public boolean evaluarPar(int num){
        return(num % 2 == 0);
    }
    
}
