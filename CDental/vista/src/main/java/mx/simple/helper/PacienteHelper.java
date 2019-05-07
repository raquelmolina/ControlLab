/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.helper;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.faces.context.FacesContext;
import mx.simple.delegate.PacienteDelegate;
import mx.simple.entidad.Paciente;
import mx.simple.integracion.ServiceFacadeLocator;

/**
 *
 * @author luisc
 */

public class PacienteHelper implements Serializable{
    
   Paciente paciente;
    /**
     * Metodo para hacer login llamara a la instancia de usuarioFacade
     * @param paciente
    
     * @return 
     */
    public Paciente Registro(Paciente paciente){
       ServiceFacadeLocator.getInstanceFacadePaciente().savePaciente(paciente);
       return null;
        
    }
    public List<Paciente> Consulta(){
        List<Paciente> pa= ServiceFacadeLocator.getInstanceFacadePaciente().Consultar();
       return pa;
        
    }
    
}