/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archolding.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jorge Fabio
 */
@Entity
@Table(name = "mstock")
public class Mstock implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "fecha", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "saldo", nullable = false)
    private double saldo;
    @JoinColumn(name = "iddeposito", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Ddepositos iddeposito;
    @JoinColumn(name = "idproducto", referencedColumnName = "id", unique = true)
    @ManyToOne(optional = false)
    private Dproductos idproducto;

    public Mstock() {
    }

    public Mstock(Long id) {
        this.id = id;
    }

    public Mstock(Long id, Date fecha, double saldo) {
        this.id = id;
        this.fecha = fecha;
        this.saldo = saldo;
    }

    public Mstock(Date fecha, double saldo, Ddepositos iddeposito, Dproductos idproducto) {
        this.fecha = fecha;
        this.saldo = saldo;
        this.iddeposito = iddeposito;
        this.idproducto = idproducto;
    }

    public Mstock(Long id, Date fecha, double saldo, Ddepositos iddeposito, Dproductos idproducto) {
        this.id = id;
        this.fecha = fecha;
        this.saldo = saldo;
        this.iddeposito = iddeposito;
        this.idproducto = idproducto;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Ddepositos getIddeposito() {
        return iddeposito;
    }

    public void setIddeposito(Ddepositos iddeposito) {
        this.iddeposito = iddeposito;
    }

    public Dproductos getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Dproductos idproducto) {
        this.idproducto = idproducto;
    }
}
