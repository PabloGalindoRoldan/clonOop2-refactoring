package oop2.tp3.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();
    private String name;

    public Cliente(String nombre) {
        this.name = nombre;
    }

    public Object [] calcularDeudaYPuntosObtenidos(){
        Object [] resultado = new Object[2];
        double montoTotal = 0;
        int puntosTotales = 0;
        for (Alquiler alquiler : alquileres){
            montoTotal += alquiler.determinarMonto();
            puntosTotales += alquiler.determinarPuntos();
        }
        resultado[0] = montoTotal;
        resultado[1] = puntosTotales;
        return resultado;
    }


    public void alquilar(Alquiler rental) {
        alquileres.add(rental);
    }
}