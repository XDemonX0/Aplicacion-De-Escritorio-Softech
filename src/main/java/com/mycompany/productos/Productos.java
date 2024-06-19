/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productos;



import java.awt.Component;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;



/**
 *
 * @author usuario
 */
public class Productos {
    
    
    int IdProducto;
    String descripcionProducto;

 
    String descripcionLargaProducto;
    int categoriaId;
    double valorUnitario;
    int stock;
    int unidadMedidaId;
    int embalajeId;
    int alturaProducto;
    int anchuraProducto;
    String pesoProducto;
    String imagenMiniatura;
    String galeriaImagenes;
    double descuentoProducto;
    int marca;
    int estado;

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }
    
    public String getDescripcionLargaProducto() {
        return descripcionLargaProducto;
    }

    public void setDescripcionLargaProducto(String descripcionLargaProducto) {
        this.descripcionLargaProducto = descripcionLargaProducto;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getUnidadMedidaId() {
        return unidadMedidaId;
    }

    public void setUnidadMedidaId(int unidadMedidaId) {
        this.unidadMedidaId = unidadMedidaId;
    }

    public int getEmbalajeId() {
        return embalajeId;
    }

    public void setEmbalajeId(int embalajeId) {
        this.embalajeId = embalajeId;
    }

    public int getAlturaProducto() {
        return alturaProducto;
    }

    public void setAlturaProducto(int alturaProducto) {
        this.alturaProducto = alturaProducto;
    }
    
    public int getAnchuraProducto(){
        return anchuraProducto;  
    }
    
    public void setAnchuraProducto(int anchuraProducto){
        this.anchuraProducto = anchuraProducto;
    }

    public String getPesoProducto() {
        return pesoProducto;
    }

    public void setPesoProducto(String pesoProducto) {
        this.pesoProducto = pesoProducto;
    }

    public String getImagenMiniatura() {
        return imagenMiniatura;
    }

    public void setImagenMiniatura(String imagenMiniatura) {
        this.imagenMiniatura = imagenMiniatura;
    }

    public String getGaleriaImagenes() {
        return galeriaImagenes;
    }

    public void setGaleriaImagenes(String galeriaImagenes) {
        this.galeriaImagenes = galeriaImagenes;
    }

    public double getDescuentoProducto() {
        return descuentoProducto;
    }

    public void setDescuentoProducto(double descuentoProducto) {
        this.descuentoProducto = descuentoProducto;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
   
    
    public void insertarProductos(JTextField paramDescripcion, JTextField paramDescripcionLarga, JComboBox paramCategoria, JTextField paramValorUnitario, JTextField paramStock, JComboBox paramUnidadMedida, JComboBox paramEmbalaje, JTextField paramAltura, JTextField paramAnchura, JTextField paramPeso, JTextField paramImagenMini, JTextField paramGaleriaImg, JTextField paramDescuento, JComboBox paramMarca){
        
        //setIdProducto(Integer.parseInt(paramId.getText()));
        setDescripcionProducto(paramDescripcion.getText());
        setDescripcionLargaProducto(paramDescripcionLarga.getText());
        setCategoriaId(paramCategoria.getSelectedIndex());
        setValorUnitario(Double.parseDouble(paramValorUnitario.getText()));
        setStock(Integer.parseInt(paramStock.getText()));
        setUnidadMedidaId(paramUnidadMedida.getSelectedIndex());
        setEmbalajeId(paramEmbalaje.getSelectedIndex());
        setAlturaProducto(Integer.parseInt(paramAltura.getText()));
        setAnchuraProducto(Integer.parseInt(paramAnchura.getText()));
        setPesoProducto(paramPeso.getText());
        setImagenMiniatura(paramImagenMini.getText());
        setGaleriaImagenes(paramGaleriaImg.getText());
        setDescuentoProducto(Double.parseDouble(paramDescuento.getText()));
        setMarca(paramMarca.getSelectedIndex());
        
        Conexion conn = new Conexion();
        
        String consulta = "insert into producto(descripcion_producto,descripcion_larga_producto,categoria_id,valor_unitario,stock,unidad_medida_id,embalaje_id,altura_producto,anchura_producto,peso_producto,imagen_miniatura_producto,galeria_imagenes_producto,descuento_producto,marca_id,estado) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,1);";
        try {
            
            PreparedStatement ps = conn.establecerConexion().prepareStatement(consulta);
            //ps.setInt(1,getIdProducto());
            ps.setString(1,getDescripcionProducto());
            ps.setString(2,getDescripcionLargaProducto());
            ps.setInt(3,getCategoriaId());
            ps.setDouble(4,getValorUnitario());
            ps.setInt(5,getStock());
            ps.setInt(6,getUnidadMedidaId());
            ps.setInt(7,getEmbalajeId());
            ps.setInt(8,getAlturaProducto());
            ps.setInt(9,getAnchuraProducto());
            ps.setString(10,getPesoProducto());
            ps.setString(11,getImagenMiniatura());
            ps.setString(12,getGaleriaImagenes());
            ps.setDouble(13,getDescuentoProducto());
            ps.setInt(14,getMarca());
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Se inserto correctamente el producto");
                
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error al insertar el producto: " + e.toString());
        }

        
    }
    
    public void MostrarProductos(JTable paramMostrarProductos){
        Conexion conn = new Conexion();
        Object[] columnNames = {"ID", "Descripcion","Descripcion Larga","Categoria","Valor Unitario","Stock","Unidad Medida","Embalaje","Altura","Anchura","Peso","Imagen","Galeria","Descuento","Marca","Estado"};
        ModeloTabla modelo = new ModeloTabla(columnNames,0);
        
        String sql = "";
        
        paramMostrarProductos.setModel(modelo);
        
        sql = "select p.id_producto, p.descripcion_producto, p.descripcion_larga_producto, c.nombre_categoria, p.valor_unitario, p.stock, u.descripcion_unidad_de_medida, e.descripcion_embalaje, p.altura_producto, p.anchura_producto, p.peso_producto, p.imagen_miniatura_producto, p.galeria_imagenes_producto, p.descuento_producto, m.nombre_marca, p.estado from producto p " +
              "join categoria c on p.categoria_id = c.id_categoria " +
              "join unidad_medida u on p.unidad_medida_id = u.id_unidad_medida " +
              "join embalaje e on p.embalaje_id = e.id_embalaje " +
              "join marca m on p.marca_id = m.id_marca " +
              "order by p.id_producto asc;";

        
        String[] datos = new String[16];
        Statement st;
        try {
            st = conn.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                datos[6] = rs.getString(7);
                datos[7] = rs.getString(8);
                datos[8] = rs.getString(9);
                datos[9] = rs.getString(10);
                datos[10] = rs.getString(11);
                datos[11] = rs.getString(12);
                datos[12] = rs.getString(13);
                datos[13] = rs.getString(14);
                datos[14] = rs.getString(15);
                
                String estado = rs.getString(16);
                datos[15] = (estado.equals("1")) ? "Activo" : "Desactivado";
                
                modelo.addRow(datos);
            }
            paramMostrarProductos.setModel(modelo);
            
            JTableHeader th = paramMostrarProductos.getTableHeader();
            th.setDefaultRenderer(new GestionEncabezadoTabla());

            // Configurar renderizador de celdas
            for (int i = 0; i < paramMostrarProductos.getColumnCount(); i++) {
                if (i == 0 || i == 4 || i == 5 || i == 8 || i == 9 || i == 10 || i == 13) { // columnas numericas
                    paramMostrarProductos.getColumnModel().getColumn(i).setCellRenderer(new GestionCeldas("numerico"));
                } else {
                    paramMostrarProductos.getColumnModel().getColumn(i).setCellRenderer(new GestionCeldas("texto"));
                }
            }
            
            TableColumnModel columnModel = paramMostrarProductos.getColumnModel();
            for (int i = 0; i < columnNames.length; i++) {
                int maxWidth = 1500;
                for (int j = 0; j < modelo.getRowCount(); j++) {
                    TableCellRenderer renderer = paramMostrarProductos.getCellRenderer(j, i);
                    Component comp = paramMostrarProductos.prepareRenderer(renderer, j, i);
                    int preferredWidth = comp.getPreferredSize().width;
                    maxWidth = Math.max(maxWidth, preferredWidth);
                }
                columnModel.getColumn(i).setPreferredWidth(maxWidth);
            }
            paramMostrarProductos.revalidate();
            paramMostrarProductos.repaint();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se pudo mostrar los registros, error: " +e.toString());
        }
        
    }
    
    public void SeleccionarProducto(JTable paramTablaProductos, JTextField paramId,JTextField paramDescripcion, JTextField paramDescripcionLarga, JComboBox paramCategoria, JTextField paramValorUnitario, JTextField paramStock, JComboBox paramUnidadMedida, JComboBox paramEmbalaje, JTextField paramAltura, JTextField paramAnchura, JTextField paramPeso, JTextField paramImagenMini, JTextField paramGaleriaImg, JTextField paramDescuento, JComboBox paramMarca, JTextField paramEstado){
        try {
            int fila = paramTablaProductos.getSelectedRow();
            if (fila >= 0){
                
                paramId.setText(paramTablaProductos.getValueAt(fila,0).toString());
                paramDescripcion.setText(paramTablaProductos.getValueAt(fila,1).toString());
                paramDescripcionLarga.setText(paramTablaProductos.getValueAt(fila,2).toString());
                paramCategoria.setSelectedItem(paramTablaProductos.getValueAt(fila,3).toString());
                paramValorUnitario.setText(paramTablaProductos.getValueAt(fila,4).toString());
                paramStock.setText(paramTablaProductos.getValueAt(fila,5).toString());
                paramUnidadMedida.setSelectedItem(paramTablaProductos.getValueAt(fila,6).toString());
                paramEmbalaje.setSelectedItem(paramTablaProductos.getValueAt(fila,7).toString());
                paramAltura.setText(paramTablaProductos.getValueAt(fila,8).toString());
                paramAnchura.setText(paramTablaProductos.getValueAt(fila,9).toString());
                paramPeso.setText(paramTablaProductos.getValueAt(fila,10).toString());
                paramImagenMini.setText(paramTablaProductos.getValueAt(fila,11).toString());
                paramGaleriaImg.setText(paramTablaProductos.getValueAt(fila,12).toString());
                paramDescuento.setText(paramTablaProductos.getValueAt(fila,13).toString());
                paramMarca.setSelectedItem(paramTablaProductos.getValueAt(fila,14).toString());
                paramEstado.setText(paramTablaProductos.getValueAt(fila,15).toString());
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Fila no seleccionada");
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error de seleccion: " + e.toString());
            
        }
    }
        
    public void EditarProductos(JTextField paramId,JTextField paramDescripcion, JTextField paramDescripcionLarga, JComboBox<String> paramCategoria, JTextField paramValorUnitario, JTextField paramStock, JComboBox<String> paramUnidadMedida, JComboBox paramEmbalaje, JTextField paramAltura, JTextField paramAnchura, JTextField paramPeso, JTextField paramImagenMini, JTextField paramGaleriaImg, JTextField paramDescuento, JComboBox paramMarca){
        setIdProducto(Integer.parseInt(paramId.getText()));
        setDescripcionProducto(paramDescripcion.getText());
        setDescripcionLargaProducto(paramDescripcionLarga.getText());
        setCategoriaId(Integer.parseInt(String.valueOf(paramCategoria.getSelectedIndex())));
        setValorUnitario(Double.parseDouble(paramValorUnitario.getText()));
        setStock(Integer.parseInt(paramStock.getText()));
        setUnidadMedidaId(Integer.parseInt(String.valueOf(paramUnidadMedida.getSelectedIndex())));
        setEmbalajeId(Integer.parseInt(String.valueOf(paramEmbalaje.getSelectedIndex())));
        setAlturaProducto(Integer.parseInt(paramAltura.getText()));
        setAnchuraProducto(Integer.parseInt(paramAnchura.getText()));
        setPesoProducto(paramPeso.getText());
        setImagenMiniatura(paramImagenMini.getText());
        setGaleriaImagenes(paramGaleriaImg.getText());
        setDescuentoProducto(Double.parseDouble(paramDescuento.getText()));
        setMarca(Integer.parseInt(String.valueOf(paramMarca.getSelectedIndex())));
   
        
        Conexion conn = new Conexion();
        String consulta = "update producto set descripcion_producto = ?, descripcion_larga_producto = ?, categoria_id = ?, valor_unitario = ?, stock = ?, unidad_medida_id = ?, embalaje_id = ?, altura_producto = ?, anchura_producto = ?, peso_producto = ?, imagen_miniatura_producto = ?, galeria_imagenes_producto = ?, descuento_producto = ?, marca_id = ? where id_producto = ?; ";
        
        try {
            PreparedStatement ps = conn.establecerConexion().prepareStatement(consulta);
            ps.setString(1,getDescripcionProducto());
            ps.setString(2,getDescripcionLargaProducto());
            ps.setInt(3,getCategoriaId());
            ps.setDouble(4,getValorUnitario());
            ps.setInt(5,getStock());
            ps.setInt(6,getUnidadMedidaId());
            ps.setInt(7,getEmbalajeId());
            ps.setInt(8,getAlturaProducto());
            ps.setInt(9,getAnchuraProducto());
            ps.setString(10,getPesoProducto());
            ps.setString(11,getImagenMiniatura());
            ps.setString(12,getGaleriaImagenes());
            ps.setDouble(13,getDescuentoProducto());
            ps.setInt(14,getMarca());
            ps.setInt(15, getIdProducto());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificacion exitosa");
   
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se modifico, error: " + e.toString());
            
        }
        
    }
    
    public void DesactivarProducto(JTextField paramId){
        setIdProducto(Integer.parseInt(paramId.getText()));
        
        Conexion conn = new Conexion();
        String consulta = "update producto set estado = 0 where id_producto = ?;";
        try {
            PreparedStatement ps = conn.establecerConexion().prepareStatement(consulta);
            ps.setInt(1, getIdProducto());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Producto desactivado correctamente");

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al desactivar producto: " + e.toString());
            
        }
    }
    public void ActivarProducto(JTextField paramId){
        setIdProducto(Integer.parseInt(paramId.getText()));
        
        Conexion conn = new Conexion();
        String consulta = "update producto set estado = 1 where id_producto = ?;";
        try {
            PreparedStatement ps = conn.establecerConexion().prepareStatement(consulta);
            ps.setInt(1, getIdProducto());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Producto activado correctamente");

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al activar producto: " + e.toString());
            
        }
    }
    public void CargarComboBox(String table,String campoId, String campoNombre, JComboBox paramCombo) {
        Conexion conn = new Conexion();
        String consulta = "SELECT " + campoId + "," + campoNombre + " FROM " + table ;
        Statement st;
        try  {
            st = conn.establecerConexion().createStatement();
            ResultSet rs = st.executeQuery(consulta);
            paramCombo.addItem("Seleccionar");
            while (rs.next()) {
                paramCombo.addItem(rs.getString(campoNombre));
            }
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.toString() );
        }
    }
    
    public void LimpiarCampos(JTextField paramId,JTextField paramDescripcion, JTextField paramDescripcionLarga,JComboBox paramCategoria, JTextField paramValorUnitario, JTextField paramStock, JComboBox paramUnidadMedida, JComboBox paramEmbalaje, JTextField paramAltura, JTextField paramAnchura, JTextField paramPeso, JTextField paramImagenMini, JTextField paramGaleriaImg, JTextField paramDescuento, JComboBox paramMarca, JTextField paramEstado){
        
        paramId.setText("");
        paramDescripcion.setText("");
        paramDescripcionLarga.setText("");
        paramValorUnitario.setText("");
        paramStock.setText("");
        paramAltura.setText("");
        paramAnchura.setText("");
        paramPeso.setText("");
        paramImagenMini.setText("");
        paramGaleriaImg.setText("");
        paramDescuento.setText("");
        paramEstado.setText("");
        paramCategoria.setSelectedIndex(0);
        paramUnidadMedida.setSelectedIndex(0);
        paramEmbalaje.setSelectedIndex(0);
        paramMarca.setSelectedIndex(0);  
    }

}
    

        
    
    

    
