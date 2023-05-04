package Ejercicio2;

import Ejercicio2.Factories.Componente;

import java.util.List;

public class PantallaTactil extends Componente {
    protected List<Integer> puertosValidos;

    public PantallaTactil(String nombreFabricante, String modelo, double precioVenta, List<Integer> puertosValidos) {
        super(nombreFabricante, modelo, precioVenta);
        this.puertosValidos = puertosValidos;
    }

    public String getTipo() {
        return "Pantalla Tactil";
    }

    public String getDescripcion() {
        return getTipo() + " " + nombreFabricante + " " + modelo;
    }
}
