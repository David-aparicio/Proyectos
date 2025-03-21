import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) throws Exception {
        	//path a la carpeta Recursos del proyecto
		final String pathFile = "./src/Recursos/";
		
		//Nombre del fichero Binario
		final String fileNameBinario = "almacen.dat";
		
		//Nombre del fichero UNICODE
		final String fileNameUnicode = "productos.csv";
        Producto producto = null;
        Scanner reader = new Scanner(System.in);
        String opcion = "";
        System.out.println("Bienvenido al inventario de MercaDAW");

        do{
            reader = new Scanner(System.in);
            System.out.println("1) Mostrar Productos en el Inventario");
            System.out.println("2) Eliminar Producto por referencia.");
            System.out.println("3) Guardar y Salir ");
            System.out.println("4) Regisrar producro en el inventario");
            System.out.println("5) Salir");
            opcion = reader.nextLine();
            switch(opcion){
                            case"1":

                            break;
                            case"2":
                            
                            break;
                            case"3":

                            break;
                            case"4":
                            
                            break;

                default:
                System.out.println("Opción no válida. Intente de nuevo. ");
            }
        }while(!opcion.equals("5"));
    }
}
