/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archolding.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Jorge Fabio
 */
@Entity
@Table(name = "dcodigos")
public class Dcodigos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "codigobarra")
    private String codigobarra;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "precio")
    private int precio;
    @JoinColumn(name = "idmaestro", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Dproductos idmaestro;

    public Dcodigos() {
    }

    public Dcodigos(Long id) {
        this.id = id;
    }

    public Dcodigos(Long id, String codigobarra, int cantidad, int precio) {
        this.id = id;
        this.codigobarra = codigobarra;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigobarra() {
        return codigobarra;
    }

    public void setCodigobarra(String codigobarra) {
        this.codigobarra = codigobarra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Dproductos getIdmaestro() {
        return idmaestro;
    }

    public void setIdmaestro(Dproductos idmaestro) {
        this.idmaestro = idmaestro;
    }  
}
