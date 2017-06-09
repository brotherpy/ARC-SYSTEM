/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archolding.view.tablas;

import com.archolding.dao.DepositosDao;
import com.archolding.dao.MovimientoStockDao;
import com.archolding.dao.ProductosDao;
import com.archolding.model.Ddepositos;
import com.archolding.model.Dproductos;
import com.archolding.model.Mstock;
import com.archolding.util.Utilidad;
import java.time.Instant;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Fabio
 */
public class FormularioEntradaInicial extends javax.swing.JDialog {

    private Dproductos producto;
    private ProductosDao prodDao;
    private MovimientoStockDao mStockDao;
    private Mstock mStock;
    private DepositosDao depDao;

    /**
     * Creates new form FormularioEntradaInicial
     */
    public FormularioEntradaInicial() {
        initComponents();
        setLocationRelativeTo(this);

        cargarUltimoProductoCatastrado();
        
        Utilidad.salirConEscapeJDialog(this);
        
        //Validar campos a solo numeros
        Utilidad.soloNumeros(tfStockCantidad);
        Utilidad.soloNumeros(tfProductoPrecioUnit);
        Utilidad.soloNumeros(tfProductoPrecioCaja);
        Utilidad.soloNumeros(tfProductoPorcentajeUnidad);
        Utilidad.soloNumeros(tfProductoCosto);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfProdId = new javax.swing.JTextField();
        tfProdDescripcion = new javax.swing.JTextField();
        tfStockCantidad = new javax.swing.JTextField();
        tfProductoPrecioUnit = new javax.swing.JTextField();
        tfProductoPrecioCaja = new javax.swing.JTextField();
        tfProductoPorcentajeUnidad = new javax.swing.JTextField();
        tfProductoCosto = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entrada Inicial");
        setModal(true);

        jLabel1.setText("Descripcion del Producto");

        jLabel2.setText("Cantidad Inicial");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("P. Unit");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("p. Caja");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("%");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Costo inicial");

        tfProdId.setEditable(false);
        tfProdId.setFocusable(false);

        tfProdDescripcion.setEditable(false);
        tfProdDescripcion.setFocusable(false);

        tfStockCantidad.setEditable(false);
        tfStockCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfStockCantidadFocusGained(evt);
            }
        });
        tfStockCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfStockCantidadKeyPressed(evt);
            }
        });

        tfProductoPrecioUnit.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfProductoPrecioUnit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfProductoPrecioUnitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfProductoPrecioUnitFocusLost(evt);
            }
        });
        tfProductoPrecioUnit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfProductoPrecioUnitKeyPressed(evt);
            }
        });

        tfProductoPrecioCaja.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfProductoPrecioCaja.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfProductoPrecioCajaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfProductoPrecioCajaFocusLost(evt);
            }
        });
        tfProductoPrecioCaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfProductoPrecioCajaKeyPressed(evt);
            }
        });

        tfProductoPorcentajeUnidad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfProductoPorcentajeUnidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfProductoPorcentajeUnidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfProductoPorcentajeUnidadFocusLost(evt);
            }
        });
        tfProductoPorcentajeUnidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfProductoPorcentajeUnidadKeyPressed(evt);
            }
        });

        tfProductoCosto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfProductoCosto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfProductoCostoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfProductoCostoFocusLost(evt);
            }
        });
        tfProductoCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfProductoCostoKeyPressed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        btnAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAceptarKeyPressed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfStockCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfProductoPrecioCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfProductoPrecioUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfProductoPorcentajeUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfProductoCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfProdId, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfProdDescripcion)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfProdDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfProdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStockCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfProductoPrecioUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfProductoPrecioCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfProductoPorcentajeUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfProductoCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfStockCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfStockCantidadKeyPressed
        Utilidad.moverConEnter(evt, tfProductoPrecioUnit);
    }//GEN-LAST:event_tfStockCantidadKeyPressed

    private void tfProductoPrecioUnitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfProductoPrecioUnitKeyPressed
        Utilidad.moverConEnter(evt, tfProductoPrecioCaja);
    }//GEN-LAST:event_tfProductoPrecioUnitKeyPressed

    private void tfProductoPrecioCajaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfProductoPrecioCajaKeyPressed
        Utilidad.moverConEnter(evt, tfProductoPorcentajeUnidad);
    }//GEN-LAST:event_tfProductoPrecioCajaKeyPressed

    private void tfProductoPorcentajeUnidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfProductoPorcentajeUnidadKeyPressed
        Utilidad.moverConEnter(evt, tfProductoCosto);
    }//GEN-LAST:event_tfProductoPorcentajeUnidadKeyPressed

    private void tfProductoCostoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfProductoCostoKeyPressed
        Utilidad.moverConEnter(evt, btnAceptar);
    }//GEN-LAST:event_tfProductoCostoKeyPressed

    private void tfStockCantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStockCantidadFocusGained
        tfStockCantidad.selectAll();
    }//GEN-LAST:event_tfStockCantidadFocusGained

    private void tfProductoPrecioUnitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfProductoPrecioUnitFocusGained
        tfProductoPrecioUnit.selectAll();
    }//GEN-LAST:event_tfProductoPrecioUnitFocusGained

    private void tfProductoPrecioCajaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfProductoPrecioCajaFocusGained
        tfProductoPrecioCaja.selectAll();
    }//GEN-LAST:event_tfProductoPrecioCajaFocusGained

    private void tfProductoPorcentajeUnidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfProductoPorcentajeUnidadFocusGained
        tfProductoPorcentajeUnidad.selectAll();
    }//GEN-LAST:event_tfProductoPorcentajeUnidadFocusGained

    private void tfProductoCostoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfProductoCostoFocusGained
        tfProductoCosto.selectAll();
    }//GEN-LAST:event_tfProductoCostoFocusGained

    private void btnAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAceptarKeyPressed
        Utilidad.hacerClicConEnter(evt, btnAceptar);
    }//GEN-LAST:event_btnAceptarKeyPressed

    private void btnSalirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalirKeyPressed
        Utilidad.hacerClicConEnter(evt, btnSalir);

    }//GEN-LAST:event_btnSalirKeyPressed

    private void tfProductoPrecioUnitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfProductoPrecioUnitFocusLost
        precioPorCaja();
        double valor = Utilidad.formatoValorD(tfProductoPrecioUnit.getText());
        tfProductoPrecioUnit.setText(Utilidad.formatoValorS(valor));
    }//GEN-LAST:event_tfProductoPrecioUnitFocusLost

    private void tfProductoPrecioCajaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfProductoPrecioCajaFocusLost
        costoUnitario();
        double valor = Utilidad.formatoValorD(tfProductoPrecioCaja.getText());
        tfProductoPrecioCaja.setText(Utilidad.formatoValorS(valor));
    }//GEN-LAST:event_tfProductoPrecioCajaFocusLost

    private void tfProductoCostoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfProductoCostoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_tfProductoCostoFocusLost

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        afectarStock();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        salir();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tfProductoPorcentajeUnidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfProductoPorcentajeUnidadFocusLost
        costoUnitario();
    }//GEN-LAST:event_tfProductoPorcentajeUnidadFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfProdDescripcion;
    private javax.swing.JTextField tfProdId;
    private javax.swing.JTextField tfProductoCosto;
    private javax.swing.JTextField tfProductoPorcentajeUnidad;
    private javax.swing.JTextField tfProductoPrecioCaja;
    private javax.swing.JTextField tfProductoPrecioUnit;
    private javax.swing.JTextField tfStockCantidad;
    // End of variables declaration//GEN-END:variables

    private void cargarUltimoProductoCatastrado() {
        tfProductoPrecioUnit.requestFocus();

        prodDao = new ProductosDao();
        Long id = prodDao.recuperarUltimoID();

        prodDao = new ProductosDao();
        producto = prodDao.recuperarPorId(id);

        boolean validador = false;

        if (producto.isAfectastock()) {
            tfStockCantidad.setEditable(true);
            tfStockCantidad.setText("0");
            tfStockCantidad.requestFocus();
        }

        tfProdId.setText(producto.getId() + "");
        tfProdDescripcion.setText(producto.getCodbarra() + " - " + producto.getDescripcion1());
        tfProductoPorcentajeUnidad.setText(Utilidad.formatoValorS(producto.getLucro()));
        tfProductoPrecioUnit.setText("0");
        tfProductoPrecioCaja.setText("0");
        tfProductoCosto.setText("0");
    }

    private void afectarStock() {

        prodDao = new ProductosDao();

        producto = prodDao.recuperarPorId(Long.parseLong(tfProdId.getText()));

        producto.setId(Long.parseLong(tfProdId.getText()));
        producto.setPrecioventa(Utilidad.formatoValorD(tfProductoPrecioUnit.getText()));
        producto.setPrecioventa2(Utilidad.formatoValorD(tfProductoPrecioCaja.getText()));
        producto.setCostocompra(Utilidad.formatoValorD(tfProductoCosto.getText()));
        producto.setCostoneto(Utilidad.formatoValorD(tfProductoCosto.getText()));
        producto.setCostopromedio(Utilidad.formatoValorD(tfProductoCosto.getText()));

        prodDao = new ProductosDao();

        try {
            prodDao.actualizar(producto);
            prodDao.commit();
        } catch (Exception e) {
            prodDao.rollback();
            JOptionPane.showMessageDialog(null, "Se produjo un error al cargar stock inicial");
        }

        tfProductoPrecioUnit.requestFocus();

        prodDao = new ProductosDao();
        Long id = prodDao.recuperarUltimoID();

        prodDao = new ProductosDao();
        producto = prodDao.recuperarPorId(id);

        if (producto.isAfectastock()) {
            prodDao = new ProductosDao();
            producto = prodDao.recuperarPorId(Long.parseLong(tfProdId.getText()));
            producto.setUcant(Utilidad.formatoValorD(tfStockCantidad.getText()));
            prodDao = new ProductosDao();
            try {
                prodDao.actualizar(producto);
                prodDao.commit();
            } catch (Exception e) {
                prodDao.rollback();
                JOptionPane.showMessageDialog(null, "Se produjo un error al cargar stock inicial");
            }
            depDao = new DepositosDao();
            Long d = Long.parseLong("1");
            Ddepositos dep = depDao.recuperarPorId(d);
            mStock = new Mstock(
                    Date.from(Instant.now()),
                    Double.parseDouble(tfStockCantidad.getText()),
                    dep,
                    producto);
            mStockDao = new MovimientoStockDao();
            try {
                mStockDao.insertar(mStock);
                mStockDao.commit();
            } catch (Exception e) {
                prodDao.rollback();
                JOptionPane.showMessageDialog(null, "Se produjo un error al cargar stock inicial");
            }
        }
        dispose();
    }

    private void salir() {
        int opcion = JOptionPane.showConfirmDialog(null, "Desea salir?", "Atencion", JOptionPane.OK_CANCEL_OPTION);
        if (opcion == JOptionPane.OK_OPTION) {
            dispose();
        }
    }

    private void precioPorCaja() {
        prodDao = new ProductosDao();
        producto = prodDao.recuperarPorId(Long.parseLong(tfProdId.getText()));
        int cantCaja = producto.getCantidad();

        tfProductoPrecioCaja.setText(
                Integer.parseInt(tfProductoPrecioUnit.getText()) * cantCaja + ""
        );

    }

    private void costoUnitario() {
        double precioVta = Utilidad.formatoValorD(tfProductoPrecioUnit.getText());
        double porcentage = Utilidad.formatoValorD(tfProductoPorcentajeUnidad.getText());
        double costo = precioVta - (precioVta * porcentage / 100);
        tfProductoCosto.setText(Utilidad.formatoValorS(costo));

    }

}
