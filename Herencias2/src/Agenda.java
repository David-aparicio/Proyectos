public class Agenda {
    private contacto [] listacontactos;
    private int contador;
    private String nuevoContacto;

    public Agenda(contacto listacontactos, int contador, String nuevoContacto){
        this.listacontactos = new contacto[100];
        this.contador = 0;
        this.nuevoContacto = nuevoContacto;
    }

    public String getNuevoContacto() {
        return nuevoContacto;
    }

    public contacto[] getListacontactos() {
        return listacontactos;
    }

    public void setListacontactos(contacto[] contactos) {
        this.listacontactos = listacontactos;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public boolean añadirContacto(contacto[] listacontactos) { 
        if (contador == 100) {
            System.out.println("La agenda está llena."); 
            return false;
        }
        for (int i = 0; i < contador; i++) {

            if (listacontactos[i].getNombre().equals(nuevoContacto)) {
                System.out.println("El nombre ya existe."); 
                return false;
            }
        }
        
        listacontactos[contador] = new contacto(nuevoContacto); 
        contador++; 
        return true;
    }
    
}
