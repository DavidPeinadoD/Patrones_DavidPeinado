package Ejercicio2.Factories;

public abstract class Componente {
    protected String nombreFabricante;
    protected String modelo;
    protected double precioVenta;

    public Componente(String nombreFabricante, String modelo, double precioVenta) {
        this.nombreFabricante = nombreFabricante;
        this.modelo = modelo;
        this.precioVenta = precioVenta;
    }

    public abstract String getDescripcion();
}
