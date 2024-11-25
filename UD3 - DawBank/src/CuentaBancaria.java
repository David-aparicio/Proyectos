

public class CuentaBancaria {
    private String iban;
    private String titular;
    private double  saldo;
    private Movimiento [] movimientos;
    private int elementosactuales;

    public CuentaBancaria(String iban, String titular, int nMovimientos){
        this.iban = iban;
        this.movimientos = new Movimiento[nMovimientos];
        this.titular = titular;
        this.saldo = 0;
    }

    public String getIban(){
        return this.iban;
    }

    public String getTitular(){
        return this.titular;
    }
    public double getSaldo(){
        return this.saldo;
    }



    //Ingresar
    public boolean ingresar(Movimiento m1){
        boolean isAdd = false;
        
        if(m1 !=null){
            if(m1.getCantidad() <= 0){
             System.out.println("Introduzca una cantidad valida.");
            }else{
                this.movimientos[elementosactuales] = m1;
                this.elementosactuales ++;
                this.saldo = this.saldo + m1.getCantidad();
                isAdd = true;
            }
        
        }//if principal
        return isAdd;
    }




    //Retirar
    public boolean retirada(Movimiento m1){
        boolean isRemoved = false;

        if(m1 != null){
            if(m1.getCantidad() <= 0){
                System.out.println("Introduzca una cantidad valida. ");
            }
            if (this.saldo - m1.getCantidad()<= -50){
                System.out.println("No puedes operar con un saldo menor a -50");
            }else{
                this.movimientos[elementosactuales] = m1;
                this.elementosactuales ++;
                this.saldo = this.saldo - m1.getCantidad();
                isRemoved = true;
            }
        }
        return isRemoved;
    }
}
