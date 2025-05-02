package org.example;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cliente {
    private int id; // generado por la base de datos
    private String dni;
    private String nombre;
    private String direccion;
    private long fechaNacimiento; // Usamos epoch en lugar de LocalDate
    private long fechaCreacionUsuario;

    public Cliente(String dni, String nombre, String direccion, long fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaCreacionUsuario = System.currentTimeMillis() / 1000;
    }


    public int getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getFechaNacimiento() { return fechaNacimiento; }
    public long getFechaCreacionUsuario() { return fechaCreacionUsuario; }


    public void setId(int id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", fechaCreacionUsuario=" + fechaCreacionUsuario +
                '}';
    }
}
