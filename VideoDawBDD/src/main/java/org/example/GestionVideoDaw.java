package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionVideoDaw {
    public static void main(String[] args){
    Scanner reader  = new Scanner (System.in);
    String opcion = "";
    final String patronDNI = "[0-9]{8}[A-Z]{1}"; //  01234567A 
    final String patronCIF = "[A-Z]{1}[0-9]{8}"; //  A12345678
    SQLAccesVideoDaw mySQL = new SQLAccesVideoDaw();
    
    do {
        reader = new Scanner(System.in);
        System.out.println("==== Menu Principal ==== \n" + "1) Crear y registrar VideoClub en la franquicia. \n" + "2) Registrar Articulo. \n" + "3) Crear y registrar clientes en videoclub. \n" + "4) Alquilar. \n" + "5) Devolver. \n" + "6) Dar de baja cliente. \n" + "7) Dar de baja artículo. \n" + "8) Salir. \n");
        opcion = reader.nextLine();
        switch(opcion){
            case "1":
                reader = new Scanner(System.in);
                String cif = MiUtils.comprobarPatronRepetidamente(patronCIF, "Introduce el CIF ");
                System.out.println("Ingrese la direccion del video Club: ");
                String direccion = reader.nextLine();

                VideoDaw  nuevoV = new VideoDaw(cif, direccion);
                mySQL.insertarVideoDaw(nuevoV);

                break;
            case "2":
                reader = new Scanner(System.in);
                System.out.println("1) Pelicula \n " + "2) VideoJuego");
                opcion = reader.nextLine();
                switch(opcion){
                    case "1":
                        reader = new Scanner(System.in);
                        List<GeneroPelícula> generosP = mySQL.getMostrarGP();
                        for (GeneroPelícula genero : generosP) {
                            System.out.println(genero);
                        }
                        System.out.println("Ingrese el número del genero de la pelicula que vas a ingresar:");
                        int numero = reader.nextInt();
                        System.out.println("Ingrese el nombre de la pelicula que vas a ingresar:");
                        String nombre = reader.nextLine();

                        Pelicula peliIngresada = new Pelicula(nombre,numero);
                        mySQL.insertarPelicula(peliIngresada);
                        break;
                    case "2":
                        reader = new Scanner(System.in);
                        List<GeneroVideojuego> generosV = mySQL.getMostrarGV();
                        for (GeneroVideojuego generoV : generosV) {
                            System.out.println(generoV);
                        }
                        System.out.println("Ingrese el número del genero del Videojuego que vas a ingresar:");
                        int numero1 = reader.nextInt();
                        System.out.println("Ingrese el nombre del videojuego que vas a ingresar:");
                        String nombre1 = reader.nextLine();

                        Videojuego videojuegoIng = new Videojuego(nombre1,numero1);
                        mySQL.insertarVideojuego(videojuegoIng);
                        break;
                }

                break;
            case "3" : 
                reader = new Scanner(System.in);
                String dni = MiUtils.comprobarPatronRepetidamente(patronDNI, "Ingrese un dni para del nuevo Cliente:");
                System.out.println("Ingrese el nombre del cliente que vas a ingresar: ");
                String nombreC = reader.nextLine();
                System.out.println("Ingrese la direccion del cliente que vas a ingresar: ");
                String direccionC = reader.nextLine();
                System.out.println("Ingrese la fecha de nacimiento del cliente que vas a ingresar: ");
                String fechaNacimientoC = reader.nextLine();

                Cliente nuevoCLiente = new Cliente(dni,nombreC,direccionC,fechaNacimientoC);
                
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

