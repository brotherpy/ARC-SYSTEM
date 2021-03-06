/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archolding.view.tablas;

import com.archolding.dao.MasCodigosDao;
import com.archolding.dao.ProductosDao;
import com.archolding.model.Dcodigos;
import com.archolding.model.Dproductos;
import com.archolding.model.table.ModeloTablaMasCodigos;
import com.archolding.util.Utilidad;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Jorge Fabio
 */
public class FormularioMasCodigos extends javax.swing.JDialog {

    /**
     * Creates new form FormularioMasCodigos
     */
    private Dcodigos codigos;
    private MasCodigosDao dao;
    private ModeloTablaMasCodigos mtDcodigos;
    private List<Dcodigos> lista;
    private String accion;
    private ProductosDao prodDao;
    private Dproductos prod;

    public FormularioMasCodigos() {
        initComponents();
        estadoInicial(true);
        setLocationRelativeTo(this);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(1).setPreferredWidth(80);
        columnModel.getColumn(2).setPreferredWidth(150);
        Utilidad.salirConEscapeBuscador(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mtDcodigos = new ModeloTablaMasCodigos();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCodigoBarra = new javax.swing.JTextField();
        tfCantidad = new javax.swing.JTextField();
        tfPrecio = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Codigos y Precios Alternativos");
        setModal(true);

        table.setModel(mtDcodigos);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setText("Codigos");

        jLabel2.setText("Cantidad");

        jLabel3.setText("Precio");

        tfCodigoBarra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCodigoBarraFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCodigoBarraFocusLost(evt);
            }
        });
        tfCodigoBarra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCodigoBarraKeyPressed(evt);
            }
        });

        tfCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCantidadFocusLost(evt);
            }
        });
        tfCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCantidadKeyPressed(evt);
            }
        });

        tfPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPrecioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPrecioFocusLost(evt);
            }
        });
        tfPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPrecioKeyPressed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });
        btnIncluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnIncluirKeyPressed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        btnEliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEliminarKeyPressed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalirKeyPressed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setEnabled(false);

        jTextField2.setEditable(false);
        jTextField2.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tfCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCantidad)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(71, 71, 71))
                            .addComponent(tfPrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodigoBarraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodigoBarraFocusGained
        recuperarTodo();
        Utilidad.seleccionarContenido(evt, tfCodigoBarra);
    }//GEN-LAST:event_tfCodigoBarraFocusGained

    private void tfCantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCantidadFocusGained
        Utilidad.seleccionarContenido(evt, tfCantidad);
    }//GEN-LAST:event_tfCantidadFocusGained

    private void tfPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecioFocusGained
        Utilidad.seleccionarContenido(evt, tfPrecio);
    }//GEN-LAST:event_tfPrecioFocusGained

    private void tfCodigoBarraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodigoBarraFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoBarraFocusLost

    private void tfCantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCantidadFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCantidadFocusLost

    private void tfPrecioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPrecioFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrecioFocusLost

    private void btnIncluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIncluirKeyPressed
        Utilidad.hacerClicConEnter(evt, btnIncluir);
    }//GEN-LAST:event_btnIncluirKeyPressed

    private void btnEliminarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEliminarKeyPressed
        Utilidad.hacerClicConEnter(evt, btnEliminar);
    }//GEN-LAST:event_btnEliminarKeyPressed

    private void btnSalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalirKeyPressed
        dispose();
    }//GEN-LAST:event_btnSalirKeyPressed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        verificarCodigoBarra(tfCodigoBarra.getText());
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (evt.getClickCount() == 2) {
            seleccionarObjeto(table.getSelectedRow());
        }
    }//GEN-LAST:event_tableMouseClicked

    private void tfCodigoBarraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoBarraKeyPressed
        Utilidad.moverConEnter(evt, tfCantidad);
    }//GEN-LAST:event_tfCodigoBarraKeyPressed

    private void tfCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCantidadKeyPressed
        Utilidad.moverConEnter(evt, tfPrecio);
    }//GEN-LAST:event_tfCantidadKeyPressed

    private void tfPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPrecioKeyPressed
        Utilidad.moverConEnter(evt, btnIncluir);
    }//GEN-LAST:event_tfPrecioKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfCantidad;
    private javax.swing.JTextField tfCodigoBarra;
    private javax.swing.JTextField tfPrecio;
    // End of variables declaration//GEN-END:variables

    private void recuperarTodo() {
        dao = new MasCodigosDao();
        lista = dao.recuperarMasCodigos(Long.parseLong(jTextField1.getText()));
        mtDcodigos.setLista(lista);
    }

    private void seleccionarObjeto(int index) {
        if (index < 0) {
            return;
        }

        codigos = lista.get(index);
        tfCodigoBarra.setText(codigos.getCodigobarra() + "");
        tfCantidad.setText(codigos.getCantidad() + "");
        tfPrecio.setText(codigos.getPrecio() + "");
    }

    private void seleccionarProducto(int index) {
        if (index < 0) {
            return;
        }
        Dcodigos cadena = lista.get(index);
        dispose();
    }

    private void eliminar() {
        int index = table.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro");
            return;
        }
        codigos = lista.get(index);
        int result = JOptionPane.showConfirmDialog(null,
                "Esta seguro q desea eliminar el codigo alternativo"
                + codigos.getCodigobarra() + "?",
                "Atención", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            dao = new MasCodigosDao();
            try {
                dao.eliminar(codigos);
                dao.commit();
                recuperarTodo();
                vaciarCampos();
            } catch (Exception e) {
                dao.rollback();
            }
        }

    }

    //Estado inicial = true (Los campos estan deshabilitados)
    //Estado inicial = false (Los campos estan habilitados)
    private void estadoInicial(Boolean b) {
        tfCodigoBarra.requestFocus();
        btnIncluir.setEnabled(b);
        btnEliminar.setEnabled(b);
        btnSalir.setEnabled(!b);

        table.clearSelection();
        table.setEnabled(b);
    }

    //Vaciar campos
    private void vaciarCampos() {
        tfCodigoBarra.requestFocus();
        tfCodigoBarra.setText("");
    }

    //Validar antes de grabar
    private boolean validar() {
        boolean validar = false;
        if (tfCodigoBarra.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un Codigo");
            tfCodigoBarra.requestFocus();
        } else if (tfCantidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una Cantidad");
            tfCantidad.requestFocus();
        } else if (tfPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un precio");
            tfPrecio.requestFocus();
        } else {
            validar = true;
        }
        return validar;
    }

    private void verificarCodigoBarra(String Barra){
        prodDao = new ProductosDao();
        prod = prodDao.recuperarPorCodigoBarra(Barra);
        if(prod!=null){
            JOptionPane.showMessageDialog(null, "El codigo de barras "+Barra+" ya esta utilizado por el id: "+ prod.getId());
            tfCodigoBarra.requestFocus();
        }else{
            guardar();
        }
    }
    private void guardar() {
        if (validar()) {
            prodDao = new ProductosDao();
            prod = prodDao.recuperarPorId(Long.parseLong(jTextField1.getText()));
            codigos = new Dcodigos();
            codigos.setIdmaestro(prod);
            codigos.setCodigobarra(tfCodigoBarra.getText());
            codigos.setCantidad(Integer.parseInt(tfCantidad.getText()));
            codigos.setPrecio(Integer.parseInt(tfPrecio.getText()));

            dao = new MasCodigosDao();

            try {
                dao.insertar(codigos);
                dao.commit();
                estadoInicial(true);
                vaciarCampos();
                recuperarTodo();
            } catch (Exception e) {
                e.printStackTrace();
                dao.rollback();
                JOptionPane.showMessageDialog(null, "El codigo "+tfCodigoBarra+"ya fue utilizado"
                        + "\ncomo codigo alternativo");
                tfCodigoBarra.requestFocus();
            }
        }
    }
}
