package mx.simple.entidad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.simple.entidad.Paciente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-22T00:13:20")
@StaticMetamodel(Pagoortodoncia.class)
public class Pagoortodoncia_ { 

    public static volatile SingularAttribute<Pagoortodoncia, Integer> iDPaciente;
    public static volatile SingularAttribute<Pagoortodoncia, Paciente> paciente;
    public static volatile SingularAttribute<Pagoortodoncia, Float> abonoDeOrtodoncia;
    public static volatile SingularAttribute<Pagoortodoncia, Integer> saldo;
    public static volatile SingularAttribute<Pagoortodoncia, Float> precioDeTratamiento;
    public static volatile SingularAttribute<Pagoortodoncia, Date> fechaUltimoAbono;

}