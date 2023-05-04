package Ejercicio2;

import Ejercicio2.Factories.Impresora;

import java.util.List;

public class ImpresoraLaser extends Impresora {
    private int velocidad;

    public ImpresoraLaser(String nombreFabricante, String modelo, double precioVenta, List<Integer> puertosValidos, String tipoCartucho, int paginasDesdeUltimoCambio, int velocidad) {
        super(nombreFabricante, modelo, precioVenta, puertosValidos, tipoCartucho, paginasDesdeUltimoCambio);
        this.velocidad = velocidad;
    }

    public void imprimir() {
        // Implementación de la impresión para una impresora láser
    }

    @Override
    public String getTipo() {
        return null;
    }
}
