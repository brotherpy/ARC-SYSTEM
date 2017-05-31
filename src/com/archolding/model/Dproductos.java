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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Jorge Fabio
 */
@Entity
@Table(name = "dproductos")
public class Dproductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "maestro")
    private Integer maestro;
    @Column(name = "codbarra", unique = true)
    private String codbarra;
    @Column(name = "codproveedor")
    private String codproveedor;
    @Column(name = "descripcion1")
    private String descripcion1;
    @Column(name = "descripcion2")
    private String descripcion2;
    @Column(name = "unidad")
    private Integer unidad;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "descventa")
    private Double descventa;
    @Column(name = "descompra")
    private Double descompra;
    @Column(name = "peso")
    private Double peso;
    @Column(name = "balanza")
    private Integer balanza;
    @Column(name = "minimo")
    private Integer minimo;
    @Column(name = "maximo")
    private Integer maximo;
    @Column(name = "impuesto")
    private Integer impuesto;
    @Column(name = "lucro")
    private Double lucro;
    @Column(name = "lucro2")
    private Double lucro2;
    @Column(name = "cadena", nullable = true)
    private Integer cadena;
    @Column(name = "costopromedio")
    private Double costopromedio;
    @Column(name = "costocompra")
    private Double costocompra;
    @Column(name = "costoneto")
    private Double costoneto;
    @Column(name = "precioventa")
    private Double precioventa;
    @Column(name = "precioventa2")
    private Double precioventa2;
    @Column(name = "offline")
    private Double offline;
    @Column(name = "offline2")
    private Double offline2;
    @Column(name = "ufmov")
    @Temporal(TemporalType.DATE)
    private Date ufmov;
    @Column(name = "ucant")
    private Double ucant;
    @Column(name = "receta", nullable = true)
    private String receta;
    @Column(name = "porrecibir")
    private Double porrecibir;
    @Column(name = "afectastock")
    private boolean afectastock;
    @Column(name = "fleje")
    private Integer fleje;
    @Column(name = "sector")
    private String sector;
    @Column(name = "tecla")
    private int tecla;
    @Column(name = "comision")
    private Double comision;
    @Column(name = "comision2")
    private Double comision2;
    @Column(name = "comision3")
    private Double comision3;
    @Column(name = "fechaalta")
    @Temporal(TemporalType.DATE)
    private Date fechaalta;
    @Column(name = "usuarioalta")
    private String usuarioalta;
    @Column(name = "fechamod")
    @Temporal(TemporalType.DATE)
    private Date fechamod;
    @Column(name = "usuariomod", nullable = true)
    private String usuariomod;
    @Column(name = "del")
    private boolean del;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idproducto")
    private List<Mstock> mstockList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idproducto")
    private List<Mpdvitem> mpdvitemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmaestro")
    private List<Dcodigos> dcodigosList;
    @JoinColumn(name = "clasificacion", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Dclasificacion clasificacion;

    public Dproductos() {
    }

    public Dproductos(Long id) {
        this.id = id;
    }

    public Dproductos(Long id, Integer maestro, String codbarra, String codproveedor, String descripcion1, String descripcion2, Integer unidad, Integer cantidad, Double descventa, Double descompra, Double peso, Integer balanza, Integer minimo, Integer maximo, Integer impuesto, Double lucro, Double lucro2, Integer cadena, Double costopromedio, Double costocompra, Double costoneto, Double precioventa, Double precioventa2, Double offline, Double offline2, Date ufmov, Double ucant, String receta, Double porrecibir, boolean afectastock, Integer fleje, String sector, int tecla, Double comision, Double comision2, Double comision3, Date fechaalta, String usuarioalta, Date fechamod, String usuariomod, boolean del, List<Mstock> mstockList, List<Mpdvitem> mpdvitemList, List<Dcodigos> dcodigosList, Dclasificacion clasificacion) {
        this.id = id;
        this.maestro = maestro;
        this.codbarra = codbarra;
        this.codproveedor = codproveedor;
        this.descripcion1 = descripcion1;
        this.descripcion2 = descripcion2;
        this.unidad = unidad;
        this.cantidad = cantidad;
        this.descventa = descventa;
        this.descompra = descompra;
        this.peso = peso;
        this.balanza = balanza;
        this.minimo = minimo;
        this.maximo = maximo;
        this.impuesto = impuesto;
        this.lucro = lucro;
        this.lucro2 = lucro2;
        this.cadena = cadena;
        this.costopromedio = costopromedio;
        this.costocompra = costocompra;
        this.costoneto = costoneto;
        this.precioventa = precioventa;
        this.precioventa2 = precioventa2;
        this.offline = offline;
        this.offline2 = offline2;
        this.ufmov = ufmov;
        this.ucant = ucant;
        this.receta = receta;
        this.porrecibir = porrecibir;
        this.afectastock = afectastock;
        this.fleje = fleje;
        this.sector = sector;
        this.tecla = tecla;
        this.comision = comision;
        this.comision2 = comision2;
        this.comision3 = comision3;
        this.fechaalta = fechaalta;
        this.usuarioalta = usuarioalta;
        this.fechamod = fechamod;
        this.usuariomod = usuariomod;
        this.del = del;
        this.mstockList = mstockList;
        this.mpdvitemList = mpdvitemList;
        this.dcodigosList = dcodigosList;
        this.clasificacion = clasificacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMaestro() {
        return maestro;
    }

    public void setMaestro(Integer maestro) {
        this.maestro = maestro;
    }

    public String getCodbarra() {
        return codbarra;
    }

    public void setCodbarra(String codbarra) {
        this.codbarra = codbarra;
    }

    public String getCodproveedor() {
        return codproveedor;
    }

    public void setCodproveedor(String codproveedor) {
        this.codproveedor = codproveedor;
    }

    public String getDescripcion1() {
        return descripcion1;
    }

    public void setDescripcion1(String descripcion1) {
        this.descripcion1 = descripcion1;
    }

    public String getDescripcion2() {
        return descripcion2;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }

    public Integer getUnidad() {
        return unidad;
    }

    public void setUnidad(Integer unidad) {
        this.unidad = unidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getDescventa() {
        return descventa;
    }

    public void setDescventa(Double descventa) {
        this.descventa = descventa;
    }

    public Double getDescompra() {
        return descompra;
    }

    public void setDescompra(Double descompra) {
        this.descompra = descompra;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getBalanza() {
        return balanza;
    }

    public void setBalanza(Integer balanza) {
        this.balanza = balanza;
    }

    public Integer getMinimo() {
        return minimo;
    }

    public void setMinimo(Integer minimo) {
        this.minimo = minimo;
    }

    public Integer getMaximo() {
        return maximo;
    }

    public void setMaximo(Integer maximo) {
        this.maximo = maximo;
    }

    public Integer getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Integer impuesto) {
        this.impuesto = impuesto;
    }

    public Double getLucro() {
        return lucro;
    }

    public void setLucro(Double lucro) {
        this.lucro = lucro;
    }

    public Double getLucro2() {
        return lucro2;
    }

    public void setLucro2(Double lucro2) {
        this.lucro2 = lucro2;
    }

    public Integer getCadena() {
        return cadena;
    }

    public void setCadena(Integer cadena) {
        this.cadena = cadena;
    }

    public Double getCostopromedio() {
        return costopromedio;
    }

    public void setCostopromedio(Double costopromedio) {
        this.costopromedio = costopromedio;
    }

    public Double getCostocompra() {
        return costocompra;
    }

    public void setCostocompra(Double costocompra) {
        this.costocompra = costocompra;
    }

    public Double getCostoneto() {
        return costoneto;
    }

    public void setCostoneto(Double costoneto) {
        this.costoneto = costoneto;
    }

    public Double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(Double precioventa) {
        this.precioventa = precioventa;
    }

    public Double getPrecioventa2() {
        return precioventa2;
    }

    public void setPrecioventa2(Double precioventa2) {
        this.precioventa2 = precioventa2;
    }

    public Double getOffline() {
        return offline;
    }

    public void setOffline(Double offline) {
        this.offline = offline;
    }

    public Double getOffline2() {
        return offline2;
    }

    public void setOffline2(Double offline2) {
        this.offline2 = offline2;
    }

    public Date getUfmov() {
        return ufmov;
    }

    public void setUfmov(Date ufmov) {
        this.ufmov = ufmov;
    }

    public Double getUcant() {
        return ucant;
    }

    public void setUcant(Double ucant) {
        this.ucant = ucant;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public Double getPorrecibir() {
        return porrecibir;
    }

    public void setPorrecibir(Double porrecibir) {
        this.porrecibir = porrecibir;
    }

    public boolean isAfectastock() {
        return afectastock;
    }

    public void setAfectastock(boolean afectastock) {
        this.afectastock = afectastock;
    }

    public Integer getFleje() {
        return fleje;
    }

    public void setFleje(Integer fleje) {
        this.fleje = fleje;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public int getTecla() {
        return tecla;
    }

    public void setTecla(int tecla) {
        this.tecla = tecla;
    }

    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    public Double getComision2() {
        return comision2;
    }

    public void setComision2(Double comision2) {
        this.comision2 = comision2;
    }

    public Double getComision3() {
        return comision3;
    }

    public void setComision3(Double comision3) {
        this.comision3 = comision3;
    }

    public Date getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(Date fechaalta) {
        this.fechaalta = fechaalta;
    }

    public String getUsuarioalta() {
        return usuarioalta;
    }

    public void setUsuarioalta(String usuarioalta) {
        this.usuarioalta = usuarioalta;
    }

    public Date getFechamod() {
        return fechamod;
    }

    public void setFechamod(Date fechamod) {
        this.fechamod = fechamod;
    }

    public String getUsuariomod() {
        return usuariomod;
    }

    public void setUsuariomod(String usuariomod) {
        this.usuariomod = usuariomod;
    }

    public boolean isDel() {
        return del;
    }

    public void setDel(boolean del) {
        this.del = del;
    }

    public List<Mstock> getMstockList() {
        return mstockList;
    }

    public void setMstockList(List<Mstock> mstockList) {
        this.mstockList = mstockList;
    }

    public List<Mpdvitem> getMpdvitemList() {
        return mpdvitemList;
    }

    public void setMpdvitemList(List<Mpdvitem> mpdvitemList) {
        this.mpdvitemList = mpdvitemList;
    }

    public List<Dcodigos> getDcodigosList() {
        return dcodigosList;
    }

    public void setDcodigosList(List<Dcodigos> dcodigosList) {
        this.dcodigosList = dcodigosList;
    }

    public Dclasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Dclasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

}
