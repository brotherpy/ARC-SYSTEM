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
@Table(name = "dpdv")
public class Dpdv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nropdv")
    private Long nropdv;
    @Column(name = "nroticket")
    private int nroticket;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pdv")
    private List<Fpdvformapago> fpdvformapagoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nropdv")
    private List<Mpdvcabecera> mpdvcabeceraList;

    public Dpdv() {
    }

    public Dpdv(Long nropdv) {
        this.nropdv = nropdv;
    }

    public Dpdv(Long nropdv, int nroticket) {
        this.nropdv = nropdv;
        this.nroticket = nroticket;
    }

    public Long getNropdv() {
        return nropdv;
    }

    public void setNropdv(Long nropdv) {
        this.nropdv = nropdv;
    }

    public int getNroticket() {
        return nroticket;
    }

    public void setNroticket(int nroticket) {
        this.nroticket = nroticket;
    }

    public List<Fpdvformapago> getFpdvformapagoList() {
        return fpdvformapagoList;
    }

    public void setFpdvformapagoList(List<Fpdvformapago> fpdvformapagoList) {
        this.fpdvformapagoList = fpdvformapagoList;
    }

    public List<Mpdvcabecera> getMpdvcabeceraList() {
        return mpdvcabeceraList;
    }

    public void setMpdvcabeceraList(List<Mpdvcabecera> mpdvcabeceraList) {
        this.mpdvcabeceraList = mpdvcabeceraList;
    }
   
}
