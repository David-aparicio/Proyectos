import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MiUtils {

    Scanner reader = new Scanner(System.in);
    public static double leerDoublePantalla(String mensaje){
        Scanner reader = new Scanner(System.in);
        System.out.println(mensaje);
        double valor = reader.nextDouble();
        reader.close();
        return valor;
    }

    public static void imprimir(String mensaje){
        System.out.println(mensaje);
    }

    public static LocalDate fechaconformato(){
    Scanner entrada = new Scanner(System.in);

    DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
    MiUtils.imprimir("\nEscribe la fecha de nacimiento en formato DD/MM/AAAA");
    String dateString = entrada.nextLine();

    LocalDate fechaLocalDate = LocalDate.parse(dateString, formatter);
    return fechaLocalDate;
    }
    

    public static departamentosTrabajador menuDepartamentosTrabajador(){
        Scanner reader = new Scanner((System.in));
        departamentosTrabajador dep = null;
        System.out.println("Seleccione el departamento del Trabajador");
        for (int i = 0; i < departamentosTrabajador.values().length; i++){
            System.out.println((i+1) + "." + departamentosTrabajador.values()[i]);
        }
        System.out.println("Introduce el numero relacionado con el nombre del genero");
        int opcion = reader.nextInt();
        if (opcion >= 1 && opcion <= departamentosTrabajador.values().length){
            dep = departamentosTrabajador.values()[opcion - 1];
            System.out.println("El genero seleccionado es: " + dep);
        }
        return dep;
    }


    public static String leerTextoPantalla(String mensaje){
        Scanner reader = new Scanner(System.in);
        System.out.println(mensaje);
        String valor = reader.nextLine();
        return valor;
    }
    
    
    public static boolean comprobarPatron(String patron, String texto)
    {
        boolean isOk = false;
        Pattern pat = Pattern.compile(patron); //"[0-9]{7,8}[A-Za-z]"
        Matcher mat = pat.matcher(texto);
        isOk = mat.matches();
        return isOk;
    }

    public static String comprobarPatronRepetidamente(String patron, String mensaje){
        boolean isOk = false;
        String texto;
        do { 
            texto = MiUtils.leerTextoPantalla(mensaje);
            isOk = MiUtils.comprobarPatron(patron, texto);
            if(!isOk){
                MiUtils.imprimir("El formato es incorrecto");
            }
        } while (!isOk);
        return texto;
    }
    
}
