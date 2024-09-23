package org.example.modelos;

public class Cliente {

    private String nombre;
    private String identificacion;
    private String edad;
    private String telefono;
    private String genero;

    public Cliente() {
    }

    public Cliente(String nombre, String identificacion, String edad, String telefono, String genero) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
        this.telefono = telefono;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
