
import java.io.File;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);    
        String opcion = "";
        List<Producto> productos = new LinkedList<>();
        do { 
                reader = new Scanner(System.in);
                System.out.println("1) Crear producto.");
                System.out.println("2) Mostrar productos existentes.");
                System.out.println("3) Eliminar producto por código.");
                System.out.println("4) Guardar productos en el fichero.");
                System.out.println("5) Salir.");

                opcion = reader.nextLine();
                switch(opcion){
                    case "1": 
                    System.out.println("Creando producto\n");
                    System.out.println("Inserta el nombre del producto");
                    String nombre = reader.nextLine();
                    System.out.println("Inserta la cantidad de productos que hay");
                    int cantidad = reader.nextInt();
                    System.out.println("introduce el precio del producto");
                    double precio = reader.nextDouble();
                    Producto p = new Producto(nombre, cantidad, precio);
                    productos.add(p);

                    System.out.println(p.toString());

                        break;

                    case "2":
                    if (productos != null){
                        for(int i = 0; i<productos.size();i++){
                            System.out.println(productos.get(i).toString());
                        }
                    }
                        break;

                    case "3":

                        break;

                    case "4":
                        try(PrintWriter writer = new PrintWriter(new File("./resources/almacen.dat"))) {
                            for(Producto product : productos){
                                String 
                            }
                        }
                        break;

                    case "5":
                            System.out.println("Saliendo del menu.");
                        break;
                    default:
                    System.out.println("Opcion no valida.");
                }
            } while (!opcion.equals("5"));
    }
}
