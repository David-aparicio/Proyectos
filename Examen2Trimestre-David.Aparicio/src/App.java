import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
    Scanner reader  = new Scanner (System.in);
    String opcion = "";
    String opcion2 = "";
    final String patronDNI = "[0-9]{8}[A-Z]{1}"; //  01234567A 
    final String patronCIF = "[A-Z]{1}[0-9]{8}"; //  A12345678
    final String patronSS = "[0-9]{10}";
    Empresa nuevaEmpresa = null;
    Trabajador nuevoTrabajador = null;
    GerenteDep nuevoGerenteDep = null;
    Director nuevoDirector = null;

    System.out.println("Vamos a crear tu empresa.");
    String nombre = MiUtils.leerTextoPantalla("Introduce el nombre de la Empresa:");
    
    try{
    String cif = MiUtils.comprobarPatronRepetidamente(patronCIF, "\n Escribe el cif de la empresa");
    } catch (Exception e) {
        System.out.println("El cif de la empresa es incorrecto.");
    }
    nuevaEmpresa = new Empresa(nombre, patronCIF);

    do { 
        reader = new Scanner(System.in);
        System.out.println("====Menu Principal==== \n");
        System.out.println("1) Registrar trabajador en empresa:");
        System.out.println("2) Mostrar información general de la empresa, con todos los trabajadores, gerentes y director.");
        System.out.println("3) Mostrar el número de trabajadores actuales y el organigrama de la empresa.");
        System.out.println("4) Mostrar información de un departamento.");
        System.out.println("5) Eliminar trabajador de la empresa.");
        System.out.println("6) Agenda Director.");
        System.out.println("7) Salir");
        opcion = reader.nextLine();
        switch(opcion){
            
                case "1":
                    if(nuevaEmpresa !=null){
                    
                        reader = new Scanner(System.in);
                        System.out.println("a) Registrar Director");
                        System.out.println("b) Registrar GerenteDep");
                        System.out.println("c) Registrar Trabajador normal");
                        opcion2 = reader.nextLine();
                            switch(opcion2){
                                case"a":
                                    reader = new Scanner(System.in);
                                String nombredirector = MiUtils.leerTextoPantalla("Introduzca el nombre: \n");
                                System.out.println("Introduzca la fecha de nacimiento");
                                LocalDate fechaNacimientoDirector = MiUtils.fechaconformato();
                                String dniDirector = MiUtils.comprobarPatronRepetidamente(patronDNI, "Introduzca el DNI: \n");
                                String direccionDirector = MiUtils.leerTextoPantalla("Introduzca la Direccion: \n");
                                String numeroSS = MiUtils.comprobarPatronRepetidamente(patronSS, "Introduzca el numero de la Seguridad Social: \n");
                                String emailDirect = MiUtils.leerTextoPantalla("Introduzca el email: \n");
                                System.out.println("Introduzca el salario:");
                                int salarioDRECT = reader.nextInt();
                                String numTelefono = MiUtils.leerTextoPantalla("Introduzca el número de Telefono");
                                departamentosTrabajador departamentosTrabajador = MiUtils.menuDepartamentosTrabajador();
                                try{
                               nuevoDirector = new Director(nombre, fechaNacimientoDirector, dniDirector, direccionDirector, numeroSS, emailDirect, salarioDRECT, departamentosTrabajador, numTelefono);
                                nuevaEmpresa.registrarDirector(nuevoDirector);
                                System.out.println(nuevoDirector.toString());
                            } catch (directorExistente e){
                                System.out.println(e.getMessage());
                            }
                               break;
                                case "b)":
                                    reader = new Scanner(System.in);
                                    String numTelefonoGerente = MiUtils.leerTextoPantalla("Introduzca el número de Telefono");
                                    String nombregerente = MiUtils.leerTextoPantalla("Introduzca el nombre del gerente.");
                                    System.out.println("Introduzca la fecha de nacimiento");
                                    LocalDate fechaNacimientogerente = MiUtils.fechaconformato();
                                    String dnigerente = MiUtils.comprobarPatronRepetidamente(patronDNI, "Introduzca el DNI: \n");
                                    String direcciongerente = MiUtils.leerTextoPantalla("Introduzca la Direccion: \n");
                                    String numeroSSGerente = MiUtils.comprobarPatronRepetidamente(patronSS, "Introduzca el numero de la Seguridad Social: \n");
                                    String emailGerente = MiUtils.leerTextoPantalla("Introduzca el email: \n");
                                    System.out.println("Introduzca el salario:");
                                    int salariogerente = reader.nextInt();
                                    departamentosTrabajador departamentosgerente = MiUtils.menuDepartamentosTrabajador();
                                    try{
                                    nuevoGerenteDep = new GerenteDep(numTelefonoGerente, nombregerente, fechaNacimientogerente, dnigerente, direcciongerente, numeroSSGerente, emailGerente, salariogerente, departamentosgerente);
                                        nuevaEmpresa.registrarTrabajador(nuevoGerenteDep);
                                    } catch (TrabajadorExistenteException e) {
                                        System.out.println(e.getMessage());
                                    }
                                break;
                                case "c":
                                    reader = new Scanner(System.in);
                                    String nombretrabajador = MiUtils.leerTextoPantalla("Introduzca el nombre del gerente.");
                                    System.out.println("Introduzca la fecha de nacimiento");
                                    LocalDate fechaNacimientotrabajador = MiUtils.fechaconformato();
                                    String dnitraba = MiUtils.comprobarPatronRepetidamente(patronDNI, "Introduzca el DNI: \n");
                                    String direcciontrabajador = MiUtils.leerTextoPantalla("Introduzca la Direccion: \n");
                                    String numeroSStrabaja = MiUtils.comprobarPatronRepetidamente(patronSS, "Introduzca el numero de la Seguridad Social: \n");
                                    String emailtrabaja = MiUtils.leerTextoPantalla("Introduzca el email: \n");
                                    System.out.println("Introduzca el salario:");
                                    int salariotrabaja = reader.nextInt();
                                    departamentosTrabajador departamentostraba = MiUtils.menuDepartamentosTrabajador();
                                    try{
                                        nuevoTrabajador = new Trabajador(nombretrabajador, fechaNacimientotrabajador, dnitraba, direcciontrabajador, numeroSStrabaja, emailtrabaja, salariotrabaja, departamentostraba);
                                            nuevaEmpresa.registrarTrabajador(nuevoTrabajador);
                                        } catch (TrabajadorExistenteException e) {
                                            System.out.println(e.getMessage());
                                        }
                                        break;
                    }

                }
                break;
                    case "2":
                System.out.println(nuevaEmpresa.trabajadores());
                break;
                    case"5":
                    reader = new Scanner(System.in);
                    System.out.println("Seleccione el dni del trabajador que vas a dar de baja.");
                    System.out.println(nuevaEmpresa.trabajadores());
                    String dni = reader.nextLine();
                    nuevaEmpresa.eliminarCliente(dni);
            default:
                    System.out.println("Opción no valida. Intente de nuevo.");
        }



        
    } while (!opcion.equals("7"));

    }
}
