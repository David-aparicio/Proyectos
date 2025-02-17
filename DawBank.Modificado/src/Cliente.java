import java.time.LocalDate;

public class Cliente extends Persona{
//tenga los atributos/propiedades nº teléfono, email, dirección. Modificar el método toString() para mostrar la información correctamente.
    private String numeroTeléfono;
    private String email;
    private String direccion;

    
    public Cliente(String nombre, String dni, LocalDate fechaNacimiento, String numeroTeléfono, String email, String direccion) {
        super(nombre, dni, fechaNacimiento);
        this.numeroTeléfono = numeroTeléfono;
        this.email = email;
        this.direccion = direccion;
    }


    public String getNumeroTeléfono() {
        return numeroTeléfono;
    }


    public void setNumeroTeléfono(String numeroTeléfono) {
        this.numeroTeléfono = numeroTeléfono;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override //Modifico el metodo añadiendo los atributos de persona para luego que se muestre todo
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Nombre: \n").append(nombre);
        sb.append("\n Fecha de Nacimiento: \n").append(fechaNacimiento);
        sb.append("\n Dni: \n").append(dni);
        sb.append("\n Número de Telefono: \n").append(numeroTeléfono);
        sb.append("\n Email: \n").append(email);
        sb.append("\n Direccion: \n").append(direccion);
        return sb.toString();
    }

    

    
    

    


    
}
