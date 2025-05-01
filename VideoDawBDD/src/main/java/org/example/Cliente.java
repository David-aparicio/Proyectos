package org.example;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cliente {
    private int id; // generado por la base de datos
    private String dni;
    private String nombre;
    private String direccion;
    private String fechaNacimiento;
    private LocalDateTime fechaCreacionUsuario;

    public Cliente(String dni, String nombre, String direccion, String fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaCreacionUsuario = LocalDateTime.now(); // este campo es automático en la BD, puede omitirse al insertar
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDateTime getFechaCreacionUsuario() {
        return fechaCreacionUsuario;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setFechaCreacionUsuario(LocalDateTime fechaCreacionUsuario) {
        this.fechaCreacionUsuario = fechaCreacionUsuario;
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
