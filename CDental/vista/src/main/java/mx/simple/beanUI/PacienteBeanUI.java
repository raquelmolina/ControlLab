/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.beanUI;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import mx.simple.entidad.Paciente;
import mx.simple.helper.PacienteHelper;
/**
 *
 * @author luisc
 */

@ManagedBean(name = "pacienteUI")
@SessionScoped
public class PacienteBeanUI implements Serializable {
    private PacienteHelper  pacienteHelper;
    private Paciente paciente;
    private List<Paciente> pac;
    private List<Paciente> filtro;
    String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

  
    
    public PacienteBeanUI() throws IOException{
        pacienteHelper = new PacienteHelper();
        paciente = new Paciente();
      pac= consulta();
    }
    
     /**
     * Metodo postconstructor todo lo que este dentro de este metodo
     * sera la primero que haga cuando cargue la pagina
     */
      @PostConstruct
    public void init(){
        paciente= new Paciente();
    }

     public void registro() throws IOException{
     
        // los atributos de usuario vienen del xhtml 
        paciente.setEnfermedades("ninguna");
        paciente.setAlergias("ninguna");
        paciente.setIDPaciente(0);
        paciente.setFechaDeNacimiento(Date.valueOf(fecha));
        pacienteHelper.Registro(paciente);
        
     }
     
     public List<Paciente> consulta() throws IOException{
         List<Paciente> pa = pacienteHelper.Consulta();
        return pa;
     }
     
     
     
     public void registrar() {
         String appURL = "/index.xhtml";
         
        
     }
    
    /* getters y setters*/

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Paciente> getFiltro() {
        return filtro;
    }

    public void setFiltro(List<Paciente> filtro) {
        this.filtro = filtro;
    }

    public List<Paciente> getPac() {
        return pac;
    }

    public void setPac(List<Paciente> pac) {
        this.pac = pac;
    }
    
    
    
    
    
    
    
    
}
