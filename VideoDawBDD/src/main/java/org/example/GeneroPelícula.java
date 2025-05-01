package org.example;

public class GeneroPelícula {
    private int id;
    private String nombre;

    public GeneroPelícula(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "GeneroPelícula{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}