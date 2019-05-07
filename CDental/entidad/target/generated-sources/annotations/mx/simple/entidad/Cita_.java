package mx.simple.entidad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.simple.entidad.Paciente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-22T00:13:20")
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, Integer> iDPaciente;
    public static volatile SingularAttribute<Cita, Float> precio;
    public static volatile SingularAttribute<Cita, String> tipoDeProcedimiento;
    public static volatile SingularAttribute<Cita, Date> hora;
    public static volatile SingularAttribute<Cita, Paciente> paciente;
    public static volatile SingularAttribute<Cita, Date> fechaDeCita;

}