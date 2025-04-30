import java.time.LocalDate;
import java.util.Scanner;

public class GestionVideoDaw {
    public static void main(String[] args){
    Scanner reader  = new Scanner (System.in);
    String opcion = "";
    final String patronDNI = "[0-9]{8}[A-Z]{1}"; //  01234567A 
    final String patronCIF = "[A-Z]{1}[0-9]{8}"; //  A12345678
    
    
    do {
        reader = new Scanner(System.in);
        System.out.println("==== Menu Principal ==== \n" + "1) Crear y registrar VideoClub en la franquicia. \n" + "2) Registrar película en videoclub. \n" + "3) Crear y registrar clientes en videoclub. \n" + "4) Alquilar. \n" + "5) Devolver. \n" + "6) Dar de baja cliente. \n" + "7) Dar de baja artículo. \n" + "8) Salir. \n");
        opcion = reader.nextLine();
        switch(opcion){
            case "1":

                break;
            case "2":

                break;
            case "3" : 

                break;
            case "4" :

                break;
            case "5" :

                break;
            case "6" : 

                break;
            case "7" :

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

