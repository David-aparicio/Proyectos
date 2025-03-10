
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        List <Libro> libros = new LinkedList<>();
        Scanner reader = new Scanner(System.in);
        String opcion = "";
        Libro newLibro = new Libro("", null, "", "");

        System.out.println("Bienvenido a la Biblioteca de Poniente.");
        do{ 
            System.out.println("1. Crear Libro y registrarlo en la Biblioteca.");
            System.out.println("2. Mostrar Libros existentes.");
            System.out.println("Eliminar Libro por ISBN.");
            System.out.println("Guardar Libros en el fichero.");
            System.out.println("Guardar y Salir.");
            opcion = reader.nextLine();
                
                switch(opcion){
                        case "1":
                                System.out.println("Introduce el ISBN");
                                String isbn = reader.nextLine;
                                 
                        break;
                }

        } while (!opcion.equals("5"));
    }
}
    º