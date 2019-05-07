package mx.simple.entidad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.simple.entidad.Cita;
import mx.simple.entidad.Historialclinico;
import mx.simple.entidad.Pagogeneral;
import mx.simple.entidad.Pagoortodoncia;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-22T00:13:20")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, String> enfermedades;
    public static volatile SingularAttribute<Paciente, Integer> aseguranza;
    public static volatile SingularAttribute<Paciente, Integer> iDPaciente;
    public static volatile SingularAttribute<Paciente, Historialclinico> historialclinico;
    public static volatile SingularAttribute<Paciente, Pagogeneral> pagogeneral;
    public static volatile SingularAttribute<Paciente, String> nombre;
    public static volatile SingularAttribute<Paciente, Integer> numeroDeSeguro;
    public static volatile SingularAttribute<Paciente, String> alergias;
    public static volatile SingularAttribute<Paciente, Date> fechaDeNacimiento;
    public static volatile SingularAttribute<Paciente, String> fechaDeRegistro;
    public static volatile SingularAttribute<Paciente, String> domicilio;
    public static volatile SingularAttribute<Paciente, String> telefono;
    public static volatile SingularAttribute<Paciente, Cita> cita;
    public static volatile SingularAttribute<Paciente, Pagoortodoncia> pagoortodoncia;

}