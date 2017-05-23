/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archolding.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "dclasificacion")
public class Dclasificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "usuarioalta")
    private String usuarioalta;
    @Column(name = "usuariomod")
    private String usuariomod;
    @Column(name = "del")
    private boolean del;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clasificacion")
    private List<Dproductos> dproductosList;

    public Dclasificacion() {
    }

    public Dclasificacion(Long id) {
        this.id = id;
    }

    public Dclasificacion(Long id, String descripcion, boolean del) {
        this.id = id;
        this.descripcion = descripcion;
        this.del = del;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUsuarioalta() {
        return usuarioalta;
    }

    public void setUsuarioalta(String usuarioalta) {
        this.usuarioalta = usuarioalta;
    }

    public String getUsuariomod() {
        return usuariomod;
    }

    public void setUsuariomod(String usuariomod) {
        this.usuariomod = usuariomod;
    }

    public boolean getDel() {
        return del;
    }

    public void setDel(boolean del) {
        this.del = del;
    }

    public List<Dproductos> getDproductosList() {
        return dproductosList;
    }

    public void setDproductosList(List<Dproductos> dproductosList) {
        this.dproductosList = dproductosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dclasificacion)) {
            return false;
        }
        Dclasificacion other = (Dclasificacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Dclasificacion[ id=" + id + " ]";
    }
    
}
