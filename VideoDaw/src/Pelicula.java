
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pelicula {
     
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private static int contador = 0;

    private int codigoPelicula;
    private String titulo;
    private Genero genero;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquilada;
    private boolean IsAlquilada;


    public Pelicula(String CodigoPelicula,Genero genero, String Titulo){
       this.codigoPelicula = contador;
       contador++;
       this.titulo = titulo;
       this.genero = genero;
       this.fechaRegistro = LocalDate.now();
       this.fechaBaja = LocalDate.now();
       this.fechaAlquilada = LocalDateTime.now();
       this.IsAlquilada = false;
    }

    public int getCodigoPelicula(){
        return codigoPelicula;
    }

}
