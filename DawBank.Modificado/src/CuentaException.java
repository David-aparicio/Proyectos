public class CuentaException extends Exception{
// La utilizaremos para anzar excepciones relacionadas con cuentas bancarias.
public CuentaException(String mensaje) {
    super(mensaje);
}
}
