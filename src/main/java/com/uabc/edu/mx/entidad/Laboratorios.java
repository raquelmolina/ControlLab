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
@Table(name = "laboratorios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Laboratorios.findAll", query = "SELECT l FROM Laboratorios l")
    , @NamedQuery(name = "Laboratorios.findByLaboratorio", query = "SELECT l FROM Laboratorios l WHERE l.laboratorio = :laboratorio")
    , @NamedQuery(name = "Laboratorios.findByCapacidad", query = "SELECT l FROM Laboratorios l WHERE l.capacidad = :capacidad")
    , @NamedQuery(name = "Laboratorios.findByEquipos", query = "SELECT l FROM Laboratorios l WHERE l.equipos = :equipos")})
public class Laboratorios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "laboratorio")
    private String laboratorio;
    @Column(name = "capacidad")
    private Integer capacidad;
    @Column(name = "equipos")
    private Integer equipos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "laboratorio")
    private List<Horario> horarioList;

    public Laboratorios() {
    }

    public Laboratorios(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getEquipos() {
        return equipos;
    }

    public void setEquipos(Integer equipos) {
        this.equipos = equipos;
    }

    @XmlTransient
    public List<Horario> getHorarioList() {
        return horarioList;
    }

    public void setHorarioList(List<Horario> horarioList) {
        this.horarioList = horarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (laboratorio != null ? laboratorio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Laboratorios)) {
            return false;
        }
        Laboratorios other = (Laboratorios) object;
        if ((this.laboratorio == null && other.laboratorio != null) || (this.laboratorio != null && !this.laboratorio.equals(other.laboratorio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uabc.edu.mx.entidad.Laboratorios[ laboratorio=" + laboratorio + " ]";
    }
    
}
