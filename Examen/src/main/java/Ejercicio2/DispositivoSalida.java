package Ejercicio2.Factories;

import java.util.List;

public abstract class DispositivoSalida extends Componente {
    protected List<Integer> puertosValidos;

    public DispositivoSalida(String nombreFabricante, String modelo, double precioVenta, List<Integer> puertosValidos) {
        super(nombreFabricante, modelo, precioVenta);
        this.puertosValidos = puertosValidos;
    }

    public abstract String getTipo();

    public String getDescripcion() {
        return getTipo() + " " + nombreFabricante + " " + modelo;
    }
}
