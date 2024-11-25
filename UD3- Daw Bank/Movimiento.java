import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {

        private static int contador = 0;

        private int id;
        private String fecha;
        private String tipo;
        private double cantidad;



        //Constructores
        private static final DateTimeFormatter Horario = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        public Movimiento(String tipo, double cantidad) {
            this.id = contador;
            contador++;
            this.fecha = LocalDateTime.now().format(Horario);
            this.tipo = tipo ;
            this.cantidad = cantidad;

        }

        //Getters y Setters
        public int getId(){
            return this.id;
        }

        public String getFecha(){
            return this.fecha;
        }
        public String getTipo(){
            return this.tipo;
        }
        public double getCantidad(){
            return this.cantidad;
        }
        public void  setCantidad(int cantidad){
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
