package com.mycompany.marca;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class c_marca {

    int codigo;
    String Nombre;
    int estado;

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

   public void insertarMarca(JTextField paramNombreMarca) {
    setNombre(paramNombreMarca.getText());
    String texto = paramNombreMarca.getText();
    Database objetoConexion = new Database();
    String consulta = "insert into marca (nombre_marca, estado) values (?,?);";

    try {
        CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
        cs.setString(1, getNombre());
        cs.setInt(2, 1);
        cs.execute();
        JOptionPane.showMessageDialog(null, "Se insertaron correctamente los datos");
        paramNombreMarca.setText("");  //
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Los datos no se insertaron correctamente, error: " + e.toString());
    }
}

    public void MostrarMarca(JTable paramtablaMarca) {
        Database objetoConexion = new Database();
        Object[] columnNames = {"Id", "Nombre", "Estado"};
        ModeloTabla modelo = new ModeloTabla(columnNames, 0);
        String sql = "select * from marca";
        String[] datos = new String[3];
        Statement st;

        try {
            st = objetoConexion.estableceConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            paramtablaMarca.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros: " + e.toString());
        }

        paramtablaMarca.getTableHeader().setDefaultRenderer(new GestionEncabezadoTabla());
        initializeTable(paramtablaMarca);
    }

    public void initializeTable(JTable table) {
        table.getColumnModel().getColumn(0).setCellRenderer(new GestionCeldas("numerico"));
        table.getColumnModel().getColumn(1).setCellRenderer(new GestionCeldas("texto"));
        table.getColumnModel().getColumn(2).setCellRenderer(new GestionCeldas("texto"));
    }

    public void SeleccionarMarca(JTable paramtablaMarca, JTextField paramId, JTextField paramNombreMarca) {
        try {
            int fila = paramtablaMarca.getSelectedRow();

            if (fila >= 0) {
                paramId.setText((paramtablaMarca.getValueAt(fila, 0).toString()));
                paramNombreMarca.setText((paramtablaMarca.getValueAt(fila, 1).toString()));
            } else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de selección, error: " + e.toString());
        }
    }

    public void ModificarMarca(JTextField paramCodigo, JTextField paramNombre) {
        setCodigo(Integer.parseInt(paramCodigo.getText()));
        setNombre(paramNombre.getText());
        Database objetoConexion = new Database();
        String consulta = "UPDATE marca SET nombre_marca = ? WHERE id_marca = ?;";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            cs.setString(1, getNombre());
            cs.setInt(2, getCodigo());
            cs.execute();
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
            paramNombre.setText("");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se actualizaron los datos: " + e.toString());
        }
    }

    public void EstadoMarca(int codigo, int nuevoEstado) {
        Database objetoConexion = new Database();
        String consulta = "UPDATE marca SET estado = ? WHERE id_marca = ?;";

        try {
            CallableStatement cs = objetoConexion.estableceConexion().prepareCall(consulta);
            cs.setInt(1, nuevoEstado);
            cs.setInt(2, codigo);
            cs.execute();
            JOptionPane.showMessageDialog(null, "Estado actualizado correctamente"); 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el estado: " + e.toString());
        }
    }
}
