
import java.time.LocalDate;
import java.util.Scanner;

public class Gestion {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        String opcion = "";
        final String patronCIF = "[A-Z]{1}[0-9]{8}"; //  A12345678
        final String patronDNI = "[0-9]{8}[A-Z]{1}"; //  01234567A 
        Trabajador nuevoTrabajador = null;
        Empresa  nuevoEmpresa = null;

        String nombreEmpresa = MiUtils.leerTextoPantalla("Elija el nombre de su Empresa");
        String cif = MiUtils.comprobarPatronRepetidamente(patronCIF, "Introduzca el cif que quiere asignar a su empresa.");
        int maximoTrabajadores = MiUtils.leerIntPantalla("Asigna el numero maximo de trabajadores en la empresa.");

        nuevoEmpresa = new Empresa(nombreEmpresa, cif, maximoTrabajadores);
         do {
        reader = new Scanner(System.in);
        System.err.println("==== Menu Principal ==== \n" + "1) Crear Persona. \n" + "2) Registrar trabajador en empresa. \n" + "3) Mostrar información general de la empresa. \n" + "4) Mostrar el número de trabajadores actuales. \n" + "5) Mostrar información de todos los trabajadores. \n" + "6) Eliminar trabajador de la empresa. \n" + "7) Eliminar persona del programa. \n" + "8) Salir. \n");
        opcion = reader.nextLine();
        switch(opcion){
                            
            case "1": 
                reader = new Scanner(System.in);
                String nombre = MiUtils.leerTextoPantalla("Escriba el nombre de la persona:\n");
                String dni = MiUtils.comprobarPatronRepetidamente(patronDNI, "Introduzca el DNI:\n");
                String direccion = MiUtils.leerTextoPantalla("Introduzca la dirección: \n");
                LocalDate fechaNacimiento = MiUtils.fechaconformato();

                nuevoTrabajador = new Trabajador(nombre, dni, direccion, fechaNacimiento);
                break;
            case  "2":
                if(nuevoEmpresa != null){
                    System.out.println("Elija a la persona que va a ser registrada en la empresa.");
                    System.out.println(nuevoEmpresa.mostrarPersonal());
                    int personal = reader.nextInt();


                    System.out.println("El trabajador a sido añadido ");
                }else{
                    System.out.println("No tiene ninguna empresa creada.");
                }
                break;
            case "3" : 
                        System.out.println("La informacion de su empresa es:");
                        System.out.println(nuevoEmpresa.mostrarinformacionEmpresa());
                break;
            case "4" :

                    break;
            case "5" :

                break;
            case "6" : 
                reader = new Scanner(System.in);
                break;
            case "7" :
                reader = new Scanner(System.in);
                System.out.println("Introduce la posicion de la persona que quieras eliminar");
                System.out.println(nuevoEmpresa.mostrarPersonal());
                int posicion = reader.nextInt();




                
                break;
            case "8" :
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo. ");                            
        }
    } while (!opcion.equals("8"));


    }
}
