package com.mycompany.marca;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

public class GestionEncabezadoTabla implements TableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        JComponent jcomponent = null;
        
        if (value instanceof String) {
            jcomponent = new JLabel((String) value);
            ((JLabel) jcomponent).setHorizontalAlignment(SwingConstants.CENTER);
            ((JLabel) jcomponent).setSize(30, jcomponent.getWidth());   
            ((JLabel) jcomponent).setPreferredSize(new Dimension(6, jcomponent.getWidth()));
        }         
   
        jcomponent.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new Color(255, 255, 255)));
        jcomponent.setOpaque(true);
        jcomponent.setBackground(new Color(148, 215, 242));
        jcomponent.setToolTipText("Tabla Seguimiento");
        jcomponent.setForeground(Color.black);
        
        return jcomponent;
    }
}
