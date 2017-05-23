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
@Table(name = "fpdvformapago")
public class Fpdvformapago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "ticket")
    private int ticket;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Column(name = "idpagdo")
    private int idpagdo;
    @Column(name = "pagado")
    private double pagado;
    @Column(name = "valor")
    private double valor;
    @Column(name = "xmoneda")
    private double xmoneda;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "anuladopor")
    private String anuladopor;
    @Column(name = "del")
    private boolean del;
    @JoinColumn(name = "moneda", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Dmonedas moneda;
    @JoinColumn(name = "pdv", referencedColumnName = "nropdv")
    @ManyToOne(optional = false)
    private Dpdv pdv;

    public Fpdvformapago() {
    }

    public Fpdvformapago(Long id) {
        this.id = id;
    }

    public Fpdvformapago(Long id, int ticket, Date fecha, Date hora, int idpagdo, double pagado, double valor, double xmoneda, String usuario, String anuladopor, boolean del) {
        this.id = id;
        this.ticket = ticket;
        this.fecha = fecha;
        this.hora = hora;
        this.idpagdo = idpagdo;
        this.pagado = pagado;
        this.valor = valor;
        this.xmoneda = xmoneda;
        this.usuario = usuario;
        this.anuladopor = anuladopor;
        this.del = del;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
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

    public int getIdpagdo() {
        return idpagdo;
    }

    public void setIdpagdo(int idpagdo) {
        this.idpagdo = idpagdo;
    }

    public double getPagado() {
        return pagado;
    }

    public void setPagado(double pagado) {
        this.pagado = pagado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getXmoneda() {
        return xmoneda;
    }

    public void setXmoneda(double xmoneda) {
        this.xmoneda = xmoneda;
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

    public boolean getDel() {
        return del;
    }

    public void setDel(boolean del) {
        this.del = del;
    }

    public Dmonedas getMoneda() {
        return moneda;
    }

    public void setMoneda(Dmonedas moneda) {
        this.moneda = moneda;
    }

    public Dpdv getPdv() {
        return pdv;
    }

    public void setPdv(Dpdv pdv) {
        this.pdv = pdv;
    }    
}
