import java.time.LocalDate;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a DawBank tu banco de confianza ");

        final String patronIban = "[A-Z]{2}[0-9]{22}";

        String iban = MiUtils.comprobarPatronRepetidamente(patronIban, "Introduzca el IBAN");
        System.out.println("Vamos a crear un cliente");
        String nombre = MiUtils.leerTextoPantalla("Introduce el nombre del cliente: ");
        LocalDate fechaNacimiento = MiUtils.leerFecha("Introduce la fecha de cumpleaños: ");
        String numeroTeléfono = MiUtils.leerTextoPantalla("Introduce el número de teléfono: ");
        String dni = MiUtils.leerTextoPantalla("Intdocuce el dni");
        String direccion = MiUtils.leerTextoPantalla("Introduce la direccion: ");

        Cliente nuevoCliente = new Cliente(nombre, dni, fechaNacimiento, numeroTeléfono, dni, direccion);
        CuentaBancaria miCuenta = new CuentaBancaria(nuevoCliente, iban);

        String opcion = "";
        Scanner reader;
        do {
            reader = new Scanner(System.in);
            
            imprimirMenuOpciones();

            opcion = reader.nextLine();

            menuBanca(miCuenta, opcion,nuevoCliente);


        } while (!opcion.equalsIgnoreCase("8"));
    }

    private static void imprimirMenuOpciones() {
        System.out.println("Escoga la opcion que desee");
        System.out.println("1. Datos de la cuenta");
        System.out.println("2. IBAN");
        System.out.println("3. Titular");
        System.out.println("4. Saldo");
        System.out.println("5. Ingreso");
        System.out.println("6. Retirada");
        System.out.println("7. Movimientos");
        System.out.println("8. Salir");
    }

    private static void menuBanca(CuentaBancaria miCuenta, String opcion, Cliente nuevoCliente) {
        switch (opcion) {
            case "1":
                System.out.println(nuevoCliente.toString() + miCuenta.toString());
                break;

            case "2":
                System.out.println(miCuenta.getIban());
                break;

            case "3":
                System.out.println(miCuenta.getNuevoCliente());
                break;
            case "4":
                System.out.println(miCuenta.getSaldo());
                break;

            case "5":
                double cantidad = MiUtils.leerDoublePantalla("Introduzca la cantidad a ingresar");
                miCuenta.ingresar(cantidad);
                if(cantidad > 3000.0){
                    System.out.println("ALta cantidad: se ejecuta aviso a Hacienda");
                }
                break;

            case "6":
                double cantidadR = MiUtils.leerDoublePantalla("Introduzca la cantidad a retirar");
                if((miCuenta.getSaldo()-cantidadR) < -50){
                    System.out.println("“AVISO: Saldo negativo, no se puede realizar la retirada");
                }
                else{
                    miCuenta.retirar(cantidadR);
                }
                break;

            case "7":
                System.out.println(miCuenta.mostrarInfoMovimientos());
                break;
            case "8":
                System.out.println("Se cerrara el programa. Sayonra baby!!!");
                break;

            default:
                System.out.println("Opcion incorrecta, vuelva a escoger");
        }   
    }
}
