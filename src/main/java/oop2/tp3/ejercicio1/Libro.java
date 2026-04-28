package oop2.tp3.ejercicio1;

public class Libro {
    public static final int INFANTILES = 2;
    public static final int REGULARES = 0;
    public static final int NUEVO_LANZAMIENTO = 1;
    private String nombre;
    private int codigoPrecio;

    public Libro(String nombre, int priceCode) {
        this.nombre = nombre;
        this.codigoPrecio = priceCode;
    }

    public int codigoPrecio() {
        return codigoPrecio;
    }

    public String nombre() {
        return nombre;
    }

    public double calcularMonto(int dias){
        if(this.codigoPrecio() == REGULARES){
                double monto = 2;
                if (dias > 2)
                    monto += (dias - 2) * 1.5;
                return monto;
        }
        if(this.codigoPrecio() == INFANTILES){
            double monto = 1.5;
            if (dias > 3)
                monto += (dias - 3) * 1.5;
            return monto;
        }

        if(this.codigoPrecio() == NUEVO_LANZAMIENTO){
            double monto = 1.5;
            if (dias > 3)
                monto += (dias - 3) * 1.5;
            return monto;
        }
        return 0;
    }


}