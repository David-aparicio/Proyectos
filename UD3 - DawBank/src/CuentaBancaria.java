public class CuentaBancaria {
    private String iban;
    private String Titular;
    private double  Saldo;
    private Movimiento [] movimientos;


    public CuentaBancaria(String iban, String Titular, int nMovimentos){
        this.iban = iban;
        this.movimientos = new Movimiento[nMovimentos];
        
    }
}