/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productos;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class ModeloTabla extends DefaultTableModel{
    public ModeloTabla(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false; 
    }
}
