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
@Table(name = "tiposolicitante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposolicitante.findAll", query = "SELECT t FROM Tiposolicitante t")
    , @NamedQuery(name = "Tiposolicitante.findByIdTipoSolicitante", query = "SELECT t FROM Tiposolicitante t WHERE t.idTipoSolicitante = :idTipoSolicitante")
    , @NamedQuery(name = "Tiposolicitante.findByTipoSolicitante", query = "SELECT t FROM Tiposolicitante t WHERE t.tipoSolicitante = :tipoSolicitante")})
public class Tiposolicitante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTipoSolicitante")
    private Integer idTipoSolicitante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "tipoSolicitante")
    private String tipoSolicitante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoSolicitante")
    private List<Solicitante> solicitanteList;

    public Tiposolicitante() {
    }

    public Tiposolicitante(Integer idTipoSolicitante) {
        this.idTipoSolicitante = idTipoSolicitante;
    }

    public Tiposolicitante(Integer idTipoSolicitante, String tipoSolicitante) {
        this.idTipoSolicitante = idTipoSolicitante;
        this.tipoSolicitante = tipoSolicitante;
    }

    public Integer getIdTipoSolicitante() {
        return idTipoSolicitante;
    }

    public void setIdTipoSolicitante(Integer idTipoSolicitante) {
        this.idTipoSolicitante = idTipoSolicitante;
    }

    public String getTipoSolicitante() {
        return tipoSolicitante;
    }

    public void setTipoSolicitante(String tipoSolicitante) {
        this.tipoSolicitante = tipoSolicitante;
    }

    @XmlTransient
    public List<Solicitante> getSolicitanteList() {
        return solicitanteList;
    }

    public void setSolicitanteList(List<Solicitante> solicitanteList) {
        this.solicitanteList = solicitanteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoSolicitante != null ? idTipoSolicitante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposolicitante)) {
            return false;
        }
        Tiposolicitante other = (Tiposolicitante) object;
        if ((this.idTipoSolicitante == null && other.idTipoSolicitante != null) || (this.idTipoSolicitante != null && !this.idTipoSolicitante.equals(other.idTipoSolicitante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uabc.edu.mx.entidad.Tiposolicitante[ idTipoSolicitante=" + idTipoSolicitante + " ]";
    }
    
}
