import java.util.Scanner;

public class DawBank {
        public static void main(String[] args) throws Exception {
            
            Scanner reader  = new Scanner (System.in);
            String opcion = "";

            do { 
                reader = new Scanner(System.in);
                System.out.println("Por favor seleccione una opcion \n" + "1) Datos de la cuenta. \n" + "2) IBAN. \n" + "3) Titular.\n" +"4) Saldo. \n" + "5) Ingreso. \n" + "6) Retirada. \n" + "7) Movimiento. \n" + "8) Salir. \n");
                opcion = reader.nextLine();

                    switch(opcion){
                            
                        case "1":




                            
                    }








                opcion = reader.nextLine();

                
            } while (true);
    }
}