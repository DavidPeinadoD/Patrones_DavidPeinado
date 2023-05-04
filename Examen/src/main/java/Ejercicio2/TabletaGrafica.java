package Ejercicio2;

import Ejercicio2.Factories.DispositivoEntrada;

import java.util.List;

public class TabletaGrafica extends DispositivoEntrada {
    public TabletaGrafica(String nombreFabricante, String modelo, double precioVenta, String tipoConector, List<Integer> puertosValidos) {
        super(nombreFabricante, modelo, precioVenta, tipoConector, puertosValidos);
    }

    public String getTipo() {
        return "Tableta Grafica";
    }
}
