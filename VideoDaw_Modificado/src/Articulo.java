import java.time.LocalDate;

public class Articulo {
    protected String cod; // El código es un String para poder poner una letra en el codigo.
    protected String titulo;
    protected LocalDate fechaRegistro;
    protected LocalDate fechaBaja;
    protected static int contadorPeliculas = 1;  // Contador para películas
    protected static int contadorVideojuegos = 1; // Contador para videojuegos

    
    public Articulo(String titulo, String tipo) {
        if (tipo.equalsIgnoreCase("P")) {
            this.cod = String.format("P-%04d", contadorPeliculas++);
        } else if (tipo.equalsIgnoreCase("V")) {
            this.cod = String.format("V-%04d", contadorVideojuegos++);
        } else {
            throw new IllegalArgumentException("Tipo de artículo inválido. Usa 'P' para películas o 'V' para videojuegos.");
        }
        this.titulo = titulo;
        this.fechaRegistro = LocalDate.now();
        this.fechaBaja = null; 
    }

    public String getCod() {
        return cod;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    @Override
    public String toString() {
        return "Articulo [cod=" + cod + ", titulo=" + titulo + ", fechaRegistro=" + fechaRegistro + ", fechaBaja="
                + fechaBaja + "]";
    }


}