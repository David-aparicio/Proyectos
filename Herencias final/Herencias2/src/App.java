
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda(0);
        Scanner reader = new Scanner(System.in);
        String opcion = "";

        do { 
            reader = new Scanner(System.in);
            System.out.println("----MENU PRINCIPAL---- \n" + "1) Añadir contacto \n" + "2) Eliminar contacto \n" + "3) Verificar si un contacto existe \n" + "4) Lista todos los contactos \n" + "5) Buscar posición de un contacto \n" + "6) Salir");
            opcion = reader.nextLine();
            switch(opcion){
                
                    case "1":
                        System.out.println("Introduce su nombre: ");
                        String nombreNuevo = reader.nextLine();
                        System.out.println("Introduzca su número de telefono");
                        String numeroTelefonoNuevo = reader.nextLine();
                        contacto nContacto = new contacto(nombreNuevo, numeroTelefonoNuevo);
                        if(agenda.añadirContacto(nContacto)){
                            System.out.println("El contacto se a añadido correctamente");
                        }else{
                            System.out.println("No se añadio el contacto");
                        }
                        break;

                     case "2":
                        System.out.println("Escribe el contacto que quieras eliminar:");
                        String contactoElim = reader.nextLine();
                        if (agenda.eliminarContacto(contactoElim)) {
                            System.out.println("Contacto eliminado");
                        } else {
                            System.out.println("Error, compruebe que ha escrito bien el contacto a eliminar");
                        }
                        break;

                    case "3":
                        System.out.println("Introduce el nombre del contacto que quieres buscar:");
                            String nbuscador = reader.nextLine();
                            int posicion = agenda.buscarContacto(nbuscador);
                            if (posicion != -1) {
                        System.out.println("Contacto encontrado en la posición: " + posicion);
                        } else {
                        System.out.println("Contacto no encontrado.");
                        }
                        break;
                    case  "4":
                        System.out.print("Introduce el nombre del contacto a verificar: ");
                        String verificar = reader.nextLine();
                        if (agenda.existeContacto(verificar)) {
                        System.out.println("El contacto existe.");
                        } else {
                        System.out.println("El contacto no existe.");
                        }
                        break;
                    case "5":
                        agenda.mostrarContactos();
                        break;
                    case "6":
                        System.out.println("Adioss");
            }
        } while (!opcion.equals("6"));
    }
}
