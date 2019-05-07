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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "solicitante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Solicitante.findAll", query = "SELECT s FROM Solicitante s")
    , @NamedQuery(name = "Solicitante.findByIdSolicitante", query = "SELECT s FROM Solicitante s WHERE s.idSolicitante = :idSolicitante")
    , @NamedQuery(name = "Solicitante.findByNombres", query = "SELECT s FROM Solicitante s WHERE s.nombres = :nombres")
    , @NamedQuery(name = "Solicitante.findByApellidos", query = "SELECT s FROM Solicitante s WHERE s.apellidos = :apellidos")
    , @NamedQuery(name = "Solicitante.findByCarrera", query = "SELECT s FROM Solicitante s WHERE s.carrera = :carrera")
    , @NamedQuery(name = "Solicitante.findBySemestre", query = "SELECT s FROM Solicitante s WHERE s.semestre = :semestre")
    , @NamedQuery(name = "Solicitante.findByEstado", query = "SELECT s FROM Solicitante s WHERE s.estado = :estado")})
public class Solicitante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idSolicitante")
    private Integer idSolicitante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellidos")
    private String apellidos;
    @Size(max = 45)
    @Column(name = "carrera")
    private String carrera;
    @Size(max = 45)
    @Column(name = "semestre")
    private String semestre;
    @Column(name = "estado")
    private Integer estado;
    @JoinColumn(name = "idTipoSolicitante", referencedColumnName = "idTipoSolicitante")
    @ManyToOne(optional = false)
    private Tiposolicitante idTipoSolicitante;

    public Solicitante() {
    }

    public Solicitante(Integer idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public Solicitante(Integer idSolicitante, String nombres, String apellidos) {
        this.idSolicitante = idSolicitante;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Integer getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(Integer idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Tiposolicitante getIdTipoSolicitante() {
        return idTipoSolicitante;
    }

    public void setIdTipoSolicitante(Tiposolicitante idTipoSolicitante) {
        this.idTipoSolicitante = idTipoSolicitante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSolicitante != null ? idSolicitante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitante)) {
            return false;
        }
        Solicitante other = (Solicitante) object;
        if ((this.idSolicitante == null && other.idSolicitante != null) || (this.idSolicitante != null && !this.idSolicitante.equals(other.idSolicitante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uabc.edu.mx.entidad.Solicitante[ idSolicitante=" + idSolicitante + " ]";
    }
    
}
