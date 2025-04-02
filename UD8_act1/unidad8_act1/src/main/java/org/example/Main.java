package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SQLAccesunidad8act1 miData = new SQLAccesunidad8act1();

        Scanner scanner = new Scanner(System.in);
        int opcion;

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
                    System.out.println("Escriba la referencia del producto: ");
                    String referencia2 = scanner.nextLine();
                        List<Inventario>BuscReferencia = miData.getBuscarReferencia(referencia2);
                        if (BuscReferencia.isEmpty()) {
                            System.out.println("Escriba el nombre del producto: ");
                            String nombre2 = scanner.nextLine();
                            System.out.println("Escriba el descripcion del producto: ");
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
                            double descuento2 = scanner.nextDouble();
                            System.out.println("Escriba el IVA: ");
                            double IVA2 = scanner.nextDouble();
                            System.out.println("¿Tiene descuento? Pon s o n ");
                            String descuento3 = scanner.nextLine();
                            boolean tieneDescuento = false;
                                if(descuento3.equalsIgnoreCase("s")){
                                    tieneDescuento = true;
                            }

                        }else {
                            System.out.println("No se permiten referencias repetidas");
                        }
                    break;
                case 6:
                    System.out.println("Eliminando producto por referencia...");
                    break;
                case 7:
                    System.out.println("Actualizando producto...");
                    break;
                case 8:
                    System.out.println("Insertando un nuevo tipo de producto...");
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