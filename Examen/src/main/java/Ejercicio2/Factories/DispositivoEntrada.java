package Ejercicio2.Factories;

import java.util.List;

public abstract class DispositivoEntrada extends Componente {
    protected String tipoConector;
    protected List<Integer> puertosValidos;

    public DispositivoEntrada(String nombreFabricante, String modelo, double precioVenta, String tipoConector, List<Integer> puertosValidos) {
        super(nombreFabricante, modelo, precioVenta);
        this.tipoConector = tipoConector;
        this.puertosValidos = puertosValidos;
    }

    public abstract String getTipo();

    public String getDescripcion() {
        return getTipo() + " " + nombreFabricante + " " + modelo;
    }
}
