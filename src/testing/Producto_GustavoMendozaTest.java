package testing;

import javabean.Producto_GustavoMendoza;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas para {@link Producto_GustavoMendoza}.
 * Verifica las funcionalidades de multiplicación y potencia.
 */

class Producto_GustavoMendozaTest {

    private Producto_GustavoMendoza producto;

    /**.
     * Crea una instancia de Producto_GustavoMendoza antes de cada prueba.
     */
    @BeforeEach
    void setUp() {
        producto = new Producto_GustavoMendoza();
    }

    /**
     * Prueba la multiplicación de dos números reales.
     * Verifica que la multiplicación de 2.0 por 3.0 es correcta y que
     * multiplicar por cero da cero.
     */
    @Test
    void multiplicarReales() {
        assertEquals(6.0, producto.multiplicarReales(2.0, 3.0),
                "La multiplicación de 2.0 y 3.0 debe ser 6.0");
        assertEquals(0.0, producto.multiplicarReales(0.0, 3.0),
                "La multiplicación de 0.0 y 3.0 debe ser 0.0");
    }

    /**
     * Prueba la multiplicación de dos números enteros.
     * Verifica que la multiplicación de 5 por 4 es correcta y que
     * multiplicar por cero da cero.
     */
    @Test
    void multiplicarEnteros() {
        assertEquals(20, producto.multiplicarEnteros(5, 4),
                "La multiplicación de 5 y 4 debe ser 20");
        assertThrows(IllegalArgumentException.class, () ->
                producto.multiplicarEnteros(Integer.MAX_VALUE, 2),
                "Multiplicación fuera de los límites de un entero debe " +
                        "lanzar IllegalArgumentException");
    }

    /**
     * Prueba la multiplicación de tres números reales.
     * Verifica que la multiplicación de 2.0, 3.0 y 4.0 es correcta y que
     * multiplicar por cero da cero.
     */
    @Test
    void multiplicarTresnumeros() {
        assertEquals(24.0, producto.multiplicarTresnumeros(2.0, 3.0, 4.0),
                "La multiplicación de 2.0, 3.0 y 4.0 debe ser 24.0");
        assertEquals(0.0, producto.multiplicarTresnumeros(2.0, 0.0, 4.0),
                "La multiplicación de 2.0, 0.0 y 4.0 debe ser 0.0");
    }

    /**
     * Prueba el cálculo de la potencia de un número.
     * Verifica que 2 elevado a la potencia de 3 es 8.0 y que cualquier número
     * elevado a la potencia de 0 es 1.0.
     */
    @Test
    void potencia() {
        assertEquals(8.0, producto.potencia(2.0, 3),
                "2 elevado a la potencia de 3 debe ser 8.0");
        assertEquals(1.0, producto.potencia(2.0, 0),
                "Cualquier número elevado a la potencia de 0 debe ser 1.0");
        assertThrows(IllegalArgumentException.class, ()
                -> producto.potencia(-2.0, 0.5),
                "Una base negativa y un exponente fraccionario debe lanzar " +
                        "IllegalArgumentException");
    }
}