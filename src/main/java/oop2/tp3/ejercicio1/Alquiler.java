package oop2.tp3.ejercicio1;

public class Alquiler {
    private CopiaLibro copia;
    private int diasAlquilados;

    public Alquiler(CopiaLibro copia, int diasAlquilados) {
        this.copia = copia;
        this.diasAlquilados = diasAlquilados;
    }

    public int diasAlquilados() {
        return this.diasAlquilados;
    }

    public CopiaLibro copia() {
        return this.copia;
    }

    public double determinarMonto(){
            return copia().libro().calcularMonto(diasAlquilados());
    }

    public int determinarPuntos(){
        int puntosAlquilerFrecuente = 1;
        if ((copia().libro().codigoPrecio() == Libro.NUEVO_LANZAMIENTO)
                && diasAlquilados() > 1) {
            puntosAlquilerFrecuente++;
        }
        return puntosAlquilerFrecuente;
    }
}
