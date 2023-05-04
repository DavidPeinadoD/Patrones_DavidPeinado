package Ejercicio1;

public interface BaseBuilder {
    BaseBuilder setNombre(String nombre);
    BaseBuilder setNumeroAmbulancias(int numeroAmbulancias);
    BaseBuilder setTiempoMedioAsistencia(int tiempoMedioAsistencia);
    Base build();
}
