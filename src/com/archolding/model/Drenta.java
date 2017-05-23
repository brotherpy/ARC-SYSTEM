/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archolding.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Jorge Fabio
 */
@Entity
@Table(name = "drenta")
public class Drenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ciruc")
    private Long ciruc;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "direccion")
    private String direccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciruc")
    private List<Mpdvcabecera> mpdvcabeceraList;

    public Drenta() {
    }

    public Drenta(Long ciruc) {
        this.ciruc = ciruc;
    }

    public Drenta(Long ciruc, String nombre, String direccion) {
        this.ciruc = ciruc;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Long getCiruc() {
        return ciruc;
    }

    public void setCiruc(Long ciruc) {
        this.ciruc = ciruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Mpdvcabecera> getMpdvcabeceraList() {
        return mpdvcabeceraList;
    }

    public void setMpdvcabeceraList(List<Mpdvcabecera> mpdvcabeceraList) {
        this.mpdvcabeceraList = mpdvcabeceraList;
    }
    
}
