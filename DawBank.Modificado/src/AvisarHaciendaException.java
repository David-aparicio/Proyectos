public class AvisarHaciendaException extends Exception{
//La utilizaremos para lanzar una excepción cuando haya que avisar a hacienda.
public AvisarHaciendaException (String mensaje) {
    super(mensaje);
}
}
