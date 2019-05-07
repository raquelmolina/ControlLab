/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabc.edu.mx.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Raquel
 */
@Entity
@Table(name = "materiales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materiales.findAll", query = "SELECT m FROM Materiales m")
    , @NamedQuery(name = "Materiales.findByIdMaterial", query = "SELECT m FROM Materiales m WHERE m.idMaterial = :idMaterial")
    , @NamedQuery(name = "Materiales.findByMarca", query = "SELECT m FROM Materiales m WHERE m.marca = :marca")
    , @NamedQuery(name = "Materiales.findByCosto", query = "SELECT m FROM Materiales m WHERE m.costo = :costo")
    , @NamedQuery(name = "Materiales.findByIdTipoMaterial", query = "SELECT m FROM Materiales m WHERE m.idTipoMaterial = :idTipoMaterial")
    , @NamedQuery(name = "Materiales.findByCantidad", query = "SELECT m FROM Materiales m WHERE m.cantidad = :cantidad")})
public class Materiales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idMaterial")
    private Integer idMaterial;
    @Size(max = 45)
    @Column(name = "marca")
    private String marca;
    @Size(max = 45)
    @Column(name = "costo")
    private String costo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTipoMaterial")
    private int idTipoMaterial;
    @Column(name = "cantidad")
    private Integer cantidad;

    public Materiales() {
    }

    public Materiales(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public Materiales(Integer idMaterial, int idTipoMaterial) {
        this.idMaterial = idMaterial;
        this.idTipoMaterial = idTipoMaterial;
    }

    public Integer getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Integer idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public int getIdTipoMaterial() {
        return idTipoMaterial;
    }

    public void setIdTipoMaterial(int idTipoMaterial) {
        this.idTipoMaterial = idTipoMaterial;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMaterial != null ? idMaterial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materiales)) {
            return false;
        }
        Materiales other = (Materiales) object;
        if ((this.idMaterial == null && other.idMaterial != null) || (this.idMaterial != null && !this.idMaterial.equals(other.idMaterial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uabc.edu.mx.entidad.Materiales[ idMaterial=" + idMaterial + " ]";
    }
    
}
