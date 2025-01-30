import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Taller taller = new Taller();

        String option;

        do { 
            System.out.println("Selecciona una opcion de el menu\n");
            System.out.println("1. Añadir coche");
            System.out.println("2. Eliminar coche");
            System.out.println("3. Salir");
            option = sc.nextLine();

            if (option == "1"){

                System.out.println("Añade la Matricula");
                String matricula = sc.nextLine();
                System.out.println("Añade el Color");
                String color = sc.nextLine();
                System.out.println("Añade la Marca");
                String marca = sc.nextLine();

                taller.añadirElemento(color, marca, matricula);
            }else if (option == "2"){
                System.out.println("Seleccione el coche que quieres eliminar.");
                
            }else if (option == "3"){   


            }


            
        } while (!option.equals("3"));


    }
}