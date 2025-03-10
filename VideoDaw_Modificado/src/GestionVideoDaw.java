import java.time.LocalDate;
import java.util.Scanner;

public class GestionVideoDaw {
    public static void main(String[] args){
    Scanner reader  = new Scanner (System.in);
    String opcion = "";
    final String patronDNI = "[0-9]{8}[A-Z]{1}"; //  01234567A 
    final String patronCIF = "[A-Z]{1}[0-9]{8}"; //  A12345678
    
    VideoDaw videoClub = null;
    Cliente nuevoCliente = null;
    Pelicula nuevaPelicula = null;
    Videojuego nuevoJuego = null;
    
    do {
        reader = new Scanner(System.in);
        System.err.println("==== Menu Principal ==== \n" + "1) Crear y registrar VideoClub en la franquicia. \n" + "2) Registrar película en videoclub. \n" + "3) Crear y registrar clientes en videoclub. \n" + "4) Alquilar. \n" + "5) Devolver. \n" + "6) Dar de baja cliente. \n" + "7) Dar de baja artículo. \n" + "8) Salir. \n");
        opcion = reader.nextLine();
        switch(opcion){
                            
            case "1": 
                reader = new Scanner(System.in);
                String cif = MiUtils.comprobarPatronRepetidamente(patronCIF, "\n Escribe el cif de la empresa");
                String direccion = MiUtils.leerTextoPantalla("Añade la direccion");

                videoClub = new VideoDaw(cif, direccion);
                System.out.println(videoClub.mostrarInfoVideoclub());
                break;
            case  "2":
                if(videoClub != null){
                    reader = new Scanner(System.in);
                    System.out.println("1) Registrar Película \n" + "2)Registrar Videojuego");
                    String opcionSubmenu = reader.nextLine();
                        switch(opcion){
                            case "1":
                                reader = new Scanner(System.in);
                                String titulo = MiUtils.leerTextoPantalla("Introduce el titulo de la película:");
                                Genero_Peliculas generoP = MiUtils.menuGeneroPeliculas();
                                Pelicula p = new Pelicula(titulo, generoP);
                                videoClub.registrarPelicula(p);
                                pelicula = p;
                                System.out.println(p.toString);
                                break;
                            case "2":
                                System.out.println("Registrar Videojuego");
                                String titulo2 = MiUtils.leerTextoPantalla("Introduce el titulo de la pelicula");
                                Genero_Videojuegos generoV = MiUtils.menuGeneroVideojuegos();
                                Videojuego Videojuego1 = new Videojuego(titulo2, generoV);
                                videoClub.registrarVideojuego(Videojuego);
                                Videojuego = Videojuego1;
                                System.out.println(Videojuego1.toString());
                                break;
                            }
                        }
                break;
            case "3" : 
                if (videoClub != null) {
                    reader = new Scanner(System.in);

                    String nombre = MiUtils.leerTextoPantalla("Introduzca el nombre: \n");
                    String dni = MiUtils.comprobarPatronRepetidamente(patronDNI, "Introduzca el DNI: \n");
                    String direccionUsuario = MiUtils.leerTextoPantalla("Introduzca la direccion: \n");
                    LocalDate fechaNacimiento = MiUtils.fechaconformato();

                    LocalDate hoy = LocalDate.now();
                    int n = hoy.getYear() - fechaNacimiento.getYear();
                    if (n > 18) {
                        try{                         
                        nuevoCliente = new Cliente(dni, nombre, direccionUsuario, fechaNacimiento);
                        videoClub.registrarCliente(nuevoCliente);
                        System.out.println(nuevoCliente.toString());
                        } catch (ClienteExistenteException e) {
                            System.out.println(e.getMessage());
                        }
                    } else{
                            System.out.println("No cumple la mayoria de edad.");
                        } 
                    }else {
                        System.out.println("Crea un Videoclub.");
                    }
                    break;
                        
            case "4" :
                reader = new Scanner(System.in);
                 if(videoClub != null){

                    System.out.println("Quien va a alquilar la pelicula");
                    System.out.println(videoClub.mostrarClientes());
                    int cliente1 = reader.nextInt();

                    System.out.println(videoClub.mostrarArticulosNoAlquilados(videoClub));
                    int vd = reader.nextInt();
                    videoClub.alquilarArticulo(vd, cliente);
                    System.out.println(cliente.mostrarArticulosAlquilados());
                 }
                    break;
            case "5" :
                if (videoClub != null ) {
                    reader = new Scanner(System.in);
                    System.out.println("Elige el cliete que va a devolver la pelicula.");
                    System.out.println(videoClub.mostrarClientes());
                    int clientequeladevuelve = reader.nextInt();

                    System.out.println(cliente.mostrarArticulosAlquilados());
                    int vd = reader.nextInt();
                    videoClub.devolverArticulo(clientequeladevuelve, vd);
                    System.out.println(videoClub.mostrarArticulosNoAlquilados(videoClub));
                }
                break;
            case "6" : 
                reader = new Scanner(System.in);
                if (videoClub != null && videoClub.getnClientesRegistrados() > 0) {
                    System.out.println("Selecciona el cliente que vas a dar de baja.");
                    System.out.println(videoClub.mostrarClientes());
                    int codigoSocio = reader.nextInt();
                    videoClub.darBajaCliente(codigoSocio);
                }
                break;
            case "7" :
                reader = new Scanner(System.in);

                if (videoClub != null && videoClub.getnPeliculasRegistradas() > 0) {
                    System.out.println("Introduce el articulo que quieres dar de baja.");
                    System.out.println(videoClub.mostrarArticulosNoAlquilados(videoClub));
                    int c = reader.nextInt();
                    videoClub.darBajaArticulo(c);
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

