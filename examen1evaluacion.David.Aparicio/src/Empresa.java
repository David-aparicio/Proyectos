
import java.time.LocalDate;

public class Empresa {
   
    private String nombreEmpresa;
    private String cif;
    private LocalDate fechadeFundacion;
    private int maximoTrabajadores;
    private Trabajador [] trabajadores;
    private int nTrabajadores;

    public Empresa(String nombreEmpresa, String cif, int maximoTrabajadores){
        this.nombreEmpresa = nombreEmpresa;
        this.cif = cif;
        this.fechadeFundacion = LocalDate.now();
        this.maximoTrabajadores = 0;
        this.trabajadores = new Trabajador[maximoTrabajadores];
        this.nTrabajadores = 0;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getCif() {
        return cif;
    }


    public LocalDate getFechadeFundacion() {
        return fechadeFundacion;
    }

    public int getMaximoTrabajadores() {
        return maximoTrabajadores;
    }

    public Trabajador[] getTrabajadores() {
        return trabajadores;
    }
    public int getnTrabajadores() {
        return nTrabajadores;
    }
    
    public String mostrarinformacionEmpresa(){
        String infoE = String.format("Nombre de la Empresa: %s, Cif: %s, Fecha de Fundacion: %s, Numero de Trabajadores: ",
        this.nombreEmpresa, this.cif, this.fechadeFundacion, this.nTrabajadores);
        return infoE;
    }

    public boolean registrarTrabajador(Trabajador nuevoTrabajador){
        boolean isAdd = false;
        if (nuevoTrabajador != null) {
            this.trabajadores[maximoTrabajadores] = nuevoTrabajador;
            this.nTrabajadores++;
            isAdd = true;
        }
        return isAdd;
    }
    public boolean sacarTrabajador(Trabajador s1){
        boolean isRemoved = false;
        if(s1 != null){
            nTrabajadores--;
        }

        return isRemoved ;
    }
    public String mostrarPersonal(){
        String mostrarPersonal = "";
        if(trabajadores != null){
        for (int i = 0; i < maximoTrabajadores; i++){
            System.out.println(i + "-" + trabajadores[i].mostrarInfoTrabajador());
            }
        }
        return mostrarPersonal;
    }
    
}
