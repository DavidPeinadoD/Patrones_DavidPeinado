package Ejercicio1;

public class BaseSimpleBuilder {
    private String nombre;
    private int numeroAmbulancias;
    private int tiempoMedioAsistencia;

    public BaseSimpleBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public BaseSimpleBuilder setNumeroAmbulancias(int numeroAmbulancias) {
        this.numeroAmbulancias = numeroAmbulancias;
        return this;
    }

    public BaseSimpleBuilder setTiempoMedioAsistencia(int tiempoMedioAsistencia) {
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
        return this;
    }

    public BaseSimple build() {
        return new BaseSimple(nombre, numeroAmbulancias, tiempoMedioAsistencia);
    }
}
