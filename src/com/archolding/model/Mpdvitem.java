/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archolding.model;

import java.io.Serializable;
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
@Table(name = "mpdvitem")
public class Mpdvitem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "codigobarra")
    private String codigobarra;
    @Column(name = "maestro")
    private int maestro;
    @Column(name = "cantidad")
    private double cantidad;
    @Column(name = "impuesto")
    private int impuesto;
    @Column(name = "costoneto")
    private double costoneto;
    @Column(name = "costocompra")
    private double costocompra;
    @Column(name = "del")
    private boolean del;
    @JoinColumn(name = "idproducto", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Dproductos idproducto;
    @JoinColumn(name = "idpdvcabecera", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Mpdvcabecera idpdvcabecera;

    public Mpdvitem() {
    }

    public Mpdvitem(Long id) {
        this.id = id;
    }

    public Mpdvitem(Long id, String codigobarra, int maestro, double cantidad, int impuesto, double costoneto, double costocompra, boolean del) {
        this.id = id;
        this.codigobarra = codigobarra;
        this.maestro = maestro;
        this.cantidad = cantidad;
        this.impuesto = impuesto;
        this.costoneto = costoneto;
        this.costocompra = costocompra;
        this.del = del;
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

    public int getMaestro() {
        return maestro;
    }

    public void setMaestro(int maestro) {
        this.maestro = maestro;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    public double getCostoneto() {
        return costoneto;
    }

    public void setCostoneto(double costoneto) {
        this.costoneto = costoneto;
    }

    public double getCostocompra() {
        return costocompra;
    }

    public void setCostocompra(double costocompra) {
        this.costocompra = costocompra;
    }

    public boolean getDel() {
        return del;
    }

    public void setDel(boolean del) {
        this.del = del;
    }

    public Dproductos getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Dproductos idproducto) {
        this.idproducto = idproducto;
    }

    public Mpdvcabecera getIdpdvcabecera() {
        return idpdvcabecera;
    }

    public void setIdpdvcabecera(Mpdvcabecera idpdvcabecera) {
        this.idpdvcabecera = idpdvcabecera;
    }
    
}
