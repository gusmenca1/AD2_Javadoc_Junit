package javabean;

/**
 * Esta clase proporciona métodos para realizar varias operaciones de suma.
 * <p>
 * Esta clase incluye métodos para sumar dos o tres números, tanto enteros como reales, y manejar un valor acumulado.
 * </p>
 *
 * @author Gustavo Mendoza
 * @version 1.0
 * @see Producto_GustavoMendoza
 */
public class Suma_GustavoMendoza {
    private double valorAcumulado = 0; // Valor acumulado de las sumas

    /**
     * Suma dos números reales. Este metodo proporciona una suma precisa de números reales,
     * pero la precisión está limitada por la representación de punto flotante en Java.
     * En casos de sumas con números demasiado grandes el resultado puede sufrir de pérdida de precisión.
     *
     * @param numero1 primer número real a sumar.
     * @param numero2 segundo número real a sumar.
     * @return la suma de numero1 y numero2, que podría no ser exacta si los números son muy grandes.
     */
    public double sumarReales(double numero1, double numero2) {
        return numero1 + numero2;
    }

    /**
     * Suma dos números enteros.
     *
     * @param numero1 primer sumando entero.
     * @param numero2 segundo sumando entero.
     * @return la suma de numero1 y numero2.
     */
    public int sumarEnteros (int numero1, int numero2) {
        return numero1 + numero2;
    }

    /**
     * Suma tres números reales.
     *
     * @param numero1 primer sumando.
     * @param numero2 segundo sumando.
     * @param numero3 tercer sumando.
     * @return suma de numero1, numero2 y numero3.
     */
    public double sumarTresnumeros (double numero1, double numero2, double numero3) {
        return numero1 + numero2 + numero3;
    }

    /**
     * Suma un número real al valor acumulado.
     *
     *  Ejemplo de uso:
     *  <pre> {@code
     *  Suma_GustavoMendoza suma = new Suma_GustavoMendoza();
     *  suma.sumarAcumulado(2.5);
     *  suma.sumarAcumulado(3.6);
     *  System.out.println(suma.getValorAcumulado()); // Imprime 6.1
     *  } </pre>
     *
     * @param numero el número real a añadir al valor acumulado.
     * @return el nuevo valor acumulado.
     *
     */
    public double sumarAcumulado(double numero) {
        valorAcumulado += numero;
        return valorAcumulado;
    }

    /**
     * Obtiene el valor acumulado actual. Este valor representa la suma total acumulada
     * de todos los números reales añadidos.
     *
     * @return el valor acumulado.
     */
    public double getValorAcumulado() {
        return valorAcumulado;
    }
}