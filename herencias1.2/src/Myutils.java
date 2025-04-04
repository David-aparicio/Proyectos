
    import java.time.LocalDate;
    import java.time.format.DateTimeFormatter;
    import java.util.Scanner;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;
    
    public class Myutils {
    
        public static double leerDoublePantalla(String mensaje){
            Scanner reader = new Scanner(System.in);
            System.out.println(mensaje);
            double valor = reader.nextDouble();
            reader.close();
            return valor;
        }
        public static LocalDate leerFecha(){
            Scanner entrada = new Scanner(System.in);
    
            DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
            Myutils.imprimir("\nEscribe la fecha de nacimiento en formato DD/MM/AAAA");
            String dateString = entrada.nextLine();
    
            
            LocalDate fechaLocalDate = LocalDate.parse(dateString, formatter);
            return fechaLocalDate;
        }
        public static void imprimir(String mensaje){
            System.out.println(mensaje);
        }
    
        public static LocalDate fechaconformato(){
        Scanner entrada = new Scanner(System.in);
    
        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Myutils.imprimir("\nEscribe la fecha de nacimiento en formato DD/MM/AAAA");
        String dateString = entrada.nextLine();
    
        LocalDate fechaLocalDate = LocalDate.parse(dateString, formatter);
        return fechaLocalDate;
        }
    
    
    
        public static String leerTextoPantalla(String mensaje){
            Scanner reader = new Scanner(System.in);
            System.out.println(mensaje);
            String valor = reader.nextLine();
            return valor;
        }
    
        /*
         * Funcion generica que recibe un patron en formato string y comprueba el texto
         */
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
                texto = Myutils.leerTextoPantalla(mensaje);
                isOk = Myutils.comprobarPatron(patron, texto);
                if(!isOk){
                    Myutils.imprimir("El formato es incorrecto");
                }
            } while (!isOk);
            return texto;
        }
    }

