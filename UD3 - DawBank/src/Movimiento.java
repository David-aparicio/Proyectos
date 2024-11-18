
import java.time.LocalDateTime;

public class Movimiento {

        private static int contador = 0;

        private int id;
        private String fecha;
        private boolean tipo;
        private double cantidad;



        //Constructores
        public Movimiento( boolean tipo, double cantidad) {
            this.id = contador;
            contador++;
            this.fecha = LocalDateTime.now().toString();
            this.tipo = tipo;
            this.cantidad = cantidad;

        }

        //Getters y Setters
        public int getId(){
            return this.id;
        }

        public String getFecha(){
            return this.fecha;
        }
        public boolean getTipo(){
            return this.tipo;
        }
        public double getCantidad(){
            return this.cantidad;
        }
        public void  setCantidad(){
            if(cantidad >0){
                this.cantidad = cantidad;
            }else{
                System.out.println("El valor debe ser positivo");
            }
        }  

        //Metodo

        public String mostrarInfoMovimiento(){

            String info = String.format("Movimientos - ID %s, Fecha: %s , Tipo %s, Cantidad %s"
            , this.id, this.fecha, this.tipo, this.cantidad);
    
            return info;
        }


}
