
import java.time.LocalDate;
import java.util.LinkedList;

public class GerenteDep extends Trabajador{

    private int numTrabajadoresDep;
    private String numTelefono;
    private LinkedList <GerenteDep> trabajadores;

    public GerenteDep(String numTelefono, String nombre, LocalDate fechaNacimiento, String dni, String direccion, String numeroSS, String email, int salario, departamentosTrabajador departamento) {
        super(nombre, fechaNacimiento, dni, direccion, numeroSS, email, salario, departamento);
        this.numTelefono = numTelefono;
        this.numTrabajadoresDep = numTrabajadoresDep;
        this.trabajadores = new LinkedList<>();
    }

    public int getNumTrabajadoresDep() {
        return numTrabajadoresDep;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public LinkedList<GerenteDep> getTrabajadores() {
        return trabajadores;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GerenteDep{");
        sb.append("numTrabajadoresDep=").append(numTrabajadoresDep);
        sb.append(", numTelefono=").append(numTelefono);
        sb.append(", trabajadores=").append(trabajadores);
        sb.append('}');
        return sb.toString();
    }

    

}
