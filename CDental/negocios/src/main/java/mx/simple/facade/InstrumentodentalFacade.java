/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.simple.facade;

import mx.simple.delegate.CitaDelegate;
import mx.simple.delegate.HistorialclinicoDelegate;
import mx.simple.delegate.InstrumentodentalDelegate;
import mx.simple.entidad.Cita;
import mx.simple.entidad.Historialclinico;
import mx.simple.entidad.Instrumentodental;

/**
 *
 * @author Raquel
 */
public class InstrumentodentalFacade {
    private final InstrumentodentalDelegate instrumentodentalDelegate;

    public InstrumentodentalFacade() {
        this.instrumentodentalDelegate = new InstrumentodentalDelegate();
    }
    
    public void guardarInstrumentodental(Instrumentodental instrumentodental){
        instrumentodentalDelegate.saveInstrumentodental(instrumentodental);
    }
}
