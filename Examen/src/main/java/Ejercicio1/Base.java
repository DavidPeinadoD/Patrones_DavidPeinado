package Ejercicio1;

public abstract class Base implements BaseBuilder {
    private String nombre;
    private int numeroAmbulancias;
    private int tiempoMedioAsistencia;

    public Base(String nombre, int numeroAmbulancias, int tiempoMedioAsistencia) {
        this.nombre = nombre;
        this.numeroAmbulancias = numeroAmbulancias;
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroAmbulancias() {
        return numeroAmbulancias;
    }

    public int getTiempoMedioAsistencia() {
        return tiempoMedioAsistencia;
    }

    @Override
    public BaseBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public BaseBuilder setNumeroAmbulancias(int numeroAmbulancias) {
        this.numeroAmbulancias = numeroAmbulancias;
        return this;
    }

    @Override
    public BaseBuilder setTiempoMedioAsistencia(int tiempoMedioAsistencia) {
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
        return this;
    }

    @Override
    public Base build() {
        return this;
    }
}
