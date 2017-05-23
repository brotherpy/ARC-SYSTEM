/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archolding.view.tablas;

import com.archolding.dao.CadenaPreciosDao;
import com.archolding.model.Dcadena;
import com.archolding.model.table.ModeloTablaCadenaPrecios;
import com.archolding.util.Utilidad;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Jorge Fabio
 */
public class FormularioCadenaPrecios extends javax.swing.JDialog {

    /**
     * Creates new form FormularioCadenaPrecios
     */
    private Dcadena clasificacion;
    private CadenaPreciosDao dao;
    private ModeloTablaCadenaPrecios mtDcadena;
    private List<Dcadena> lista;
    private String accion;

    public FormularioCadenaPrecios() {
        initComponents();
        estadoInicial(true);
        setLocationRelativeTo(this);
        TableColumnModel columnModel = tabla.getColumnModel();
        columnModel.getColumn(1).setPreferredWidth(400);
        recuperarTodo();

        //solo mayusculas
        tfDescripcion.setDocument(new Utilidad());
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
        mtDcadena = new ModeloTablaCadenaPrecios();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfDescripcion = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadenas de precio");

        tabla.setModel(mtDcadena);
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jLabel1.setText("Descripcion");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
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

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
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
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar)
                    .addComponent(btnBuscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        filtrarCadena();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        seleccionarProducto(WIDTH);
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        if (evt.getClickCount() == 2) {
            seleccionarObjeto(tabla.getSelectedRow());
        }
    }//GEN-LAST:event_tablaMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tfDescripcion;
    // End of variables declaration//GEN-END:variables
    private void recuperarTodo() {
        dao = new CadenaPreciosDao();
        lista = dao.recuperarTodo();
        mtDcadena.setLista(lista);
    }

    private void filtrarCadena() {
        dao = new CadenaPreciosDao();
        lista = dao.recuperarPorFiltro(tfDescripcion.getText());
        mtDcadena.setLista(lista);
    }

    private void seleccionarObjeto(int index) {
        if (index < 0) {
            return;
        }

        clasificacion = lista.get(index);
        tfDescripcion.setText(clasificacion.getDescripcion());
        modificar();
    }

    private void seleccionarProducto(int index) {
        if (index < 0) {
            return;
        }
        Dcadena cadena = lista.get(index);
        //interfaz.setProducto(producto);
        dispose();
    }

    private void eliminar() {
        int index = tabla.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro");
            return;
        }
        clasificacion = lista.get(index);
        int result = JOptionPane.showConfirmDialog(null,
                "Esta seguro q desea eliminar la cadena "
                + clasificacion.getDescripcion(),
                "Atención", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            dao = new CadenaPreciosDao();
            try {
                dao.eliminar(clasificacion);
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
        tfDescripcion.requestFocus();
        btnNuevo.setEnabled(b);
        btnBuscar.setEnabled(b);
        btnEliminar.setEnabled(b);
        btnGuardar.setEnabled(!b);
        btnCancelar.setEnabled(!b);

        tabla.clearSelection();
        tabla.setEnabled(b);
    }
    
    private void vaciarCampos() {
        tfDescripcion.requestFocus();
        tfDescripcion.setText("");
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
            clasificacion = new Dcadena();
        }

        clasificacion.setDescripcion(tfDescripcion.getText());
        clasificacion.setUsuarioalta("ADMIN");

        dao = new CadenaPreciosDao();

        try {
            if (accion.equals("NUEVO")) {
                dao.insertar(clasificacion);
            } else {
                dao.actualizar(clasificacion);
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
    }}