import java.util.HashMap;
import java.util.Map;

public class Taller {
    Map<  String,Coche> coches = new HashMap<String, Coche>();
    
    public Taller(){}
    public Taller(Map<String, Coche> coches){
        this.coches = coches;
    }

    public void añadirElemento(String color, String marca, String matricula){
        
        Coche coche = new Coche(color, marca);
        if(coches.containsKey(matricula)){
            System.out.println("La matricula ya existe.");
        }else{
            this.coches.put(matricula, coche);
        }

    }
    public boolean  eleminarElementos(String matricula){
        boolean eliminado = false;
        matricula = matricula.toUpperCase();
        if(coches.containsKey(matricula)){

        }
        return eliminado;
    }


}
