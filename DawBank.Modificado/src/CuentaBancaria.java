import java.util.LinkedList;

public class CuentaBancaria {

    private Cliente nuevoCliente;
    private String iban;
    private double saldo;
    private LinkedList<Movimiento> movimientos = new LinkedList<Movimiento>();

    private int contadorMovimiento = 0;
    
    
    public CuentaBancaria(Cliente nuevoCliente, String iban) {
        this.nuevoCliente = nuevoCliente;
        this.iban = iban;
        this.saldo = 0.0;
        this.movimientos = new LinkedList<Movimiento>();
    }


    public Cliente getNuevoCliente() {
        return this.nuevoCliente;
    }


    public String getIban() {
        return this.iban;
    }


    public double getSaldo() {
        return this.saldo;
    }


    public void ingresar(double cantidad)throws AvisarHaciendaException,ValorIncorrecto{
                Movimiento m = new Movimiento(Tipo.Ingreso, cantidad);
        this.saldo = this.saldo + m.getCantidad();
        this.registrarMovimiento(Tipo.Ingreso, cantidad);
        
        if (cantidad <= 0) {
            throw new ValorIncorrecto("La cantidad debe ser mayor a 0.");
        }
        if (cantidad >= 3000) {
            throw new AvisarHaciendaException("AVISO: Notificar a hacienda. Ten cuidado");
        }



    }

    public void retirar(double cantidad)throws CuentaException,ValorIncorrecto{
        Movimiento m = new Movimiento(Tipo.Retirada, cantidad);
            this.saldo = this.saldo - m.getCantidad();
            this.registrarMovimiento(Tipo.Retirada, cantidad);
        if(cantidad <= 0){
            throw new CuentaException("La cantidad debe ser mayor a 0.");
        }
        if(cantidad >= -50){
            throw new ValorIncorrecto("No se te permite retirar por tu saldo");
        }
            
    }

    public void registrarMovimiento(Tipo tipo,double cantidad){

        Movimiento m = new Movimiento(tipo, cantidad);
        movimientos.add(m);
        contadorMovimiento++;
    }

    

    public String mostrarInfoMovimientos(){
        String info = "";
        if(contadorMovimiento > 0){   
        for (Movimiento m : movimientos) {
                info += m.toString();
            }
        }else{
            info = "No ha habido movimientos."; 
        }
        return info;
    }


    @Override
    public String toString() {
        return " \niban: " + iban + ", saldo: " + saldo + "]";
    }



}
