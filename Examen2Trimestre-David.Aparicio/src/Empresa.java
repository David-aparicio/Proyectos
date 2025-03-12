
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;

public class Empresa {
    private String nombre;
    private String cif;
    private LocalDate fechaFundacion;
    private LinkedList <Trabajador> trabajadores = new LinkedList<>();


    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
        this.fechaFundacion = LocalDate.now();
        this.trabajadores = trabajadores;
    }


    public String getNombre() {
        return nombre;
    }


    public String getCif() {
        return cif;
    }


    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }


    public LinkedList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa{");
        sb.append("nombre=").append(nombre);
        sb.append(", cif=").append(cif);
        sb.append(", fechaFundacion=").append(fechaFundacion);
        sb.append(", trabajadores=").append(trabajadores);
        sb.append('}');
        return sb.toString();
    }
    
    public boolean registrarDirector(Director d) throws directorExistente{
        boolean isAdd = false;
                for(Trabajador a : trabajadores){
                    if(d.getNombre().equals(a.getNombre())){
                        throw new directorExistente("Ya hay un director:" + d.getNombre());

                    }else{
                        trabajadores.add(d);
                    }
                }
            return isAdd;
    }
    public boolean registrarTrabajador(Trabajador trabajador) throws TrabajadorExistenteException{
        for(Trabajador t : trabajadores) {
            if(trabajador.getDni().equals(t.getDni())){
                throw new TrabajadorExistenteException("El trabajador ya existe.");
            }
        }
        trabajadores.add(trabajador);
        return true;
    }
    public String trabajadores() {
        Iterator <Trabajador> itera = trabajadores.iterator();
        StringBuilder resultado = new StringBuilder();
        while (itera.hasNext()) {
            Trabajador  trabajador = itera.next();
            resultado.append(trabajador.toString()).append("\n");
        }
        return resultado.toString();
    }
    public boolean  eliminarCliente(String dni){
        for(Trabajador trabajador : trabajadores){
            if (trabajador.getDni() == dni){
                trabajadores.remove(trabajador);
                
            }
        }
        return true;
    }
}
