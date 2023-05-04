package Ejercicio1.Factories;

import Ejercicio1.Base;

public interface BaseBuilder {
    BaseBuilder setNombre(String nombre);
    BaseBuilder setNumeroAmbulancias(int numeroAmbulancias);
    BaseBuilder setTiempoMedioAsistencia(int tiempoMedioAsistencia);
    Base build();
}
