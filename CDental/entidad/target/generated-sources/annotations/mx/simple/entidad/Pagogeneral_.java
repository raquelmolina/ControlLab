package mx.simple.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.simple.entidad.Paciente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-22T00:13:20")
@StaticMetamodel(Pagogeneral.class)
public class Pagogeneral_ { 

    public static volatile SingularAttribute<Pagogeneral, String> procedimientoRealizado;
    public static volatile SingularAttribute<Pagogeneral, Integer> iDPaciente;
    public static volatile SingularAttribute<Pagogeneral, Float> precio;
    public static volatile SingularAttribute<Pagogeneral, Paciente> paciente;

}