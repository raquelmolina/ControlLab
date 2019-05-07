/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Raquel
 */
@Entity
@Table(name = "paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p")
    , @NamedQuery(name = "Paciente.findByIDPaciente", query = "SELECT p FROM Paciente p WHERE p.iDPaciente = :iDPaciente")
    , @NamedQuery(name = "Paciente.findByNombre", query = "SELECT p FROM Paciente p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Paciente.findByFechaDeRegistro", query = "SELECT p FROM Paciente p WHERE p.fechaDeRegistro = :fechaDeRegistro")
    , @NamedQuery(name = "Paciente.findByFechaDeNacimiento", query = "SELECT p FROM Paciente p WHERE p.fechaDeNacimiento = :fechaDeNacimiento")
    , @NamedQuery(name = "Paciente.findByTelefono", query = "SELECT p FROM Paciente p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "Paciente.findByDomicilio", query = "SELECT p FROM Paciente p WHERE p.domicilio = :domicilio")
    , @NamedQuery(name = "Paciente.findByEnfermedades", query = "SELECT p FROM Paciente p WHERE p.enfermedades = :enfermedades")
    , @NamedQuery(name = "Paciente.findByAlergias", query = "SELECT p FROM Paciente p WHERE p.alergias = :alergias")
    , @NamedQuery(name = "Paciente.findByAseguranza", query = "SELECT p FROM Paciente p WHERE p.aseguranza = :aseguranza")
    , @NamedQuery(name = "Paciente.findByNumeroDeSeguro", query = "SELECT p FROM Paciente p WHERE p.numeroDeSeguro = :numeroDeSeguro")})
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPaciente")
    private Integer iDPaciente;
    @Basic(optional = false)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "FechaDeRegistro")
    private String fechaDeRegistro;
    @Basic(optional = false)
    @Column(name = "FechaDeNacimiento")   
    private Date fechaDeNacimiento;
    @Basic(optional = false)
    @Column(name = "Telefono")
    private String telefono;
    @Basic(optional = false)
    @Column(name = "Domicilio")
    private String domicilio;
    @Basic(optional = false)
    @Column(name = "Enfermedades")
    private String enfermedades;
    @Basic(optional = false)
    @Column(name = "Alergias")
    private String alergias;
    @Basic(optional = false)
    @Column(name = "Aseguranza")
    private int aseguranza;
    @Basic(optional = false)
    @Column(name = "NumeroDeSeguro")
    private int numeroDeSeguro;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paciente")
    private Historialclinico historialclinico;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paciente")
    private Pagogeneral pagogeneral;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paciente")
    private Cita cita;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "paciente")
    private Pagoortodoncia pagoortodoncia;

    public Paciente() {
    }

    public Paciente(Integer iDPaciente) {
        this.iDPaciente = iDPaciente;
    }

    public Paciente(Integer iDPaciente, String nombre, String fechaDeRegistro, Date fechaDeNacimiento, String telefono, String domicilio, String enfermedades, String alergias, int aseguranza, int numeroDeSeguro) {
        this.iDPaciente = iDPaciente;
        this.nombre = nombre;
        this.fechaDeRegistro = fechaDeRegistro;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.enfermedades = enfermedades;
        this.alergias = alergias;
        this.aseguranza = aseguranza;
        this.numeroDeSeguro = numeroDeSeguro;
    }

    public Integer getIDPaciente() {
        return iDPaciente;
    }

    public void setIDPaciente(Integer iDPaciente) {
        this.iDPaciente = iDPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeRegistro() {
        return fechaDeRegistro;
    }

    public void setFechaDeRegistro(String fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public int getAseguranza() {
        return aseguranza;
    }

    public void setAseguranza(int aseguranza) {
        this.aseguranza = aseguranza;
    }

    public int getNumeroDeSeguro() {
        return numeroDeSeguro;
    }

    public void setNumeroDeSeguro(int numeroDeSeguro) {
        this.numeroDeSeguro = numeroDeSeguro;
    }

    public Historialclinico getHistorialclinico() {
        return historialclinico;
    }

    public void setHistorialclinico(Historialclinico historialclinico) {
        this.historialclinico = historialclinico;
    }

    public Pagogeneral getPagogeneral() {
        return pagogeneral;
    }

    public void setPagogeneral(Pagogeneral pagogeneral) {
        this.pagogeneral = pagogeneral;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public Pagoortodoncia getPagoortodoncia() {
        return pagoortodoncia;
    }

    public void setPagoortodoncia(Pagoortodoncia pagoortodoncia) {
        this.pagoortodoncia = pagoortodoncia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPaciente != null ? iDPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.iDPaciente == null && other.iDPaciente != null) || (this.iDPaciente != null && !this.iDPaciente.equals(other.iDPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.simple.entidad.Paciente[ iDPaciente=" + iDPaciente + " ]";
    }
    
}
