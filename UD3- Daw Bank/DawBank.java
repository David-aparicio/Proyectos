import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DawBank {
        public static void main(String[] args) throws Exception {
            
            Scanner reader  = new Scanner (System.in);
            String opcion = "";
            Pattern pat = Pattern.compile("[A-Z]{2}[0-9]{22}");

            System.out.println("Bienvenido a DAW BANK.\n"+"Introduzca un nombre de Usuario");
                String titular = reader.nextLine();
            System.out.println("Ahora introduzca su IBAN:");
                String iban = reader.nextLine();
                Matcher mat = pat.matcher(iban);
            
                while(!mat.matches()){
                    System.out.println("El IBAN es incorrecto");
                    System.out.println("Introduzca un IBAN correcto:");
                        iban = reader.nextLine();
                        mat = pat.matcher(iban);
                }

                
                CuentaBancaria datosusuario = new CuentaBancaria(iban, titular);

            
            do { 
                reader = new Scanner(System.in);
                System.out.println("===== Menu Principal ===== \n" + "1) Datos de la cuenta. \n" + "2) IBAN. \n" + "3) Titular.\n" +"4) Saldo. \n" + "5) Ingreso. \n" + "6) Retirada. \n" + "7) Movimiento. \n" + "8) Salir. \n");
                opcion = reader.nextLine();

                    switch(opcion){
                            
                        case "1": 
                            System.out.println("IBAN: " + datosusuario.getIban());
                            System.out.println("TITULAR: "+ datosusuario.getTitular());
                            System.out.println("SALDO: "+ datosusuario.getSaldo());
                            break;
                        
                        case  "2":
                            System.out.println("El IBAN del usuario es: "+ datosusuario.getIban());
                            break;
                        case "3" : 
                            System.out.println("El titular de la cuenta es: \n" + datosusuario.getTitular());
                            break;
                        case "4" :
                            System.out.println(datosusuario.getSaldo()+"Euros");
                            break;
                        case "5" :
                            reader = new Scanner(System.in);
                            System.out.println("Escriba la cantidad a ingresar: ");
                            double ingreso = reader.nextDouble();
                            Movimiento cantidadIngresada = new Movimiento("Ingreso", ingreso);
                            datosusuario.ingresar(cantidadIngresada);
                            break;
                        case "6" : 
                            reader = new Scanner(System.in);
                            System.out.println("Escriba la cantidad a retirar: ");
                            double cantidadRetirar = reader.nextDouble();
                            Movimiento retirada = new Movimiento("Retirada", cantidadRetirar);
                            datosusuario.retirada(retirada);
                            break;
                        case "7" :
                            System.out.println("Movimientos realizados:");
                            System.out.println(datosusuario.mostrarMv());
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