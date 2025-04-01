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

                    break;
                case 3:
                    System.out.println("Buscando productos por tipo...");
                    break;
                case 4:
                    System.out.println("Buscando productos por cantidad...");
                    break;
                case 5:
                    System.out.println("Insertando un nuevo producto...");
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