package org.example;

public class ClienteExistenteException extends Exception{
    public ClienteExistenteException(String mensaje) {
        super(mensaje);
    }
}
