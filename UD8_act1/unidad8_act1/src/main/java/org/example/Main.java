package org.example;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        SQLAccesunidad8act1 miData = new SQLAccesunidad8act1();

        Scanner scanner = new Scanner(System.in);
        int opcion;
        Pattern pattern = Pattern.compile("[A-Z]{3}[0-9]{3}");

        do {
            System.out.println("\n--- Menú de Inventario ---");
            System.out.println("1. Mostrar todos los Productos en el Inventario.");
            System.out.println("2. Buscar producto por referencia.");
            System.out.println("3. Buscar productos por tipo.");
            System.out.println("4. Buscar producto por cantidad.");
            System.out.println("5. Insertar un nuevo producto (no permitir referencias repetidas).");
            System.out.println("6. Eliminar Producto por referencia.");
            System.out.println("7. Actualizar producto (descripción, cantidad, precio, descuento, AplicarDto).");
            System.out.println("8. Insertar un nuevo tipo de producto.");
            System.out.println("9. Salir.");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    List<Inventario> productosInv = miData.getMostrartodos();

                    for (Inventario p : productosInv) {
                        System.out.println(p);
                    }
                    break;
                case 2:
                    System.out.println("Escriba la referencia del producto: ");
                    String referencia = scanner.nextLine();
                    List<Inventario> ReferenciaInv = miData.getBuscarReferencia(referencia);
                    for (Inventario p : ReferenciaInv) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    System.out.println("Los tipos de productos son: ");
                    List<Tipos> tiposList = miData.getTiposmostrar();
                    for (Tipos p : tiposList) {
                        System.out.println(p);
                    }

                    System.out.println("Elija el número del tipo a seleccionar: ");
                    int numero = scanner.nextInt();
                    List<Inventario> buscTipos = miData.getBuscarTipos(numero);
                    for (Inventario p : buscTipos) {
                        System.out.println(p);
                    }
                    break;
                case 4:
                    System.out.println("Selecciona la cantidad: ");
                    int cantidad = scanner.nextInt();
                    List<Inventario> buscCantidad = miData.getBuscarCantidad(cantidad);
                    for (Inventario p : buscCantidad) {
                        System.out.println(p);
                    }
                    break;
                case 5:
                    List<Inventario> todosProductos8 = miData.getMostrartodos();
                    for (Inventario p : todosProductos8) {
                        System.out.println("Nombre: " + p.getNombre() + " | Referencia: " + p.getReferencia());
                    }
                    System.out.println("Escriba la referencia del producto (No se permiten referencias repetidas): ");
                    String referencia2 = scanner.nextLine();

                        List<Inventario>BuscReferencia = miData.getBuscarReferencia(referencia2);
                        if (BuscReferencia.isEmpty()) {
                            System.out.println("Escriba el nombre del producto: ");
                            String nombre2 = scanner.nextLine();

                            System.out.println("Escriba la descripcion del producto: ");
                            String descripcion2 = scanner.nextLine();

                            System.out.println("Escriba el tipo de producto: ");
                            List<Tipos> tiposList1 = miData.getTiposmostrar();
                            for (Tipos p : tiposList1) {
                                System.out.println(p);
                            }
                            int tipo2 = scanner.nextInt();

                            System.out.println("Escriba la cantidad: ");
                            int cantidad2 = scanner.nextInt();

                            System.out.println("Escriba el precio: ");
                            double precio2 = scanner.nextDouble();

                            System.out.println("Escriba el descuento: ");
                            int descuento2 = scanner.nextInt();

                            System.out.println("Escriba el IVA: ");
                            int iVA2 = scanner.nextInt();

                            System.out.println("¿Tiene descuento? Pon s o n ");
                            scanner = new Scanner(System.in);
                            String descuento3 = scanner.nextLine();
                            boolean tieneDescuento = false;
                                if(descuento3.equalsIgnoreCase("s")){
                                    tieneDescuento = true;
                            }
                            Inventario n2n = new Inventario(referencia2,nombre2,descripcion2,tipo2,cantidad2,precio2,descuento2,iVA2,tieneDescuento);
                                int response = miData.insertarProducto(n2n);
                                System.out.println("Se han insertado" +response + "elementos");
                        }else {
                            System.out.println("No se permiten referencias repetidas");
                        }
                    break;
                case 6:
                    System.out.println("Productos disponibles:");
                    List<Inventario> todosProductos = miData.getMostrartodos();
                    for (Inventario p : todosProductos) {
                        System.out.println("Nombre: " + p.getNombre() + " / Referencia: " + p.getReferencia());
                    }

                    System.out.println("Escriba la referencia del producto que desea eliminar: ");
                    String referencia3 = scanner.nextLine();
                    miData.eliminarProducto(referencia3);
                    System.out.println("Producto eliminado.");
                    break;

                case 7:
                    System.out.println("Vamos a actualizar un producto");
                    List<Inventario> todosProductos5 = miData.getMostrartodos();
                    for (Inventario p : todosProductos5) {
                        System.out.println("Nombre: " + p.getNombre() + " / Referencia: " + p.getReferencia());
                    }
                    System.out.println("Escriba la referencia del producto que quieras actualizar: ");
                    String referencia4 = scanner.nextLine();
                    List<Inventario> invUpdate = miData.getBuscarReferencia(referencia4);

                    Inventario productoActualizado = invUpdate.get(0);
                    System.out.println("Escriba la nueva descripcion del producto: ");
                    String nuevaDescripcion = scanner.nextLine();
                    System.out.println("Escriba la nueva cantidad del producto: ");
                    int cantidad2 = scanner.nextInt();
                    System.out.println("Escriba el nuevo precio del producto: ");
                    double precio2 = scanner.nextDouble();
                    System.out.println("Escriba el nuevo descuento del producto: ");
                    int descuento2 = scanner.nextInt();
                    System.out.println("Escriba si aplica descuento del producto: Pon s o n");
                    scanner = new Scanner(System.in);
                    String descuento4 = scanner.nextLine();
                    boolean tieneDescuento2 = false;
                    if(descuento4.equalsIgnoreCase("s")){

                        tieneDescuento2 = true;
                    }else {
                        tieneDescuento2 = false;
                    }
                    productoActualizado.setDescripcion(nuevaDescripcion);
                    productoActualizado.setCantidad(cantidad2);
                    productoActualizado.setPrecio(precio2);
                    productoActualizado.setDescuento(descuento2);
                    productoActualizado.setAplicarDto(tieneDescuento2);
                    miData.actualizarProducto(productoActualizado);

                    break;
                case 8:
                    System.out.println("Introduce el id del Tipo que quieres añadir:");
                    int tipo3 = scanner.nextInt();
                    System.out.println("Introduce el nombre del tipo: ");
                    scanner = new Scanner(System.in);
                    String tipo4 = scanner.nextLine();
                    Tipos newTipo = new Tipos(tipo3,tipo4);
                    miData.añadirTipoProducto(newTipo);
                    break;
                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 9);




    }
}