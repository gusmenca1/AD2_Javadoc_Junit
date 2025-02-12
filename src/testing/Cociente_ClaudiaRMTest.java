package testing;

import javabean.Cociente_ClaudiaRM;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas para {@link Cociente_ClaudiaRM}.
 * Verifica las funcionalidades de división y operaciones relacionadas con
 * cocientes.
 */
class Cociente_ClaudiaRMTest {

    private Cociente_ClaudiaRM cociente;

    /**.
     * Crea una instancia de Cociente_ClaudiaRM antes de cada prueba.
     */
    @BeforeEach
    void setUp() {
        cociente = new Cociente_ClaudiaRM();
    }

    /**
     * Prueba la división de dos números reales.
     * Verifica que la división de 3.0 por 2.0 es correcta y que dividir por
     * cero lanza ArithmeticException.
     */
    @Test
    void dividirReales() {
        double resultado = cociente.dividirReales(3.0, 2.0);
        assertEquals(1.5, resultado, "La división de 3.0 por 2.0 debe ser 1.5");
        assertThrows(ArithmeticException.class, () -> cociente.dividirReales(
                3.0, 0.0), "Dividir por cero debe lanzar ArithmeticException");
    }

    /**
     * Prueba la división de dos enteros.
     * Verifica que la división de 3 por 2 es correcta y que dividir por cero
     * lanza ArithmeticException.
     */
    @Test
    void dividirEnteros() {
        int resultado = cociente.dividirEnteros(3, 2);
        assertEquals(1, resultado, "La división de 3 por 2 debe ser 1");
        assertTrue(resultado > 0, "El resultado es positivo");
        assertThrows(ArithmeticException.class, () ->
                cociente.dividirEnteros(3, 0), "Dividir por cero debe " +
                "lanzar ArithmeticException");
    }

    /**
     * Prueba el cálculo del inverso de un número.
     * Verifica que el inverso de 3 es aproximadamente 0.3333 y que intentar
     * calcular el inverso de cero lanza ArithmeticException.
     */
    @Test
    void inverso() {
        double resultado = cociente.inverso(3);
        assertEquals(0.3333333333333333, resultado, 0.0000001, "El inverso de " +
                "3 debe ser aproximadamente 0.3333");
        assertFalse(resultado > 1, "El inverso de un número mayor a 1 debe " +
                "estar entre 0 y 1");
        assertThrows(ArithmeticException.class, () -> cociente.inverso(0),
                "Calcular el inverso de cero debe lanzar ArithmeticException");
    }

    /**
     * Prueba la función de raíz cuadrada.
     * Verifica que la raíz cuadrada de 9 es 3 y que calcular la raíz cuadrada
     * de un número negativo lanza IllegalArgumentException.
     */
    @Test
    void raiz() {
        double resultado = cociente.raiz(9);
        assertEquals(3.0, resultado, "La raíz cuadrada de 9 debe ser 3");
        assertThrows(IllegalArgumentException.class, () -> cociente.raiz(-1),
                "Calcular la raíz cuadrada de un número negativo debe lanzar " +
                        "IllegalArgumentException");
    }
}
