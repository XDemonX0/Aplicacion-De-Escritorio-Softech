
package com.mycompany.productos;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;





public class FormProductos extends javax.swing.JFrame {
    


    public FormProductos() {
        initComponents();
        
        Font montserratFont = new Font("Montserrat", Font.PLAIN, 12);
        
        Productos objetoProducto = new Productos();
        
    
        
        objetoProducto.CargarComboBox("categoria", "id_categoria","nombre_categoria", cmbFormCategoria);
        objetoProducto.CargarComboBox("unidad_medida", "id_unidad_medida","descripcion_unidad_de_medida", cmbFormUnidadMedida);
        objetoProducto.CargarComboBox("embalaje","id_embalaje", "descripcion_embalaje", cmbFormEmbalaje);
        objetoProducto.CargarComboBox("marca","id_marca", "nombre_marca", cmbFormMarca);
        
        cmbFormCategoria.setSelectedIndex(0);
        cmbFormUnidadMedida.setSelectedIndex(0);
        cmbFormEmbalaje.setSelectedIndex(0);
        cmbFormMarca.setSelectedIndex(0);
       
        
        objetoProducto.MostrarProductos(tbProductos);  
        
        validarTextoNumero( " , ! ? ; : - @ # $ & ( ) [ ] { } | \\", txtFormDescripcion, txtFormDescripcionLarga,txtFormPeso, txtFormImagenMini, txtFormGaleria );
        validarNumero(true, txtFormValorUnitario, txtFormDescuento);
        validarNumero(false, txtFormStock, txtFormAltura, txtFormAnchura);
        
    }
    
    public void validarTextoNumero(final String caracteresExcluidos, final JTextComponent... textComponents) {
        for (JTextComponent textComponent : textComponents){
            textComponent.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char caracter = e.getKeyChar();
                    if (!(Character.isDigit(caracter) || Character.isLetter(caracter) || caracter == ' ' || !caracteresExcluidos.contains(String.valueOf(caracter)))) {
                        e.consume();
                    }
                }
            });
        }
    }

    public void validarNumero(final boolean permitirDecimal, final JTextField... textFields) {
        for (JTextField textField : textFields){
            textField.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char caracter = e.getKeyChar();
                    if (!(Character.isDigit(caracter) || (permitirDecimal && caracter == '.'))) {
                        e.consume();
                    }
                    if (caracter == '.' && textField.getText().contains(".")) {
                        e.consume();
                    }
                }
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFormId = new javax.swing.JTextField();
        txtFormValorUnitario = new javax.swing.JTextField();
        txtFormStock = new javax.swing.JTextField();
        cmbFormCategoria = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmbFormUnidadMedida = new javax.swing.JComboBox<>();
        cmbFormEmbalaje = new javax.swing.JComboBox<>();
        txtFormAltura = new javax.swing.JTextField();
        txtFormPeso = new javax.swing.JTextField();
        txtFormImagenMini = new javax.swing.JTextField();
        txtFormGaleria = new javax.swing.JTextField();
        txtFormDescuento = new javax.swing.JTextField();
        cmbFormMarca = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        txtFormAnchura = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFormDescripcion = new javax.swing.JTextField();
        txtFormDescripcionLarga = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnActivar = new javax.swing.JButton();
        btnDesactivar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Id:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Descripcion:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Categoria:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Valor unitario:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Stock:");

        txtFormId.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFormId.setEnabled(false);

        txtFormValorUnitario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtFormStock.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        cmbFormCategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbFormCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFormCategoriaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Unidad medida:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Embalaje:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Altura:");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Peso:");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Imagen miniatura:");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Galeria imagenes:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Descuento:");

        jLabel13.setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N
        jLabel13.setText("Marca:");

        cmbFormUnidadMedida.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbFormUnidadMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFormUnidadMedidaActionPerformed(evt);
            }
        });

        cmbFormEmbalaje.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cmbFormEmbalaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFormEmbalajeActionPerformed(evt);
            }
        });

        txtFormAltura.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFormAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFormAlturaActionPerformed(evt);
            }
        });

        txtFormPeso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtFormImagenMini.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtFormGaleria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFormGaleria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFormGaleriaActionPerformed(evt);
            }
        });

        txtFormDescuento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFormDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFormDescuentoActionPerformed(evt);
            }
        });

        cmbFormMarca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Estado:");

        txtEstado.setEditable(false);
        txtEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtFormAnchura.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtFormAnchura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFormAnchuraActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Anchura:");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Descripcion Larga:");

        txtFormDescripcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        txtFormDescripcionLarga.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16)
                    .addComponent(jLabel9)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtFormId)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel15)
                    .addComponent(cmbFormCategoria, 0, 234, Short.MAX_VALUE)
                    .addComponent(txtFormValorUnitario)
                    .addComponent(txtFormStock)
                    .addComponent(cmbFormUnidadMedida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbFormEmbalaje, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFormAltura)
                    .addComponent(txtFormAnchura)
                    .addComponent(jLabel14)
                    .addComponent(txtFormPeso)
                    .addComponent(jLabel10)
                    .addComponent(txtFormImagenMini)
                    .addComponent(jLabel11)
                    .addComponent(txtFormGaleria)
                    .addComponent(jLabel12)
                    .addComponent(txtFormDescuento)
                    .addComponent(cmbFormMarca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addComponent(txtEstado)
                    .addComponent(txtFormDescripcion)
                    .addComponent(txtFormDescripcionLarga))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFormId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFormDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFormDescripcionLarga, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFormCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFormValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFormStock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFormUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFormEmbalaje, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFormAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFormAnchura, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFormPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFormImagenMini, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFormGaleria, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFormDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbFormMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Productos"));
        jPanel2.setPreferredSize(new java.awt.Dimension(903, 437));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(10, 10));

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbProductos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbProductos.setGridColor(new java.awt.Color(255, 255, 255));
        tbProductos.setInheritsPopupMenu(true);
        tbProductos.setMaximumSize(new java.awt.Dimension(999999, 999999));
        tbProductos.setRequestFocusEnabled(false);
        tbProductos.setRowHeight(80);
        tbProductos.setShowGrid(false);
        tbProductos.setShowHorizontalLines(true);
        tbProductos.getTableHeader().setResizingAllowed(false);
        tbProductos.getTableHeader().setReorderingAllowed(false);
        tbProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProductos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnGuardar.setBackground(new java.awt.Color(148, 215, 242));
        btnGuardar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(148, 215, 242));
        btnEditar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditar.setBorderPainted(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnActivar.setBackground(new java.awt.Color(148, 215, 242));
        btnActivar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnActivar.setText("ACTIVAR");
        btnActivar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActivar.setBorderPainted(false);
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });

        btnDesactivar.setBackground(new java.awt.Color(148, 215, 242));
        btnDesactivar.setText("DESACTIVAR");
        btnDesactivar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDesactivar.setBorderPainted(false);
        btnDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDesactivar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActivar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActivar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        Productos objetoProducto =  new Productos();
        objetoProducto.insertarProductos(txtFormDescripcion, txtFormDescripcionLarga, cmbFormCategoria, txtFormValorUnitario, txtFormStock, cmbFormUnidadMedida, cmbFormEmbalaje, txtFormAltura, txtFormAnchura, txtFormPeso, txtFormImagenMini, txtFormGaleria, txtFormDescuento, cmbFormMarca);
        objetoProducto.MostrarProductos(tbProductos);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbFormCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFormCategoriaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbFormCategoriaActionPerformed

    private void txtFormAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFormAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFormAlturaActionPerformed

    private void txtFormGaleriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFormGaleriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFormGaleriaActionPerformed

    private void txtFormDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFormDescuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFormDescuentoActionPerformed

    private void tbProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductosMouseClicked
        // TODO add your handling code here:
        Productos objetosProductos = new Productos();
        objetosProductos.SeleccionarProducto(tbProductos, txtFormId, txtFormDescripcion, txtFormDescripcionLarga, cmbFormCategoria, txtFormValorUnitario, txtFormStock, cmbFormUnidadMedida, cmbFormEmbalaje, txtFormAltura, txtFormAnchura, txtFormPeso, txtFormImagenMini, txtFormGaleria, txtFormDescuento, cmbFormMarca, txtEstado);
    }//GEN-LAST:event_tbProductosMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        Productos objetoProducto =  new Productos();
        objetoProducto.EditarProductos(txtFormId,txtFormDescripcion, txtFormDescripcionLarga,cmbFormCategoria, txtFormValorUnitario, txtFormStock, cmbFormUnidadMedida, cmbFormEmbalaje, txtFormAltura, txtFormAnchura, txtFormPeso, txtFormImagenMini, txtFormGaleria, txtFormDescuento, cmbFormMarca);
        objetoProducto.MostrarProductos(tbProductos);
        objetoProducto.LimpiarCampos(txtFormId, txtFormDescripcion, txtFormDescripcionLarga, cmbFormCategoria, txtFormValorUnitario, txtFormStock, cmbFormUnidadMedida, cmbFormEmbalaje, txtFormAltura, txtFormAnchura, txtFormPeso, txtFormImagenMini, txtFormGaleria, txtFormDescuento, cmbFormMarca, txtEstado);
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed
        // TODO add your handling code here:
        Productos objetoProducto = new Productos();
        objetoProducto.DesactivarProducto(txtFormId);
        objetoProducto.MostrarProductos(tbProductos);
        objetoProducto.LimpiarCampos(txtFormId,txtFormDescripcion,  txtFormDescripcionLarga,cmbFormCategoria, txtFormValorUnitario, txtFormStock, cmbFormUnidadMedida, cmbFormEmbalaje, txtFormAltura, txtFormAnchura, txtFormPeso, txtFormImagenMini, txtFormGaleria, txtFormDescuento, cmbFormMarca, txtEstado);
       
    }//GEN-LAST:event_btnDesactivarActionPerformed

    private void cmbFormUnidadMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFormUnidadMedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFormUnidadMedidaActionPerformed

    private void cmbFormEmbalajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFormEmbalajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFormEmbalajeActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
        // TODO add your handling code here:
        Productos objetoProducto = new Productos();
        objetoProducto.ActivarProducto(txtFormId);
        objetoProducto.MostrarProductos(tbProductos);
        objetoProducto.LimpiarCampos(txtFormId, txtFormDescripcion, txtFormDescripcionLarga, cmbFormCategoria, txtFormValorUnitario, txtFormStock, cmbFormUnidadMedida, cmbFormEmbalaje, txtFormAltura, txtFormAnchura, txtFormPeso, txtFormImagenMini, txtFormGaleria, txtFormDescuento, cmbFormMarca, txtEstado);
    }//GEN-LAST:event_btnActivarActionPerformed

    private void txtFormAnchuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFormAnchuraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFormAnchuraActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormProductos().setVisible(true);
            }
        });
    }
  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbFormCategoria;
    private javax.swing.JComboBox<String> cmbFormEmbalaje;
    private javax.swing.JComboBox<String> cmbFormMarca;
    private javax.swing.JComboBox<String> cmbFormUnidadMedida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbProductos;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFormAltura;
    private javax.swing.JTextField txtFormAnchura;
    private javax.swing.JTextField txtFormDescripcion;
    private javax.swing.JTextField txtFormDescripcionLarga;
    private javax.swing.JTextField txtFormDescuento;
    private javax.swing.JTextField txtFormGaleria;
    private javax.swing.JTextField txtFormId;
    private javax.swing.JTextField txtFormImagenMini;
    private javax.swing.JTextField txtFormPeso;
    private javax.swing.JTextField txtFormStock;
    private javax.swing.JTextField txtFormValorUnitario;
    // End of variables declaration//GEN-END:variables
}
