package com.mycompany.marca;

import javax.swing.table.DefaultTableModel;

public class ModeloTabla extends DefaultTableModel {
    public ModeloTabla(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false; 
    }
}
