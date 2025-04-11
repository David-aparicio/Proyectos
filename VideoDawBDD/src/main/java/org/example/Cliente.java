package org.example;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;

public class Cliente extends Persona{

    private static int contadorsocio = 1;
    private LocalDate fechaBaja;
    private LinkedList <Articulo> articulosAlquilados;
    private int codigoSocio;


    public Cliente(String dni, String nombre, String direccion, LocalDate fechaNacimiento){
        super(dni, nombre, direccion, fechaNacimiento);
        this.fechaBaja = null;
        this.codigoSocio = contadorsocio;
        contadorsocio++;
        this.articulosAlquilados = new LinkedList<>();
    }


    public LocalDate getFechaBaja() {
        return fechaBaja;
    }


    public LinkedList<Articulo> getArticulosAlquilados() {
        return articulosAlquilados;
    }


    public int getCodigoSocio() {
        return codigoSocio;
    }


    @Override
    public String toString() {
        return "Cliente [dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", fechaNacimiento="
                + fechaNacimiento + ", codigoSocio=" + codigoSocio + "]";
    }

    public void agregarArticuloAlquilado(Articulo articulo) {
        articulosAlquilados.add(articulo);
    }
    public String mostrarArticulosAlquilados(){
        Iterator  <Articulo> itera = articulosAlquilados.iterator();
        Articulo articulos = null;
        while (itera.hasNext()){
            articulos = itera.next();
        }
        return articulos.toString();
    }
    public void eliminarArticuloAlquilado(Articulo articulo) {
        articulosAlquilados.remove(articulo);
    }

    
}
