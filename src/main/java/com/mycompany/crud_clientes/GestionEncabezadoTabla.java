/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author usuario
 */
public class GestionEncabezadoTabla implements TableCellRenderer {
    
    private Font normal = new Font ("Monserrat", Font.PLAIN,18);
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        JComponent jcomponent = null;
        
        if( value instanceof String) {
            jcomponent = new JLabel ((String) value);
            ((JLabel)jcomponent).setHorizontalAlignment(SwingConstants.CENTER);
            ((JLabel)jcomponent).setSize(80, jcomponent.getWidth());
            ((JLabel)jcomponent).setFont(normal);
            ((JLabel)jcomponent).setPreferredSize(new Dimension(550, jcomponent.getWidth()));
        }
        
        jcomponent.setBorder(javax.swing.BorderFactory.createMatteBorder(0,0,1,1, new java.awt.Color(255,255,255)));
        jcomponent.setOpaque(true);
        jcomponent.setBackground(new Color(148,215,242));
        jcomponent.setToolTipText("Tabla Seguimiento");
        jcomponent.setForeground(Color.BLACK);

        return jcomponent;
    }
}

