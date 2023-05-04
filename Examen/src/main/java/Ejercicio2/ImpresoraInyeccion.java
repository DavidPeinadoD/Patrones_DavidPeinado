package Ejercicio2;

import Ejercicio2.Factories.Impresora;

import java.util.List;

public class ImpresoraInyeccion extends Impresora {
    private boolean dobleCara;

    public ImpresoraInyeccion(String nombreFabricante, String modelo, double precioVenta, List<Integer> puertosValidos, String tipoCartucho, int paginasDesdeUltimoCambio, boolean dobleCara) {
        super(nombreFabricante, modelo, precioVenta, puertosValidos, tipoCartucho, paginasDesdeUltimoCambio);
        this.dobleCara = dobleCara;
    }

    public void imprimir() {
        // Implementación de la impresión para una impresora de inyección
    }

    @Override
    public String getTipo() {
        return null;
    }
}
