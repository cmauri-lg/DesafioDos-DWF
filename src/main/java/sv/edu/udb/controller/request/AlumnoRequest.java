package sv.edu.udb.controller.request;

public class AlumnoRequest {

    private String nombre;
    private String apellido;
    private Long idMateria; // Clave foránea

    // Constructor vacío
    public AlumnoRequest() {}

    // Constructor con parámetros
    public AlumnoRequest(String nombre, String apellido, Long idMateria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idMateria = idMateria;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Long idMateria) {
        this.idMateria = idMateria;
    }

}
