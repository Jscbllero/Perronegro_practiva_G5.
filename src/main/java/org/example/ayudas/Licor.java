package org.example.ayudas;

import java.time.LocalDate;

public class Licor {

    private String nombre;
    private String tipo;
    private String marca;
    private String detalle;
    private Double porcentaje;
    private LocalDate fechaCaducidad;


    public Licor() {
    }

    public Licor(String nombre, String tipo, String marca, String detalle, Double porcentaje, LocalDate fechaCaducidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.detalle = detalle;
        this.porcentaje = porcentaje;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
