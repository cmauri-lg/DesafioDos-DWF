package sv.edu.udb.controller.response;

public class AlumnoResponse {
    private Long id;
    private String nombre;
    private String apellido;
    private MateriaResponse materia; // Representa la materia relacionada

    // Constructor vacío
    public AlumnoResponse() {}

    // Constructor con parámetros
    public AlumnoResponse(Long id, String nombre, String apellido, MateriaResponse materia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public MateriaResponse getMateria() {
        return materia;
    }

    public void setMateria(MateriaResponse materia) {
        this.materia = materia;
    }

}
