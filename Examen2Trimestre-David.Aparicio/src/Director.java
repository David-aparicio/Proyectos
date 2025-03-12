import java.time.LocalDate;

public class Director extends Trabajador{
    private String numTelefono;
    private boolean reunido;
    private boolean feuraOfi;

    public Director(String nombre, LocalDate fechaNacimiento, String dni, String direccion, String numeroSS, String email,
            int salario, departamentosTrabajador departamento, String numTelefono) {
        super(nombre, fechaNacimiento, dni, direccion, numeroSS, email, salario, departamento);
        this.numTelefono = numTelefono;
        this.reunido = reunido;
        this.feuraOfi = feuraOfi;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public boolean isReunido() {
        return reunido;
    }

    public boolean isEnlaofi() {
        return isEnlaofi();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Director{");
        sb.append("numTelefono=").append(numTelefono);
        sb.append(", reunido=").append(reunido);
        sb.append(", enlaofi=").append(feuraOfi);
        sb.append('}');
        return sb.toString();
    }

    
    
}
