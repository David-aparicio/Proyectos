
import java.time.LocalDate;
public class Trabajador {

    private String nombre;
    private LocalDate fechaNacimiento;
    private String dni;
    private String direccion;
    private int numeroSS;

    public Trabajador(String nombre,  String dni, String direccion, LocalDate fechaNacimiento  ){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.direccion = direccion;
        this.numeroSS = numeroSS;
    }
    public String getNombre() {
        return nombre;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getDni() {
        return dni;
    }
    public String getDireccion() {
        return direccion;
    }
    public int getNumeroSS() {
        return numeroSS;
    }

    public String mostrarInfoTrabajador(){
        String infoT = String.format("Cliente - Nombre: %s Fecha de nacimiento: %s DNI: %s Direccion: %s Numero de la seguridad social: ", this.nombre,
        this.fechaNacimiento, this.dni, this.direccion, this.numeroSS);
        return infoT;
    }
    public boolean crearPersona(Trabajador tN){
        boolean isAdd = false;
        if(tN != null){
            isAdd = true;
        }
        return isAdd;
    }
}   
