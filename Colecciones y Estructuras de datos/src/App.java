
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*        int valor = 0;

        //Ejercicio1

        try {
            System.out.println("Introduce un valor entero: ");
            valor = sc.nextInt();
            System.out.println("Valor introducido:" + valor);
        } catch (InputMismatchException e) {
        System.out.println("El valor introducido es incorrecto.");
        }

        //Ejercicio2
        sc = new Scanner(System.in);
        int valorA = 0;
        int valorB = 0;
        int resultado = 0;
        try{
            System.out.println("Introduce el valor A:");
            valorA = sc.nextInt();
            System.out.println("Introduce el valor B");
            valorB = sc.nextInt();
            resultado = valorA / valorB;
            System.out.println("El resultado es: " + resultado);
        }catch(InputMismatchException e) {
            System.out.println("El valor introducido es incorrecto");
        }catch (ArithmeticException e) {
            System.out.println("Error en la operacion");
        }

        //Ejercicio3
        
        double [] vector = new double[5];

        for(int i = 0; i < vector.length; i++){
            
            try{
                sc = new  Scanner(System.in);
                System.out.println("Introduce el valor del número " );
                vector[i] = sc.nextDouble();
                
            
        }catch(InputMismatchException e){
            System.out.println("El valor es incorrecto");
            
        }
    }
    */
    
    //Ejercicio4
            sc = new  Scanner(System.in);
            boolean continuar = true;
    
            while (continuar) {
                try {
                    System.out.print("Introduce un número: ");
                    int numero = sc.nextInt();
    
                    imprimePositivo(numero);
                    
                    imprimeNegativo(numero);
                    

                } catch (Exception e) {
                    S
                } finally {
                    System.out.print("¿Quieres introducir otro número? (s/n): ");
                    String respuesta = sc.next();
                    if (!respuesta.equalsIgnoreCase("s")) {
                        continuar = false;
                    }
                }
            }
        }

        
        public static void imprimePositivo(int p) throws Exception {
            if (p < 0) {
                throw new Exception("Error: El número debe ser positivo.");
            }
        }
    
        public static void imprimeNegativo(int n) throws Exception {
            
            if (n >= 0) {
                throw new Exception("Error: El número debe ser negativo.");
            }
        }
}