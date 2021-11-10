package web.actions;

import com.opensymphony.xwork2.ActionSupport;
import domain.entity.Alumno;
import java.util.*;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;
import servicio.ServicioAlumno;

/**
 *
 * Clase de tipo accion encargada de redireccionar al jsp listarAlumnos, y
 * obtener una lista de alumnos hallados en la base de datos solicitandolo a la
 * capa de servicio
 *
 * @author Juan pastelin Brioso
 * @version 1.0
 */
@Results({
    @Result(name = "success", location = "/WEB-INF/content/listarAlumnos.jsp"),
    @Result(name = "redireccionFormAlumno", location = "/WEB-INF/content/formAlumno.jsp"),
    @Result(name = "exitoMostrarAlumno", location="/WEB-INF/content/visualizarAlumno.jsp"),
    @Result(name="exitoAgregarAlumno", location="listarAlumnos", type="redirectAction"),
    @Result(name="modificacionExitosa", location="listarAlumnos", type="redirectAction"),
    @Result(name="eliminacionExitosa", location="listarAlumnos", type="redirectAction")
    
})
public class AlumnosAction extends ActionSupport {

    Logger log = LogManager.getLogger(AlumnosAction.class);
    private ServicioAlumno servicioAlumno;
    private List<Alumno> listaAlumnos;
    private Integer id;
    private Alumno alumno;

    @Action("listarAlumnos")
    @Override
    public String execute() {

        log.info("#ListarAlumnosActio.execute# : Redireccionando al jsp listar-alumnos");
        servicioAlumno = new ServicioAlumno();
        this.listaAlumnos = servicioAlumno.listar();
        return SUCCESS;
    }

    @Action("formAlumno")
    public String redireccionarFormAlumno() {
        return "redireccionFormAlumno";
    }

    @Action("mostrarAlumno")
    public String mostrarAlumno() {
        log.info("Iniciando el metodo excute de la clase AlumnosAction");

        if (this.id != null) {
            servicioAlumno = new ServicioAlumno();
            alumno = new Alumno(this.id);
            alumno = servicioAlumno.buscarPorId(alumno);
        }
        return "exitoMostrarAlumno";
    }
    
    @Action("agregarAlumno")
    public String agregarAlumno() {
        log.info("Iniciando el metodo agregarAlumno de la clase AlumnosAction");
        
        if(this.alumno != null) {
            servicioAlumno = new ServicioAlumno();
            servicioAlumno.insertar(alumno);
        }
        return "exitoAgregarAlumno";
    }
    
    @Action("modificarAlumno")
    public String modificarAlumno() {
        log.info("Iniciando el metodo modificarAlumno de la clase AlumnosAction");
        
        servicioAlumno = new ServicioAlumno();
        servicioAlumno.modificar(alumno);
        
        return "modificacionExitosa";
    }
    
    @Action("eliminarAlumno")
    public String eliminarAlumno() {
        log.info("Iniciando el metodo eliminar de la clase ModificarAlumnoAction");
        
        servicioAlumno = new ServicioAlumno();
        servicioAlumno.eliminar(alumno);
        
        return "eliminacionExitosa";
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(List<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    
}
