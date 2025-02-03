package javabean;

/**
 * La clase Producto_GustavoMendoza proporciona métodos para realizar operaciones matemáticas básicas
 * como multiplicación y potencia de números.
 * <p>
 * Esta clase es capaz de multiplicar dos o tres números reales o enteros y calcular la potencia de un número dado.
 * </p>
 *
 * @author Gustavo Mendoza
 * @version 1.0
 */
public class Producto_GustavoMendoza {

    /**
     * Calcula el producto de dos números reales.
     * Si cualquiera de los números es cero, el resultado será cero.
     *
     * @param numero1 El primer número real.
     * @param numero2 El segundo número real.
     * @return El producto de numero1 y numero2. Será cero si alguno de los números es cero.
     */
    public double multiplicarReales(double numero1, double numero2) {
        return numero1 * numero2;
    }

    /**
     * Calcula el producto de dos números enteros.
     * Si cualquiera de los números es cero, el resultado será cero.
     * @param numero1 El primer número entero.
     * @param numero2 El segundo número entero.
     * @return El producto de numero1 y numero2. Será cero si alguno de los números es cero.
     */
    public int multiplicarEnteros (int numero1, int numero2) {
        return numero1 * numero2;
    }

    /**
     * Calcula el producto de tres números reales.
     *Si cualquiera de los números es cero, el resultado será cero.
     *
     * @param numero1 El primer número real.
     * @param numero2 El segundo número real.
     * @param numero3 El tercer número real.
     * @return El producto de numero1, numero2 y numero3. Será cero si alguno de los números es cero.
     */
    public double multiplicarTresnumeros (double numero1, double numero2, double numero3) {
        return numero1 * numero2 * numero3;
    }

    /**
     * Calcula la potencia de un número real y exponente entero. Lanza una excepción si la base es negativa
     * y el exponente no es entero.
     *
     * Casos especiales:
     * - Si la base es cero y el exponente distinto de cero, el resultado es cero.
     * - Si el exponente es cero y la base distinta de cero el resultado es uno.
     *
     * Este metodo puede manejar grandes números, pero hay algunas limitaciones:
     *  *
     * - Si la potencia resultante excede el rango de un double,
     *  el resultado será Infinity para potencias positivas o -Infinity para potencias negativas.
     *
     *
     * @param base La base de la potencia, un número real.
     * @param exponente El exponente de la potencia, un número entero.
     * @return El resultado de elevar la base al exponente.
     * @throws IllegalArgumentException si los argumentos no permiten una operación matemática estándar.
     */
    public double potencia(double base, int exponente) {
        if (base < 0 && exponente != Math.floor(exponente)) {
            throw new IllegalArgumentException("Una base negativa y un exponente fraccionario da un número complejo como resultado.");
        }
        return Math.pow(base, exponente);    }
}