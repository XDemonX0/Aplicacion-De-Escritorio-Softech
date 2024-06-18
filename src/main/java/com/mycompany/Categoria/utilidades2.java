package com.mycompany.Categoria;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class utilidades2 {
    public class GestionCeldas extends DefaultTableCellRenderer {

        private String tipo = "texto";

        private Font normal = new Font("Verdana", Font.PLAIN, 12);
        private Font bold = new Font("Verdana", Font.BOLD, 12);

        public GestionCeldas() {
        }

        public GestionCeldas(String tipo) {
            this.tipo = tipo;
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {

            Color colorFondoPorDefecto = new Color(148, 215, 242);
            Color colorAlternativo =Color.WHITE;
            Color colorFondoSeleccion = new Color(204, 204, 204);

            if (row % 2 == 0) {
                this.setBackground(colorFondoPorDefecto);
            } else {
                this.setBackground(colorAlternativo);
            }

            if (selected) {
                this.setBackground(colorFondoSeleccion);
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
                this.setForeground(selected ? new Color(255, 255, 255) : new Color(32, 117, 32));
                this.setFont(bold);
                return this;
            }

            return this;
        }
    }
}
