package org.example;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionVideoDaw {
    public static void main(String[] args) throws SQLException {
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
                try{
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


                    LocalDate fechaNacimientoLD = LocalDate.parse(fechaNacimientoC, formatter);


                    long fechaNacimientoEpoch = fechaNacimientoLD
                            .atStartOfDay(ZoneId.systemDefault())
                            .toEpochSecond();


                    Cliente nuevoCliente = new Cliente(dni, nombreC, direccionC, fechaNacimientoEpoch);


                    Cliente nuevoCLiente = new Cliente(dni,nombreC,direccionC,fechaNacimientoEpoch);
                    mySQL.ingresarCliente(nuevoCLiente);
                }catch (Exception e){
                    System.out.println("Error al procesar la fecha. Asegúrate de usar el formato dd/MM/yyyy");
                    System.out.println("Detalle: " + e.getMessage());
                }

                break;
            case "4" :
                reader = new Scanner(System.in);
                System.out.println("1) Película \n " + "2) Videojuego");
                opcion = reader.nextLine();
                switch(opcion){
                    case "1":
                            System.out.println("Seleccione una pelicula: ");
                            List<Pelicula> peliculas12 = mySQL.getMostrarPeliculas();
                            for (Pelicula pelicula : peliculas12) {
                                System.out.println(pelicula);
                            }
                            int idPelicula = reader.nextInt();
                            List<Cliente> clientes = mySQL.getMostrarClientes();
                            for (Cliente cliente : clientes) {
                                System.out.println(cliente);
                            }
                            System.out.println("Ingrese el id del cliente que va a alquilar la pelicula: ");
                            int idCliente = reader.nextInt();
                            mySQL.alquilarPelicula(idCliente,idPelicula);
                        break;
                    case "2":
                            System.out.println("Seleccione un videojuego: ");
                            List<Videojuego> videoJuegos = mySQL.getMostrarVideojuegos();
                            for (Videojuego videoQ : videoJuegos) {
                                System.out.println(videoQ);
                            }
                            int idVideojuego = reader.nextInt();
                            List<Cliente> clientes1 = mySQL.getMostrarClientes();
                            for (Cliente cliente : clientes1) {
                                System.out.println(cliente);
                            }
                            System.out.println("Ingrese el id del cliente que va a alquilar el videojuego: ");
                            int idCliente1 = reader.nextInt();
                            mySQL.alquilarVideojuego(idCliente1,idVideojuego);
                            break;
                }
                break;
            case "5" :
                        reader = new Scanner(System.in);
                        System.out.println("1) Pelicula \n " + "2) Videojuego");
                        opcion = reader.nextLine();
                        switch(opcion){
                            case "1":
                                List<Cliente> clientes2 = mySQL.getMostrarClientes();
                                for (Cliente cliente : clientes2) {
                                    System.out.println(cliente);
                                }
                                System.out.println("Seleccione el ID del cliente que va a devolver la película: ");
                                int idCliente2 = Integer.parseInt(reader.nextLine());

                                List<Pelicula> peliculas2 = mySQL.getMostrarPeliculas();
                                for (Pelicula pelicula : peliculas2) {
                                    System.out.println(pelicula);
                                }
                                System.out.println("Seleccione el ID de la película que va a devolver: ");
                                int idPelicula2 = Integer.parseInt(reader.nextLine());

                                mySQL.devolverPelicula(idPelicula2);
                                break;

                            case "2":
                                List<Cliente> clientes3 = mySQL.getMostrarClientes();
                                for (Cliente cliente : clientes3) {
                                    System.out.println(cliente);
                                }
                                System.out.println("Seleccione el ID del cliente que va a devolver el videojuego: ");
                                int idCliente3 = Integer.parseInt(reader.nextLine());

                                List<Videojuego> videojuegos2 = mySQL.getMostrarVideojuegos();
                                for (Videojuego videoQ : videojuegos2) {
                                    System.out.println(videoQ);
                                }
                                System.out.println("Seleccione el ID del videojuego que va a devolver: ");
                                int idVideojuego2 = Integer.parseInt(reader.nextLine());

                                mySQL.devolverVideojuego(idVideojuego2);
                                break;
                        }
                break;
            case "6" : 
                reader = new Scanner(System.in);
                System.out.println("Ingrese el ID del cliente que va a dar de baja: ");
                int idCliente4 = reader.nextInt();
                mySQL.eliminarClienteConAlquileres(idCliente4);
                break;
            case "7" :
                reader = new Scanner(System.in);
                System.out.println("1) Pelicula \n " + "2) Videojuego");
                opcion = reader.nextLine();
                switch(opcion){
                    case "1":
                        System.out.println("Ingrese el ID de la película que desea eliminar: ");
                        int idPeliculaEliminar = reader.nextInt();
                        mySQL.eliminarPelicula(idPeliculaEliminar);
                        break;

                    case "2":
                        System.out.println("Ingrese el ID del videojuego que desea eliminar: ");
                        int idVideojuegoEliminar = reader.nextInt();
                        mySQL.eliminarVideojuego(idVideojuegoEliminar);
                        break;
                }
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

