package Ejercicio2.Factories;

import java.util.List;

public abstract class Impresora extends DispositivoSalida {
    protected String tipoCartucho;
    protected int paginasDesdeUltimoCambio;

    public Impresora(String nombreFabricante, String modelo, double precioVenta, List<Integer> puertosValidos, String tipoCartucho, int paginasDesdeUltimoCambio) {
        super(nombreFabricante, modelo, precioVenta, puertosValidos);
        this.tipoCartucho = tipoCartucho;
        this.paginasDesdeUltimoCambio = paginasDesdeUltimoCambio;
    }

    public abstract void imprimir();
}
