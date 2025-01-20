    public class Agenda {
    private contacto [] listacontactos;
    private int contador;

    public Agenda(int contador){
        this.listacontactos = new contacto[100];
        this.contador = 0;
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
    
    public boolean añadirContacto(contacto newContacto) { 
        if (contador >= 100) {
            System.out.println("La agenda está llena."); 
            return false;
        }
            if (existeContacto(newContacto.getNombre())) {
                System.out.println("El nombre ya existe."); 
                return false;
        }   
        listacontactos[contador++] = newContacto;
        return true;
    }
    
    public boolean eliminarContacto(String newContacto) {
        int posicion = buscarContacto(newContacto);
        if(posicion == -1){
            System.out.println("El contacto no existe");
            return false;
        }
        for (int i = posicion; i < contador - 1; i++) {
            listacontactos[i] = listacontactos[i + 1];
        }
        listacontactos[--contador] = null;
        return true;
        }

        public int buscarContacto(String newContacto) {
        for (int i = 0; i < contador; i++){
            if(listacontactos[i].getNombre().equals(newContacto)){
            return i;
            }
        }
        return -1;
    }
    public boolean existeContacto(String nombre) {
        return buscarContacto(nombre) != -1;
    }
    public void mostrarContactos() {
        if (contador == 0) {
            System.out.println("La agenda está vacía");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println((i + 1) + ". " + listacontactos[i].getNombre() + " - " + listacontactos[i].getTelefono());
            }
        }
    }
}
