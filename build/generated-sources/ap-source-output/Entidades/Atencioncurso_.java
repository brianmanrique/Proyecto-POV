package Entidades;

import Entidades.Cursos;
import Entidades.Docentes;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-05-29T14:43:44")
@StaticMetamodel(Atencioncurso.class)
public class Atencioncurso_ { 

    public static volatile SingularAttribute<Atencioncurso, Integer> idAtencionCurso;
    public static volatile SingularAttribute<Atencioncurso, Date> horaInicioAtencion;
    public static volatile SingularAttribute<Atencioncurso, Integer> diaSemana;
    public static volatile SingularAttribute<Atencioncurso, Docentes> docenteACargo;
    public static volatile SingularAttribute<Atencioncurso, Cursos> curso;
    public static volatile SingularAttribute<Atencioncurso, Date> horaFinalAtencion;

}