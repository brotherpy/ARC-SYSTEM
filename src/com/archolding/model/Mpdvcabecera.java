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
@Table(name = "mpdvcabecera")
public class Mpdvcabecera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nrpticket")
    private int nrpticket;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Column(name = "factura")
    private int factura;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "monto")
    private double monto;
    @Column(name = "exenta")
    private double exenta;
    @Column(name = "gravada5")
    private double gravada5;
    @Column(name = "gravada10")
    private double gravada10;
    @Column(name = "descuento")
    private double descuento;
    @Column(name = "pagado")
    private int pagado;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "anuladopor")
    private String anuladopor;
    @Column(name = "anulado")
    private boolean anulado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idpdvcabecera")
    private List<Mpdvitem> mpdvitemList;
    @JoinColumn(name = "nropdv", referencedColumnName = "nropdv")
    @ManyToOne(optional = false)
    private Dpdv nropdv;
    @JoinColumn(name = "ciruc", referencedColumnName = "ciruc")
    @ManyToOne(optional = false)
    private Drenta ciruc;

    public Mpdvcabecera() {
    }

    public Mpdvcabecera(Long id) {
        this.id = id;
    }

    public Mpdvcabecera(Long id, int nrpticket, Date fecha, Date hora, int factura, String nombre, double monto, double exenta, double gravada5, double gravada10, double descuento, int pagado, String usuario, String anuladopor, boolean anulado) {
        this.id = id;
        this.nrpticket = nrpticket;
        this.fecha = fecha;
        this.hora = hora;
        this.factura = factura;
        this.nombre = nombre;
        this.monto = monto;
        this.exenta = exenta;
        this.gravada5 = gravada5;
        this.gravada10 = gravada10;
        this.descuento = descuento;
        this.pagado = pagado;
        this.usuario = usuario;
        this.anuladopor = anuladopor;
        this.anulado = anulado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNrpticket() {
        return nrpticket;
    }

    public void setNrpticket(int nrpticket) {
        this.nrpticket = nrpticket;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getExenta() {
        return exenta;
    }

    public void setExenta(double exenta) {
        this.exenta = exenta;
    }

    public double getGravada5() {
        return gravada5;
    }

    public void setGravada5(double gravada5) {
        this.gravada5 = gravada5;
    }

    public double getGravada10() {
        return gravada10;
    }

    public void setGravada10(double gravada10) {
        this.gravada10 = gravada10;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getPagado() {
        return pagado;
    }

    public void setPagado(int pagado) {
        this.pagado = pagado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getAnuladopor() {
        return anuladopor;
    }

    public void setAnuladopor(String anuladopor) {
        this.anuladopor = anuladopor;
    }

    public boolean getAnulado() {
        return anulado;
    }

    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }

    public List<Mpdvitem> getMpdvitemList() {
        return mpdvitemList;
    }

    public void setMpdvitemList(List<Mpdvitem> mpdvitemList) {
        this.mpdvitemList = mpdvitemList;
    }

    public Dpdv getNropdv() {
        return nropdv;
    }

    public void setNropdv(Dpdv nropdv) {
        this.nropdv = nropdv;
    }

    public Drenta getCiruc() {
        return ciruc;
    }

    public void setCiruc(Drenta ciruc) {
        this.ciruc = ciruc;
    }    
}
