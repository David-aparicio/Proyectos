package org.example;

import java.time.LocalDateTime;

public class Videojuego extends Articulo{
private GeneroVideojuego vGenero;
private boolean isAlquilada;
private LocalDateTime fechaAlquiler;

public Videojuego(String titulo, String cod, GeneroVideojuego vGenero) {
    super(titulo, cod);
    this.vGenero = vGenero;
    this.isAlquilada = false;
    this.fechaAlquiler = fechaAlquiler;
}

public GeneroVideojuego getvGenero() {
    return vGenero;
}

public boolean isAlquilada() {
    return isAlquilada;
}

public LocalDateTime getFechaAlquiler() {
    return fechaAlquiler;
}

public void setAlquilada(boolean isAlquilada) {
    this.isAlquilada = isAlquilada;
}

public void setFechaAlquiler(LocalDateTime fechaAlquiler) {
    this.fechaAlquiler = fechaAlquiler;
}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Videojuego{");
        sb.append("vGenero=").append(vGenero);
        sb.append(", isAlquilada=").append(isAlquilada);
        sb.append(", fechaAlquiler=").append(fechaAlquiler);
        sb.append('}');
        return sb.toString();
    }


}
