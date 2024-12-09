
import java.time.LocalDate;

public class Cliente {

    private static int contador = 1;
    private String dni;
    private String nombre;
    private String numSocio;
    private String direccion;
    private LocalDate fechaNacimiento;
    private LocalDate fechaBaja;
    private Pelicula [] peliculasAlquiladas;
    private int nAlquiladas;

 //   private LocalDate hoy;

    public Cliente(String dni, String nombre, String direccion, LocalDate fechaNacimiento){
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numSocio = "SO-"+contador;
        contador++;
        this.fechaNacimiento = fechaNacimiento;
        this.peliculasAlquiladas = new Pelicula[100];
        this.nAlquiladas = 0;
    }

    public String getDni(){
        return dni;
    }
    public static int getContador() {
        return contador;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNumSocio() {
        return numSocio;
    }
    public String getDireccion() {
        return direccion;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public LocalDate getFechaBaja() {
        return fechaBaja;
    }
    public int getNAlquiladas(){
        return nAlquiladas;
    }
    public Pelicula[] getPeliculasAlquiladas() {
        return peliculasAlquiladas;
    }  

    public String mostrarInfoCliente(){
        String infoC = String.format("Cliente - DNI: %s Nombre: %s Número de socio: %s Dirección: %s Fecha de Nacimiento: %s Fecha de Baja: ", this.dni, this.nombre, this.numSocio,
         this.direccion, this.fechaNacimiento, this.fechaBaja);
         return infoC;
    }

   //public boolean añadirPelicula(Pelicula nuevapePelicula)
   public boolean añadirPelicula (Pelicula nuevaPelicula){
    boolean isAdd = false;
    if (nuevaPelicula != null) {
        this.peliculasAlquiladas[nAlquiladas] = nuevaPelicula;
        this.nAlquiladas++;
        isAdd = true;
    }
    return isAdd;
   }
   public boolean eliminarPelicula(Pelicula p1) {
    boolean isRemoved = false;
    if (p1 != null) {
        int index = -1;

        // Buscar la película en el array
        for (int i = 0; i < this.nAlquiladas; i++) {
            if (this.peliculasAlquiladas[i] != null && 
                this.peliculasAlquiladas[i].getCodigoPelicula().equalsIgnoreCase(p1.getCodigoPelicula())) {
                index = i;
                break;
            }
        }

        // Si la película fue encontrada, eliminarla
        if (index != -1) {
            for (int i = index + 1; i < this.nAlquiladas; i++) {
                this.peliculasAlquiladas[i - 1] = this.peliculasAlquiladas[i];
            }
            this.peliculasAlquiladas[this.nAlquiladas - 1] = null; // Limpiar el último elemento
            this.nAlquiladas--;
            isRemoved = true;
        }
    }
    return isRemoved;
}

    public void mostrarPeliculas(){
    for (int i = 0; i < nAlquiladas; i++) {
        System.err.println(peliculasAlquiladas[i].mostrarInfoPelicula());
    }
   }

    public int getnAlquiladas() {
        return nAlquiladas;
    }
}
