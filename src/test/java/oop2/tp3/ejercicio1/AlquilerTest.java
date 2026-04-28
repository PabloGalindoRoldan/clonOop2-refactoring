package oop2.tp3.ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlquilerTest {
    private Cliente cliente;

    @BeforeEach
    void setUp() {
        cliente = new Cliente("Pablo Galindo");
    }

    @Test
    public void alquilerLibroRegularMasDeDosDias(){
        //Arrange
        Libro libro = new Libro("El nombre del viento", Libro.REGULARES);
        CopiaLibro copia = new CopiaLibro(libro);
        Alquiler alquiler = new Alquiler(copia, 3);

        //Act
        cliente.alquilar(alquiler);
        cliente.calcularDeudaYPuntosObtenidos();

        //Assert

            Object[] resultado = cliente.calcularDeudaYPuntosObtenidos();
            assertEquals(3.5, resultado[0]);
            assertEquals(1, resultado[1]);
    }

    @Test
        public void alquilerLibroNuevoLanzamiento(){
        //Arrange
        Libro libro = new Libro("El nombre del viento", Libro.NUEVO_LANZAMIENTO);
        Libro libro2 = new Libro("El principito", Libro.INFANTILES);
        CopiaLibro copia = new CopiaLibro(libro);
        CopiaLibro copia2 = new CopiaLibro(libro2);
        Alquiler alquiler = new Alquiler(copia, 3);
        Alquiler alquiler2 = new Alquiler(copia2, 1);
        Alquiler alquiler3 = new Alquiler(copia2, 4);

        //Act
        cliente.alquilar(alquiler);
        cliente.alquilar(alquiler2);
        cliente.alquilar(alquiler3);
        cliente.calcularDeudaYPuntosObtenidos();

        //Assert
        Object [] resultado = cliente.calcularDeudaYPuntosObtenidos();
        assertEquals(13.5, resultado[0]);
        assertEquals(4, resultado[1]);
    }

    @Test
    public void testMetodoNombreLibro(){
        //Arrange
        Libro libro = new Libro("El nombre del viento", Libro.REGULARES);

        //Act
        //libro.nombre();

        //Assert
        String resultado = libro.nombre();
        assertEquals("El nombre del viento", resultado);

    }

}