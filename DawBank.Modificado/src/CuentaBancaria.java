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


    public boolean ingresar(double cantidad){
        boolean isOk = false;
        Movimiento m = new Movimiento(Tipo.Ingreso, cantidad);
        this.saldo = this.saldo + m.getCantidad();
        this.registrarMovimiento();
        isOk = true;
        return isOk;
    }

    public boolean retirar(double cantidad){
        boolean isOk = false;
        if(this.saldo - cantidad > -50){
            Movimiento m = new Movimiento(Tipo.Retirada, cantidad);
            this.saldo = this.saldo - m.getCantidad();
            this.registrarMovimiento();
            isOk = true;
        }
        return isOk;
    }

    public void registrarMovimiento(){
        contadorMovimiento++;
    }

    

    public String mostrarInfoMovimientos(){
        String info = "";
        if(contadorMovimiento > 0){
            for (Movimiento nuMovimiento : movimientos) {
                info += nuMovimiento.toString();
            }
            }else{
            info = "No hay movimientos en esta cuenta";
        }

        return info;
    }


    @Override
    public String toString() {
        return " \niban: " + iban + ", saldo: " + saldo + "]";
    }



}
