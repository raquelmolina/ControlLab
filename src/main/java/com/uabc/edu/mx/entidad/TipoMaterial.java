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
@Table(name = "tipo_material")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoMaterial.findAll", query = "SELECT t FROM TipoMaterial t")
    , @NamedQuery(name = "TipoMaterial.findByIdTipoMaterial", query = "SELECT t FROM TipoMaterial t WHERE t.idTipoMaterial = :idTipoMaterial")
    , @NamedQuery(name = "TipoMaterial.findByNombre", query = "SELECT t FROM TipoMaterial t WHERE t.nombre = :nombre")})
public class TipoMaterial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTipoMaterial")
    private Integer idTipoMaterial;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;

    public TipoMaterial() {
    }

    public TipoMaterial(Integer idTipoMaterial) {
        this.idTipoMaterial = idTipoMaterial;
    }

    public Integer getIdTipoMaterial() {
        return idTipoMaterial;
    }

    public void setIdTipoMaterial(Integer idTipoMaterial) {
        this.idTipoMaterial = idTipoMaterial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoMaterial != null ? idTipoMaterial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoMaterial)) {
            return false;
        }
        TipoMaterial other = (TipoMaterial) object;
        if ((this.idTipoMaterial == null && other.idTipoMaterial != null) || (this.idTipoMaterial != null && !this.idTipoMaterial.equals(other.idTipoMaterial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uabc.edu.mx.entidad.TipoMaterial[ idTipoMaterial=" + idTipoMaterial + " ]";
    }
    
}
