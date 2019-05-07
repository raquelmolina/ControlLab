/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabc.edu.mx.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Raquel
 */
@Entity
@Table(name = "duracion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Duracion.findAll", query = "SELECT d FROM Duracion d")
    , @NamedQuery(name = "Duracion.findByIdDuracion", query = "SELECT d FROM Duracion d WHERE d.idDuracion = :idDuracion")
    , @NamedQuery(name = "Duracion.findByTipoDuracion", query = "SELECT d FROM Duracion d WHERE d.tipoDuracion = :tipoDuracion")})
public class Duracion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idDuracion")
    private Integer idDuracion;
    @Size(max = 45)
    @Column(name = "tipoDuracion")
    private String tipoDuracion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDuracion")
    private List<Periodo> periodoList;

    public Duracion() {
    }

    public Duracion(Integer idDuracion) {
        this.idDuracion = idDuracion;
    }

    public Integer getIdDuracion() {
        return idDuracion;
    }

    public void setIdDuracion(Integer idDuracion) {
        this.idDuracion = idDuracion;
    }

    public String getTipoDuracion() {
        return tipoDuracion;
    }

    public void setTipoDuracion(String tipoDuracion) {
        this.tipoDuracion = tipoDuracion;
    }

    @XmlTransient
    public List<Periodo> getPeriodoList() {
        return periodoList;
    }

    public void setPeriodoList(List<Periodo> periodoList) {
        this.periodoList = periodoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDuracion != null ? idDuracion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Duracion)) {
            return false;
        }
        Duracion other = (Duracion) object;
        if ((this.idDuracion == null && other.idDuracion != null) || (this.idDuracion != null && !this.idDuracion.equals(other.idDuracion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uabc.edu.mx.entidad.Duracion[ idDuracion=" + idDuracion + " ]";
    }
    
}
