import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class GestionVideoDaw {
    public static void main(String[] args){
    Scanner reader  = new Scanner (System.in);
    String opcion = "";
    final String patronDNI = "[0-9]{8}[A-Z]{1}";
    final String patronCIF = "[A-Z]{1}[0-9]{8}";
    
    VideoDaw videoClub = null;
    Cliente nuevoCliente = null;
    Pelicula nuevaPelicula = null;
    
    do {
        reader = new Scanner(System.in);
        System.err.println("==== Menu Principal ==== \n" + "1) Crear y registrar VideoClub en la franquicia. \n" + "2) Registrar película en videoclub. \n" + "3) Crear y registrar clientes en videoclub. \n" + "4) Alquilar película. \n" + "5) Devolver película. \n" + "6) Dar de baja cliente. \n" + "7) Dar de baja película. \n" + "8) Salir. \n");
        opcion = reader.nextLine();
        switch(opcion){
                            
            case "1": 
                String cif = MiUtils.comprobarPatronRepetidamente(patronCIF, "\n Escribe el cif de la empresa");
                String direccion = MiUtils.leerTextoPantalla("Añade la direccion");

                videoClub = new VideoDaw(cif, direccion);
                System.out.println(videoClub.mostrarInfoVideoclub());
                break;
            case  "2":
                if(videoClub != null){
                    reader = new Scanner(System.in);
                    String titulo = MiUtils.leerTextoPantalla("Escribe el titulo de la pelicula que quieras registrar\n");
                    for(int i = 0;i < 1; i++){
                        System.out.println("¿Cual es su género?\n" + "1) ACCION\n" + "2) AVENTURA\n" + "3) CIENCIA_FICCION\n"
                         + "4) COMEDIA\n" + "5) DOCUMENTALES\n" + "6) DRAMA\n" + "7) FANTASIA\n" + "8) Músical");
                    
                        int tipoGenero = reader.nextInt();
                        if (tipoGenero == 1){
                            nuevaPelicula = new Pelicula(Genero.Accion, titulo);
                        }
                        if (tipoGenero == 2){
                            nuevaPelicula = new Pelicula(Genero.Aventura, titulo);
                        }
                        if (tipoGenero == 3){
                            nuevaPelicula = new Pelicula(Genero.Ciencia_ficcion, titulo);
                        }
                        if (tipoGenero == 4){
                            nuevaPelicula = new Pelicula(Genero.Comedia, titulo);
                        }
                        if (tipoGenero == 5){
                            nuevaPelicula = new Pelicula(Genero.Documentales, titulo);
                        }
                        if (tipoGenero == 6){
                            nuevaPelicula = new Pelicula(Genero.Drama, titulo);
                        }
                        if (tipoGenero == 7){
                            nuevaPelicula = new Pelicula(Genero.Fantasia, titulo);
                        }
                        if (tipoGenero == 8){
                            nuevaPelicula = new Pelicula(Genero.Musical, titulo);
                        }
                        else if(tipoGenero > 8 && tipoGenero < 1 ){
                            System.out.println("Introduce una opcion correcta");
                        }
                    }
                    if (nuevaPelicula != null) {
                        System.out.println("Se ha registrado la Pelicula");
                        System.out.println(nuevaPelicula.mostrarInfoPelicula());
                        videoClub.nuevaPelicula(nuevaPelicula);
                    }
                }else{
                    System.out.println("Registra un VideoClub antes de añadir una película.");
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
                    Period edadEnAños = Period.between(fechaNacimiento, hoy);
                    if (edadEnAños.getYears() > 18) {
                        
                        nuevoCliente = new Cliente(dni, nombre, direccionUsuario, fechaNacimiento);
                        
                        if (videoClub.registrarCliente(nuevoCliente) == true) {
                            System.out.println("Cliente registrado.");
                        }
                        else{
                            System.out.println("El cliente ya existe.");
                        }
                        }
                        else{
                        System.out.println("El cliente debe ser mayor de edad.");
                        }                    
                }
                break;
            case "4" :
                reader = new Scanner(System.in);
                 if(videoClub != null && videoClub.getnPeliculasRegistradas() > 0 &&
                 nuevaPelicula != null && nuevoCliente != null){

                    System.out.println("Quien va a alquilar la pelicula");
                    System.out.println(videoClub.mostrarClientes());
                    int cliente = reader.nextInt();

                    System.out.println("¿Que pelicula quieres alquilar?");
                    System.out.println(videoClub.mostrarNoAlquiladas());
                    int pelicula = reader.nextInt();

                    if(videoClub.posiciondelapeliculaArray(pelicula).getIsAlquilada() == false){

                        videoClub.alquilarPelicula(cliente, pelicula);
                        videoClub.clientesregistradosArray(cliente).añadirPelicula(videoClub.posiciondelapeliculaArray(pelicula));
                        
                    } else if (videoClub.posiciondelapeliculaArray(pelicula).getIsAlquilada() == true){
                        System.out.println("La pelicula seleccionada no esta disponible");
                    }
                }else {
                    System.out.println("Para alquilar la pelicula tiene que haber peliculas en el videoclub.");
                    }
                    break;
            case "5" :
                if (videoClub != null && videoClub.getnClientesRegistrados() > 0 && nuevaPelicula != null && nuevoCliente != null) {
                    
                    System.out.println("Elige quien va a devolver la pelicula.");
                    System.out.println(videoClub.mostrarClientes());
                    int clientequeladevuelve = reader.nextInt();

                    System.out.println("Selecciona la pelicula: ");
                    System.out.println(videoClub.mostrarPeliculas());
                    int peliculadevolver = reader.nextInt();

                    videoClub.devolverPelicula(clientequeladevuelve, peliculadevolver);
                    videoClub.clientesregistradosArray(peliculadevolver).eliminarPelicula(videoClub.clientesregistradosArray(clientequeladevuelve));
                }else{
                    System.out.println("No hay peliculas alquiladas");
                }
            
                break;
            case "6" : 
                reader = new Scanner(System.in);
                if (videoClub != null && videoClub.getnClientesRegistrados() > 0) {
                    System.out.println(videoClub.mostrarClientes());
                    System.out.println("Introduce el numero de socio del cliente a dar de baja");
                    int numSocio = reader.nextInt();

                    videoClub.darBajaCliente(nuevoCliente, numSocio);
                }else{
                    System.out.println("No hay ningun cliente registrado");
                }
                break;
            case "7" :
                reader = new Scanner(System.in);

                if (videoClub != null && videoClub.getnPeliculasRegistradas() > 0) {
                    System.out.println("Introduce cual es la posicion de la pelicula que quieres dar de baja");
                    System.out.println(videoClub.mostrarPeliculas());
                    int codigoPelicula = reader.nextInt();

                    videoClub.darBajaPelicula(nuevaPelicula, codigoPelicula);
                }else {
                    System.out.println("No hay peliculsa registradas");
                }
                break;
            case "8" :
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo. ");                            
        }
    } while (true);
}
}

