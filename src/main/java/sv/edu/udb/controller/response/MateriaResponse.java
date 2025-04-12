package sv.edu.udb.controller.response;


public class MateriaResponse {

    private Long id;
    private String nombre;

    // Constructor vacío
    public MateriaResponse() {}

    // Constructor con parámetros
    public MateriaResponse(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

}
