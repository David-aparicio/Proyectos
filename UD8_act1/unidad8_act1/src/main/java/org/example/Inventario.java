package org.example;

public class   Inventario {
    private int id;
    private String referencia;
    private String nombre;
    private String descripcion;
    private int tipo;
    private int cantidad;
    private double precio;
    private int descuento;
    private int iva;
    private boolean aplicarDto;

    public Inventario(int id, String referencia, String nombre, String descripcion, int tipo, int cantidad, double precio, int descuento, int iva, boolean aplicarDto) {
        this.id = id;
        this.referencia = referencia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.iva = iva;
        this.aplicarDto = aplicarDto;
    }
    public Inventario(String referencia, String nombre, String descripcion, int tipo, int cantidad, double precio, int descuento, int iva, boolean aplicarDto) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
        this.iva = iva;
        this.aplicarDto = aplicarDto;
    }
    public int getId() {
        return id;
    }
    public String getReferencia() {
        return referencia;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getTipo() {
        return tipo;
    }
    public int getCantidad() {
        return cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public int getDescuento() {
        return descuento;
    }
    public int getIva() {
        return iva;
    }
    public boolean isAplicarDto() {
        return aplicarDto;
    }


    @Override
    public String toString() {
        return "Inventario{" +
                "aplicarDto=" + aplicarDto +
                ", id=" + id +
                ", referencia='" + referencia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipo=" + tipo +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", descuento=" + descuento +
                ", iva=" + iva +
                '}';
    }
}
