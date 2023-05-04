package Ejercicio1;

import java.util.List;

public class BaseCompuesta extends Base {
    private List<Base> bases;

    public BaseCompuesta(String nombre, List<Base> bases) {
        super(nombre, 0, 0);
        this.bases = bases;
        calcularNumeroAmbulancias();
        calcularTiempoMedioAsistencia();
    }

    private void calcularNumeroAmbulancias() {
        int numeroAmbulancias = 0;
        for (Base base : bases) {
            numeroAmbulancias += base.getNumeroAmbulancias();
        }
        setNumeroAmbulancias(numeroAmbulancias);
    }

    private void calcularTiempoMedioAsistencia() {
        int tiempoMedioAsistencia = 0;
        for (Base base : bases) {
            tiempoMedioAsistencia += base.getTiempoMedioAsistencia();
        }
        setTiempoMedioAsistencia(tiempoMedioAsistencia / bases.size());
    }
}
