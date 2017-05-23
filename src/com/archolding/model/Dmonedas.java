/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archolding.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jorge Fabio
 */
@Entity
@Table(name = "dmonedas")
public class Dmonedas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "moneda")
    private String moneda;
    @Column(name = "cambio")
    private double cambio;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "moneda")
    private List<Fpdvformapago> fpdvformapagoList;

    public Dmonedas() {
    }

    public Dmonedas(Long id) {
        this.id = id;
    }

    public Dmonedas(Long id, String moneda, double cambio, Date fecha) {
        this.id = id;
        this.moneda = moneda;
        this.cambio = cambio;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Fpdvformapago> getFpdvformapagoList() {
        return fpdvformapagoList;
    }

    public void setFpdvformapagoList(List<Fpdvformapago> fpdvformapagoList) {
        this.fpdvformapagoList = fpdvformapagoList;
    }

}
