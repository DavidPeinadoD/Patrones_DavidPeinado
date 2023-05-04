package Ejercicio1;


import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Crear bases simples
            BaseSimpleBuilder builder = new BaseSimpleBuilder();
        BaseSimple base1 = (BaseSimple) builder.setNombre("Base 1")
                .setNumeroAmbulancias(2)
                .setTiempoMedioAsistencia(10)
                .build();
        BaseSimple base2 = (BaseSimple) builder.setNombre("Base 2")
                .setNumeroAmbulancias(3)
                .setTiempoMedioAsistencia(8)
                .build();
        BaseSimple base3 = (BaseSimple) builder.setNombre("Base 3")
                .setNumeroAmbulancias(1)
                .setTiempoMedioAsistencia(12)
                .build();

        // Crear bases compuestas
        List<Base> bases = new ArrayList<>();
        bases.add(base1);
        bases.add(base2);
        BaseCompuesta baseCompuesta1 = new BaseCompuesta("Base Compuesta 1", bases);

        bases = new ArrayList<>();
        bases.add(base2);
        bases.add(base3);
        BaseCompuesta baseCompuesta2 = new BaseCompuesta("Base Compuesta 2", bases);

        // Imprimir información de las bases
        System.out.println(base1.getNombre() + " tiene " + base1.getNumeroAmbulancias() + " ambulancias y un tiempo medio de asistencia de " + base1.getTiempoMedioAsistencia() + " minutos.");
        System.out.println(base2.getNombre() + " tiene " + base2.getNumeroAmbulancias() + " ambulancias y un tiempo medio de asistencia de " + base2.getTiempoMedioAsistencia() + " minutos.");
        System.out.println(base3.getNombre() + " tiene " + base3.getNumeroAmbulancias() + " ambulancias y un tiempo medio de asistencia de " + base3.getTiempoMedioAsistencia() + " minutos.");

        System.out.println(baseCompuesta1.getNombre() + " tiene " + baseCompuesta1.getNumeroAmbulancias() + " ambulancias y un tiempo medio de asistencia de " + baseCompuesta1.getTiempoMedioAsistencia() + " minutos.");
        System.out.println(baseCompuesta2.getNombre() + " tiene " + baseCompuesta2.getNumeroAmbulancias() + " ambulancias y un tiempo medio de asistencia de " + baseCompuesta2.getTiempoMedioAsistencia() + " minutos.");
    }
}
