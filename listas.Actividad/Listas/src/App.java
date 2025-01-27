
import java.util.ArrayList;
import java.util.Iterator;

public class App {
    public static void main(String[] args) throws Exception {
        //Ejercicio 1
        Producto producto1 = new Producto("Filipinos", 2);
        Producto producto2 = new Producto("Takis", 3);
        Producto producto3 = new Producto("Pelotazos", 1);
        Producto producto4 = new Producto("Aquarius", 3);
        Producto producto5 = new Producto("Cocacola", 2);
        //Ejercicio2
        ArrayList <Producto> productos = new ArrayList<>();
        //Ejercicio3
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        //Ejercicio4
        Iterator <Producto> itera = productos.iterator();
        Producto cadaProducto;
        while (itera.hasNext()) {
                cadaProducto = itera.next();
                System.out.println(cadaProducto.getNombre()+" -  "+cadaProducto.getCantidad());
        
        }
        //Ejercicio5      
            itera = productos.iterator();
            while (itera.hasNext()){
                cadaProducto = itera.next();

                if(cadaProducto.getNombre().equals("Filipinos")){
                    itera.remove();
                }

                if(cadaProducto.getNombre().equals("Takis")){
                    itera.remove();
                }
            }
            
            System.out.println(" \n Recorrido después de borrar los productos 1 y 2 \n");
            for (Producto productosRestantes : productos) {
            System.out.println(productosRestantes.getNombre()+ "  - "+productosRestantes.getCantidad());
            } 
        //Ejercicio6

        productos.add(2, new Producto("Fanta", 3));

        //Ejercicio7
        System.out.println("Recorriendo de nuevo todos los elementos, despues de añadirle fanta");
        for (Producto productosRestantes : productos) {
            System.out.println(productosRestantes.getNombre()+ "  - "+productosRestantes.getCantidad());
            }

        //Ejercicio8
        productos.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        System.out.println("\n" + "Productos ordenados alfabéticamente : ");
        Iterator <Producto> itera3 = productos.iterator();
        while (itera3.hasNext()){
            Producto cadaProducto2 = itera3.next();
            System.out.println(cadaProducto2.getNombre());
        }
        //Ejercicio9
        productos.clear();

    }
        
}

