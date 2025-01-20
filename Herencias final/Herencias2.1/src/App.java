
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda(0);
        Scanner reader = new Scanner(System.in);
        String opcion = "";

        do { 
            reader = new Scanner(System.in);
            System.out.println("----MENU PRINCIPAL---- \n" + "1) Añadir contacto Persona \n" + "2) Añadir contacto Empresa \n" + "3) Eliminar contacto \n" + "4) Verificar si un contacto existe \n" + "5) Lista todos los contactos \n" + "6) Buscar posición de un contacto \n" + "7) Salir");
            opcion = reader.nextLine();
            switch(opcion){
                
                    case "1":

                        System.out.println("Introduce su nombre: ");
                        String nombreNuevo = reader.nextLine();

                        System.out.println("Introduzca su número de telefono");
                        String numeroTelefonoNuevo = reader.nextLine();

                        System.out.println("Introduce la fecha de cumpleaños:");
                        LocalDate cumpleaños = MiUtils.fechaconformato();

                        LocalDate hoy = LocalDate.now();
					    Period Edad = Period.between(cumpleaños, hoy);
                        
                        contactoPersona nuevPersona = new contactoPersona(nombreNuevo, numeroTelefonoNuevo, cumpleaños);

                        if(agenda.añadirContacto(nuevPersona)){
                            System.out.println("El contacto se a añadido correctamente");
                        }else{
                            System.out.println("No se añadio el contacto");
                        }
                        break;
                        case "2":
                        System.out.print("Introduce el nombre de la Empresa: ");
                        String nombrePersonaE = reader.nextLine();
                        
                        System.out.print("Introduce el teléfono de la Empresa: ");
                        String telefonoPersonaE = reader.nextLine();

                        System.out.println("Introduce la pagina web de la Empresa");
                        String paginaWeb = reader.nextLine();

                    contactoEmpresa nuevaEmpresa = new contactoEmpresa(nombrePersonaE, telefonoPersonaE, paginaWeb);
                    if (agenda.añadirContacto(nuevaEmpresa)) {
                        System.out.println("Contacto de persona añadido correctamente.");
                    }
                        break;
                     case "3":
                        System.out.println("Escribe el contacto que quieras eliminar:");
                        String contactoElim = reader.nextLine();
                        if (agenda.eliminarContacto(contactoElim)) {
                            System.out.println("Contacto eliminado");
                        } else {
                            System.out.println("Error, compruebe que ha escrito bien el contacto a eliminar");
                        }
                        break;

                    case "4":
                        System.out.println("Introduce el nombre del contacto que quieres buscar:");
                            String nbuscador = reader.nextLine();
                            int posicion = agenda.buscarContacto(nbuscador);
                            if (posicion != -1) {
                        System.out.println("Contacto encontrado en la posición: " + posicion);
                        } else {
                        System.out.println("Contacto no encontrado.");
                        }
                        break;
                    case  "5":
                        System.out.print("Introduce el nombre del contacto a verificar: ");
                        String verificar = reader.nextLine();
                        if (agenda.existeContacto(verificar)) {
                        System.out.println("El contacto existe.");
                        } else {
                        System.out.println("El contacto no existe.");
                        }
                        break;
                    case "6":
                        agenda.mostrarContactos();
                        break;
                    case "7":
                        System.out.println("Adioss");
            }
        } while (!opcion.equals("7"));
    }
}
