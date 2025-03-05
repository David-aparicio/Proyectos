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
    
    do {
        reader = new Scanner(System.in);
        System.err.println("==== Menu Principal ==== \n" + "1) Crear y registrar VideoClub en la franquicia. \n" + "2) Registrar película en videoclub. \n" + "3) Crear y registrar clientes en videoclub. \n" + "4) Alquilar. \n" + "5) Devolver. \n" + "6) Dar de baja cliente. \n" + "7) Dar de baja artículo. \n" + "8) Salir. \n");
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
                            nuevaPelicula = new Pelicula(GeneroPelícula.Accion, titulo);
                        }
                        if (tipoGenero == 2){
                            nuevaPelicula = new Pelicula(GeneroPelícula.Aventura, titulo);
                        }
                        if (tipoGenero == 3){
                            nuevaPelicula = new Pelicula(GeneroPelícula.Ciencia_ficcion, titulo);
                        }
                        if (tipoGenero == 4){
                            nuevaPelicula = new Pelicula(GeneroPelícula.Comedia, titulo);
                        }
                        if (tipoGenero == 5){
                            nuevaPelicula = new Pelicula(GeneroPelícula.Documentales, titulo);
                        }
                        if (tipoGenero == 6){
                            nuevaPelicula = new Pelicula(GeneroPelícula.Drama, titulo);
                        }
                        if (tipoGenero == 7){
                            nuevaPelicula = new Pelicula(GeneroPelícula.Fantasia, titulo);
                        }
                        if (tipoGenero == 8){
                            nuevaPelicula = new Pelicula(GeneroPelícula.Musical, titulo);
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
                    int n = hoy.getYear() - fechaNacimiento.getYear();
                    if (n > 18) {
                        
                        nuevoCliente = new Cliente(dni, nombre, direccionUsuario, fechaNacimiento);
                        
                        if (videoClub.registrarCliente(nuevoCliente) == true) {
                            System.out.println("Cliente registrado.");
                        }
                        else{
                            System.out.println("El cliente ya existe.");
                        }
                        }
                        else if (n == 18){
                            int m = hoy.getMonthValue() - fechaNacimiento.getMonthValue();
                            if(m > 0){
                                nuevoCliente = new Cliente(dni, nombre, direccionUsuario, fechaNacimiento);
                                if (videoClub.registrarCliente(nuevoCliente) == true) {
                                    System.out.println("Cliente registrado.");
                                }
                                else{
                                    System.out.println("El cliente ya existe.");
                                }
                            } else{
                                System.out.println("El cliente no cumple la mayoria de edad por los meses.");
                            }
                        }else{
                            System.out.println("El cliente es menor de edad.");
                        }                
                }else {
                    System.out.println("Tienes que crear un videoClub primero.");
                }
                break;
            case "4" :
                reader = new Scanner(System.in);
                 if(videoClub != null && videoClub.getnPeliculasRegistradas() > 0 &&nuevaPelicula != null && nuevoCliente != null){

                    System.out.println("Quien va a alquilar la pelicula");
                    System.out.println(videoClub.mostrarClientes());
                    int cliente = reader.nextInt();

                    System.out.println("¿Que pelicula quieres alquilar?");
                    System.out.println(videoClub.mostrarNoAlquiladas());
                    int pelicula = reader.nextInt();

                    if(videoClub.posiciondelapeliculaArray(pelicula).getIsAlquilada() == false){

                        videoClub.alquilarPelicula(cliente, pelicula);
                        videoClub.clientesregistradosArray(cliente).añadirPelicula(videoClub.posiciondelapeliculaArray(pelicula));
                        System.out.println("Se ha alquilado con exito.");
                        
                    } else if (videoClub.posiciondelapeliculaArray(pelicula).getIsAlquilada() == true){
                        System.out.println("La pelicula seleccionada no esta disponible");
                    }
                }else {
                    System.out.println("Para alquilar la pelicula tiene que haber peliculas en el videoclub.");
                    }
                    break;
            case "5" :
                if (videoClub != null && videoClub.getnClientesRegistrados() > 0 && nuevaPelicula != null && nuevoCliente != null) {
                    
                    System.out.println("Elige el cliete que va a devolver la pelicula.");
                    System.out.println(videoClub.mostrarClientes());
                    int clientequeladevuelve = reader.nextInt();

                    if(videoClub.clientesregistradosArray(clientequeladevuelve).getNAlquiladas() > 0){
                    System.out.println("Selecciona la pelicula: ");
                    System.out.println(videoClub.mostrarPeliculas());
                    int codigoPelicula = reader.nextInt();
                    
                    videoClub.devolverPelicula(clientequeladevuelve, codigoPelicula);
                    videoClub.clientesregistradosArray(codigoPelicula).eliminarPelicula(videoClub.posiciondelapeliculaArray(codigoPelicula)); 

                    System.out.println("Movimientos");
                    videoClub.clientesregistradosArray(codigoPelicula).mostrarPeliculas();
                    }else{
                        System.out.println("No hay peliculas alquiladas.");
                    }
                }else{
                    System.out.println("No hay peliculas registradas en el videoclub");
                }
                break;
            case "6" : 
                reader = new Scanner(System.in);
                if (videoClub != null && videoClub.getnClientesRegistrados() > 0) {
                    System.out.println(videoClub.mostrarClientes());
                    System.out.println("Introduce el numero que sale alante del cliente a dar de baja");
                    int numCliente = reader.nextInt();

                    videoClub.darBajaCliente(nuevoCliente, numCliente);

                    System.out.println("Cliente eliminado.");
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
                    System.out.println("Pelicula eliminada con exito.");
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
    } while (!opcion.equals("8"));
}
}

