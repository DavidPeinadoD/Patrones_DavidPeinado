package Ejercicio2;

import Ejercicio2.Factories.Componente;

public class UnidadCentral extends Componente {
    public UnidadCentral(String nombreFabricante, String modelo, double precioVenta) {
        super(nombreFabricante, modelo, precioVenta);
    }

    public String getDescripcion() {
        return "Unidad Central " + nombreFabricante + " " + modelo;
    }
}
