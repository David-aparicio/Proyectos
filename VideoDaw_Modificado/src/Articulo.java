import java.time.LocalDate;

public class Articulo {
    protected String titulo;
    protected int cod;
    protected LocalDate fechaRegistro;
    protected LocalDate fechaBaja;
    protected static int codigo = 1;


    public Articulo(String titulo, String cod) {
        this.cod = codigo;
        codigo++;
        this.titulo = titulo;
        this.fechaRegistro = LocalDate.now();
        this.fechaBaja = null;
    }

    public int getCod() {
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