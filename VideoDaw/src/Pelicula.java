
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pelicula {
     
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private static int contador = 0;

    private String codigoPelicula;
    private String titulo;
    private Genero pGenero;
    private LocalDate fechaRegistro;
    private LocalDate fechaBaja;
    private LocalDateTime fechaAlquilada;
    private boolean isAlquilada;


    public Pelicula(Genero genero, String titulo){

       this.codigoPelicula = "PE-"+contador;
       contador++;
       this.titulo = titulo;
       this.pGenero = pGenero;
       this.fechaRegistro = LocalDate.now();
       this.isAlquilada = false;
    }

    public String getCodigoPelicula(){
        return codigoPelicula;
    }
    public String getTitulo(){
        return titulo;
    }
    public Genero getPGenero(){
        return pGenero;
    }
    public LocalDate getFechaRegistro(){
        return fechaRegistro;
    }
    public LocalDate getFechaBaja(){
        return fechaBaja;
    }
    public LocalDateTime getFechaAlquilada(){
        return fechaAlquilada;
    }
    public boolean getIsAlquilada(){
        return isAlquilada;
    }

        public void setFechaAlquilada(LocalDateTime fechaalq){
        this.fechaAlquilada = fechaalq;
        if (fechaalq != null) {
            this.isAlquilada = true;
        }else{
            this.isAlquilada = false;
        }
        }

    public String mostrarInfoPelicula(){
        String infoP = String.format("Pelicula - codigoPelicula: %s titulo: %s pGenero: %s fechaRegistro: %s fechaBaja: %s fechaAlquilada: %s isAlquilada: ", this.codigoPelicula,
         this.titulo, this.pGenero, this.fechaRegistro,this.fechaBaja
        , this.fechaAlquilada,this.isAlquilada);
        return infoP+"\n";
    }
    public boolean Alquiler(){ 
        this.isAlquilada = true;
        this.fechaAlquilada = LocalDateTime.now();
        return isAlquilada;
    }
}
