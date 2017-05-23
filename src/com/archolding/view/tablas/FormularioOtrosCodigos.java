/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archolding.view.tablas;

import com.archolding.model.table.ModeloTablaMasCodigos;
import com.archolding.dao.MasCodigosDao;
import com.archolding.model.Dcodigos;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Jorge Fabio
 */
public class FormularioOtrosCodigos extends java.awt.Dialog {

    /**
     * Creates new form FormularioDcodigos
     */
    private Dcodigos codigos;
    private MasCodigosDao dao;
    private ModeloTablaMasCodigos mtDcodigos;
    private List<Dcodigos> lista;
    private String accion;

    public FormularioOtrosCodigos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
        estadoInicial(true);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(1).setPreferredWidth(400);
        recuperarTodo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfCodigoBarra = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mtDcodigos = new ModeloTablaMasCodigos();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfCantidad = new javax.swing.JTextField();
        tfPrecio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Codigos y Precios Alternativos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        table.setModel(mtDcodigos);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel1.setText("Descripcion:");

        jLabel2.setText("Cantidad:");

        jLabel3.setText("Precio:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(tfCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (evt.getClickCount() == 2) {
            seleccionarObjeto(table.getSelectedRow());
        }
    }//GEN-LAST:event_tableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfCantidad;
    private javax.swing.JTextField tfCodigoBarra;
    private javax.swing.JTextField tfPrecio;
    // End of variables declaration//GEN-END:variables

    private void recuperarTodo() {
        dao = new MasCodigosDao();
        lista = dao.recuperarTodo();
        mtDcodigos.setLista(lista);
    }

    private void filtrarCadena() {
        dao = new MasCodigosDao();
        lista = dao.recuperarPorFiltro(tfCodigoBarra.getText());
        mtDcodigos.setLista(lista);
    }

    private void seleccionarObjeto(int index) {
        if (index < 0) {
            return;
        }

        codigos = lista.get(index);
        tfCodigoBarra.setText(codigos.getCodigobarra()+"");
        tfCantidad.setText(codigos.getCantidad()+"");
        tfPrecio.setText(codigos.getPrecio()+"");
        modificar();
    }

    private void seleccionarProducto(int index) {
        if (index < 0) {
            return;
        }
        Dcodigos cadena = lista.get(index);
        //interfaz.setProducto(producto);
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
                + codigos.getCodigobarra()+"?",
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
        btnNuevo.setEnabled(b);
        btnEliminar.setEnabled(b);
        btnGuardar.setEnabled(!b);
        btnCancelar.setEnabled(!b);

        table.clearSelection();
        table.setEnabled(b);
    }
    //Vaciar campos

    private void vaciarCampos() {
        tfCodigoBarra.requestFocus();
        tfCodigoBarra.setText("");
    }

    private void nuevo() {
        accion = "NUEVO";
        estadoInicial(false);
        vaciarCampos();
    }

    private void modificar() {
        accion = "MODIFICAR";
        estadoInicial(false);
    }

    private void cancelar() {
        estadoInicial(true);
        vaciarCampos();
    }

    private void guardar() {

        if (accion.equals("NUEVO")) {
            codigos = new Dcodigos();
        }
        
//        codigos.setIdmaestro(1);
        codigos.setCodigobarra(tfCodigoBarra.getText());
        codigos.setCantidad(Integer.parseInt(tfCantidad.getText()));
        codigos.setPrecio(Integer.parseInt(tfPrecio.getText()));

        dao = new MasCodigosDao();

        try {
            if (accion.equals("NUEVO")) {
                dao.insertar(codigos);
            } else {
                dao.actualizar(codigos);
            }
            dao.commit();
            estadoInicial(true);
            vaciarCampos();
            recuperarTodo();
        } catch (Exception e) {
            e.printStackTrace();
            dao.rollback();
            JOptionPane.showMessageDialog(null, "Se produjo un error al guardar los datos");
        }
    }
}
