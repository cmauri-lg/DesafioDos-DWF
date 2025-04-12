package sv.edu.udb.controller.request;

public class MateriaRequest {

    private String nombre;

    public MateriaRequest(){
    }

    public MateriaRequest(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
