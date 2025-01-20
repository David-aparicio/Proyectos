public class contacto {
    private String nombre;
    private String telefono;
    
    
    public contacto(String nombre, String telefono) {
    
        this.nombre = nombre;
        this.telefono = telefono;    
    }
    
    public String getNombre() {
    
        return nombre;
    }
    
    public String getTelefono() {
    
        return telefono;
    }
    
    @Override
    public String toString() {
    
        StringBuilder sb = new StringBuilder();
    
        sb.append("contacto");
    
        sb.append("el nombre del contacto es = ").append(this.nombre);
    
        sb.append(", su numero de telefono es = ").append(this.telefono);
    
        return sb.toString();
    
    }
}
