package Ejercicio2.Factories;

import java.util.List;

public abstract class Pantalla extends DispositivoSalida {
    private int resolucion;
    private float pulgadas;

    public Pantalla(String fabricante, String modelo, float precio, List<Integer> puertosValidos, int resolucion, float pulgadas) {
        super(fabricante, modelo, precio, puertosValidos);
        this.resolucion = resolucion;
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Pantalla [resolucion=" + resolucion + ", pulgadas=" + pulgadas + ", " + super.toString() + "]";
    }
}
