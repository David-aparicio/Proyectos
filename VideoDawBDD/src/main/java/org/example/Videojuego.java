package org.example;

import java.time.LocalDateTime;

public class Videojuego {
    private int id;
    private String codigo;
    private String titulo;
    private int generoId;
    private LocalDateTime fechaRegistro;
    private LocalDateTime fechaAlquilada;
    private boolean isAlquilada;

    public Videojuego(String titulo, int generoId) {
        this.titulo = titulo;
        this.generoId = generoId;
        this.fechaRegistro = LocalDateTime.now();
        this.fechaAlquilada = null;
        this.isAlquilada = false;
    }

    // Getters y setters
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public int getGeneroId() { return generoId; }
    public LocalDateTime getFechaRegistro() { return fechaRegistro; }
    public LocalDateTime getFechaAlquilada() { return fechaAlquilada; }
    public boolean isAlquilada() { return isAlquilada; }

    public void setFechaAlquilada(LocalDateTime fechaAlquilada) { this.fechaAlquilada = fechaAlquilada; }
    public void setAlquilada(boolean alquilada) { isAlquilada = alquilada; }

    @Override
    public String toString() {
        return "Videojuego{" +
                ", titulo='" + titulo + '\'' +
                ", generoId=" + generoId +
                ", fechaRegistro=" + fechaRegistro +
                ", fechaAlquilada=" + fechaAlquilada +
                ", isAlquilada=" + isAlquilada +
                '}';
    }
}
