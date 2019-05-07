/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.facade;

import java.util.List;
import mx.simple.delegate.PacienteDelegate;
import mx.simple.entidad.Paciente;

/**
 *
 * @author Raquel
 */
public class PacienteFacade {
private final PacienteDelegate pacienteDelegate;

    /**
     * @Visibility
     * se ha decido hacer publico ya
     * que es el intermediario entre base de datos y vista
     */
    public PacienteFacade() {
        this.pacienteDelegate = new PacienteDelegate();
    }
    
    public void savePaciente(Paciente paciente){
        pacienteDelegate.savePaciente(paciente);
    }


    /**
     * @return pa
     * lista de pacientes que estan guardados en la base de datos
     */
    public List<Paciente> Consultar(){
       List<Paciente> pa= pacienteDelegate.Consultar();
       return pa;
    }
}
