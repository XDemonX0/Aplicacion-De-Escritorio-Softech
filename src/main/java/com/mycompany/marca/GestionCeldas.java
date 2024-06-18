package com.mycompany.marca;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class GestionCeldas extends DefaultTableCellRenderer {
    private String tipo = "text";
    private Font normal = new Font("Verdana", Font.PLAIN, 12);
    private JLabel label = new JLabel();
    private Color colorFondoPar = Color.WHITE;
    private Color colorFondoImpar = new Color(187, 232, 242);
    Color colorFondoSeleccion=new Color( 204, 204 ,204);
    

    public GestionCeldas() {
    }

    public GestionCeldas(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
       
        if (row % 2 == 0) {
            this.setBackground(colorFondoPar);
        } else {
            this.setBackground(colorFondoImpar);
        }
        if (selected) {                
            this.setBackground(colorFondoSeleccion );   
        }
          
        if (tipo.equals("texto")) {
            this.setHorizontalAlignment(JLabel.CENTER);
            this.setText((String) value);
            this.setFont(normal);
            return this;
        }
        if (tipo.equals("numerico")) {
            this.setHorizontalAlignment(JLabel.CENTER);
            this.setText((String) value);
            this.setForeground(Color.DARK_GRAY);
            return this;
        }
        return this;
    }
}