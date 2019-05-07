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
@Table(name = "estado_prestamo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoPrestamo.findAll", query = "SELECT e FROM EstadoPrestamo e")
    , @NamedQuery(name = "EstadoPrestamo.findByIdEstado", query = "SELECT e FROM EstadoPrestamo e WHERE e.idEstado = :idEstado")
    , @NamedQuery(name = "EstadoPrestamo.findByEstado", query = "SELECT e FROM EstadoPrestamo e WHERE e.estado = :estado")})
public class EstadoPrestamo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEstado")
    private Integer idEstado;
    @Size(max = 45)
    @Column(name = "estado")
    private String estado;

    public EstadoPrestamo() {
    }

    public EstadoPrestamo(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstado != null ? idEstado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoPrestamo)) {
            return false;
        }
        EstadoPrestamo other = (EstadoPrestamo) object;
        if ((this.idEstado == null && other.idEstado != null) || (this.idEstado != null && !this.idEstado.equals(other.idEstado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uabc.edu.mx.entidad.EstadoPrestamo[ idEstado=" + idEstado + " ]";
    }
    
}
