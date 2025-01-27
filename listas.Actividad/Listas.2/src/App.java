
import java.util.Iterator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
         //Ejercicio 1
        Producto producto1 = new Producto("Filipinos", 2);
        Producto producto2 = new Producto("Takis", 3);
        Producto producto3 = new Producto("Pelotazos", 1);
        Producto producto4 = new Producto("Aquarius", 3);
        Producto producto5 = new Producto("Cocacola", 2);
        
        //Ejercicio2
        LinkedList <Producto> productos = new LinkedList<>();

        //Ejercicio3
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);

        //Ejercicio4
        System.out.println("Productos en la linkedList");
        Iterator <Producto> itera = productos.iterator();
        Producto cadaProducto;
        while (itera.hasNext()){
            cadaProducto = itera.next();
            System.out.println(cadaProducto);
        }

        //Ejercicio5
        productos.remove(producto3);
        productos.remove(producto4);

        System.out.println(" \n Recorrido después de borrar los productos 3 y 42 \n");
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
