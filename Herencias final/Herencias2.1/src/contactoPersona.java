
import java.time.LocalDate;

public class contactoPersona extends contacto{
    private LocalDate cumpleaños;

    public contactoPersona(String nombre, String telefono, LocalDate cumpleaños) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cumpleaños = cumpleaños;
    }

    public LocalDate getCumpleaños() {
        return cumpleaños;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContactoPersona: ");
        sb.append("Nombre: ").append(getNombre());
        sb.append(", Telefono: ").append(getTelefono());
        sb.append(", Cumpleaños: ").append(cumpleaños);
        sb.append('.');
        return sb.toString();
    }
}
