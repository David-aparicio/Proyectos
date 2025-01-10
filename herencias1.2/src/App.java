import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String options;

        Scanner sc = new Scanner(System.in);

        Mascotas [] mascotas = new Mascotas[100];

        System.out.println("\n----Pon la informacion necesaria de la mascota----\n");

        System.out.println("Nombre");
        String Nombre = sc.nextLine();

        System.out.println("¿Cual es la edad?");
        double Edad = sc.nextDouble();

        System.out.println("¿Esta vivo?");
                
                
        System.out.println("Escriba si o no");

        sc = new Scanner(System.in);

        boolean estaVivo = false;
        String estado = sc.nextLine();
        
            if (estado.equalsIgnoreCase("si")){
                estaVivo = true;
            
            }else if (estado.equalsIgnoreCase("no")){
                estaVivo = false;
            
            }else System.out.println("tienes que escribir 'si' o 'no'");
           
        LocalDate fechaDeNacimiento = Myutils.leerFecha();
		LocalDate hoy = LocalDate.now();
		Period AñoNacimiento = Period.between(fechaDeNacimiento, hoy);
        LocalDateTime fechaDeNacimientoDateTime = fechaDeNacimiento.atStartOfDay();

        Mascotas informacion = new Mascotas(Nombre, Edad, estaVivo, fechaDeNacimientoDateTime);
        System.out.println(informacion + "\n");  

        sc = new Scanner(System.in);
        System.out.println("1) Perro");

        System.out.println("2) Gato");

        System.out.println("3) Es un pajaro");

        options = sc.nextLine();

        if (options.equals("1")) {

            Perro nuevaRaza = null;
        
            System.out.println("Pon los datos del Perro");

            System.out.println("Raza");

            String Raza = sc.nextLine();

            System.out.println("tiene pulgas?");

            System.out.println("escribe 'si' o 'no'");

            boolean Pulgas = false;
            String pulgas = sc.nextLine();
            
            if (pulgas.equalsIgnoreCase("si")){
                Pulgas = true;
                
            }else if (pulgas.equalsIgnoreCase("no")){
                Pulgas = false;
                
            }else System.out.println("tienes que escribir 'si' o 'no'");

            System.out.println("Quieres que hable?");

            String HablarPerro = sc.nextLine();

            if(estaVivo == true){
            if (HablarPerro.equalsIgnoreCase("si")){

                System.out.println("El perro ladra");
            }
            }else {
                System.out.println("esta muerto");
            }
            
            

            Perro informacion2 = new Perro(Nombre, Edad, estaVivo, fechaDeNacimientoDateTime, Raza, Pulgas);
            System.out.println(informacion2 + "\n");
        }        

        if (options.equals("2")) {

            sc = new Scanner(System.in);

            System.out.println("Pon los datos para el gato");

            System.out.println("De que color es?");

            String color = sc.nextLine();
            System.out.println("¿Tiene el pelo largo?");

            System.out.println("escribe si o no");

            boolean PeloLargo = false;
            String Pelo = sc.nextLine();
            
            if (Pelo.equalsIgnoreCase("si")){
                PeloLargo = true;
                
            }else if (Pelo.equalsIgnoreCase("no")){
                PeloLargo = false;
                
            }else System.out.println("tienes que escribir si' o no");

            System.out.println("¿Quieres que hable?");

            String HablarGato = sc.nextLine();
            
            if (HablarGato.equalsIgnoreCase("si")){
                System.out.println("El gato habla ");
            }

            Gato informacion3 = new Gato(Nombre, Edad, estaVivo, fechaDeNacimientoDateTime, color, PeloLargo);
            System.out.println(informacion3 + "\n");
        }

        String options2 = "";

        if (options.equals("3")) {
            sc = new Scanner(System.in);

            System.out.println("Como es el pico?");

            String pico = sc.nextLine();

            System.out.println("vuela?");

            String vuela = sc.nextLine();

            System.out.println("¿Quieres que vuele?");

            String volar = sc.nextLine();
            
            if (vuela.equalsIgnoreCase("si")){

                System.out.println("Esta volando");
            }

            Aves informacion4 = new Aves(Nombre, Edad, estaVivo, fechaDeNacimientoDateTime, pico, vuela);

            System.out.println(informacion4 + "\n");

            System.out.println("Que tipo de Ave es?");
            System.out.println("1) Loro");

            System.out.println("2) Canario");

            options2 = sc.nextLine();

        }    

        if (options2.equals("1")) {
            sc = new Scanner(System.in);

            System.out.println("Pon los datos para el loro");

            System.out.println("Cual es su origen");

            String Origen = sc.nextLine();

            System.out.println("Sabe hablar?");

            String Hablar = sc.nextLine();

            System.out.println("¿Quieres que hable?");
            String HablarPajaro = sc.nextLine();
            
            if (Hablar.equalsIgnoreCase("si")){

                System.out.println("¡Hola soy un loro!");
            }else {
                System.out.println("Pio Pio");
            }

            System.out.println("Quieres que vuele?");

            String volarLoro = sc.nextLine();

            if (volarLoro.equalsIgnoreCase("si")){

                System.out.println("Esta volando");
            }

            Loro informacion5 = new Loro(Nombre, Edad, estaVivo, fechaDeNacimientoDateTime, HablarPajaro, volarLoro, Origen, Hablar);

            System.out.println(informacion5 + "\n");
        }    

        if (options2.equals("1")) {

            System.out.println("Que color es?");

            String Color = sc.nextLine();

            System.out.println("Sabe cantar?");

            String Canta = sc.nextLine();

            System.out.println("Quieres que cante?");

            String hablarPajaro = sc.nextLine();
            
            if (Canta.equalsIgnoreCase("si")){
                System.out.println("¡un elefante se balanceaba sobre la tela de una araña!");
            }else {
                System.out.println("no sabe cantar");
            }

            System.out.println("Quieres que hable?");

            String Pajaro2 = sc.nextLine();
            
            if (Pajaro2.equalsIgnoreCase("si")){

                System.out.println("¡Pio Pio!");
            }

            System.out.println("Quieres que vuele?");

            String volarLoro = sc.nextLine();

            if (volarLoro.equalsIgnoreCase("si")){
                
                System.out.println("Esta volando");
            }

            Canario informacion6 = new Canario(Nombre, Edad, estaVivo, fechaDeNacimientoDateTime, Color, Canta, Color, Canta);
            System.out.println(informacion6 + "\n");



        }
    }
}
