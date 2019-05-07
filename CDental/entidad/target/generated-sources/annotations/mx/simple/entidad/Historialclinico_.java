package mx.simple.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.simple.entidad.Paciente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-22T00:13:19")
@StaticMetamodel(Historialclinico.class)
public class Historialclinico_ { 

    public static volatile SingularAttribute<Historialclinico, String> enfermedades;
    public static volatile SingularAttribute<Historialclinico, Integer> pacienteIDPaciente;
    public static volatile SingularAttribute<Historialclinico, Paciente> paciente;
    public static volatile SingularAttribute<Historialclinico, String> nombrePaciente;
    public static volatile SingularAttribute<Historialclinico, String> procedimiento;
    public static volatile SingularAttribute<Historialclinico, String> alergias;

}