
import java.time.LocalDate;

public class Cliente {


    private String dni;
    private String nombre;
    private int numSocio;
    private String direccion;
    private LocalDate fechaNacimiento;
    private LocalDate fechaBaja;
    private Pelicula [] peliculasAlquiladas;

    public Cliente(String dni, String nombre, String direccion, LocalDate fechaNacimiento,Pelicula peliculasAlquiladas){
        this.dni = dni;
        this.nombre = nombre;
        
    }

}
