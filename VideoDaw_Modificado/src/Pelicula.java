
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pelicula extends Articulo{

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    private GeneroPelícula pGenero;
    private LocalDateTime fechaAlquilada;
    private boolean isAlquilada = false;


    public Pelicula(String cod, GeneroPelícula pGenero, String titulo){
    super(titulo, cod);
    this.pGenero = pGenero;
    this.isAlquilada = false;
    this.fechaAlquilada = fechaAlquilada;
    this.fechaBaja = null;
    }

    public void setFechaAlquiler(LocalDateTime fecha) {
        this.fechaAlquilada = fecha;
    }
    

    public void setAlquilada(boolean isAlquilada) {
        this.isAlquilada = isAlquilada;
    }

    public GeneroPelícula getpGenero() {
        return pGenero;
    }

    public LocalDateTime getFechaAlquilada() {
        return fechaAlquilada;
    }

    public boolean isAlquilada() {
        return isAlquilada;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pelicula{");
        sb.append(", pGenero=").append(pGenero);
        sb.append(", fechaAlquilada=").append(fechaAlquilada);
        sb.append(", isAlquilada=").append(isAlquilada);
        sb.append('}');
        return sb.toString();
    }

}
