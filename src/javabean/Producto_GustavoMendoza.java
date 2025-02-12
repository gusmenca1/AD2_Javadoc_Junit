package javabean;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * La clase Producto_GustavoMendoza proporciona métodos para realizar operaciones
 * matemáticas básicas como multiplicación y potencia de números.
 * <p>
 * Esta clase es capaz de multiplicar dos o tres números reales o enteros y
 * calcular la potencia de un número dado.
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
     * @return El producto de numero1 y numero2. Será cero si alguno de los
     * números es cero.
     */
    public double multiplicarReales(double numero1, double numero2) {
        return numero1 * numero2;
    }

    /**
     * Calcula el producto de dos números enteros.
     * Se permite la entrada de double con el fin de practicar el lanzamiento
     * de una excepción.
     * Si cualquiera de los números es cero, el resultado será cero.
     * @param numero1 El primer número double.
     * @param numero2 El segundo número entero.
     * @return El producto de numero1 y numero2. Será cero si alguno de los
     * números es cero.
     * @throws IllegalArgumentException si el resultado de la multiplicación
     * causa un desbordamiento.
     */
    public int multiplicarEnteros(int numero1, int numero2) {
        long result = (long) numero1 * (long) numero2;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Multiplicación fuera de los " +
                    "límites de un entero.");
        }
        return (int) result;
    }

    /**
     * Calcula el producto de tres números reales.
     *Si cualquiera de los números es cero, el resultado será cero.
     *
     * @param numero1 El primer número real.
     * @param numero2 El segundo número real.
     * @param numero3 El tercer número real.
     * @return El producto de numero1, numero2 y numero3. Será cero si alguno de
     * los números es cero.
     */
    public double multiplicarTresnumeros (double numero1, double numero2, double
            numero3) {
        return numero1 * numero2 * numero3;
    }

    /**
     * Calcula la potencia de un número real y exponente entero. Lanza una
     * excepción si la base es negativa
     * y el exponente no es entero.
     *
     * Casos especiales:
     * - Si la base es cero y el exponente distinto de cero, el resultado es cero.
     * - Si el exponente es cero y la base distinta de cero el resultado es uno.
     *
     * Este metodo puede manejar grandes números, pero hay algunas limitaciones:
     *  *
     * - Si la potencia resultante excede el rango de un double,
     *  el resultado será Infinity para potencias positivas o -Infinity para
     *  potencias negativas.
     *
     *
     * @param base La base de la potencia, un número real.
     * @param exponente El exponente de la potencia, un número entero.
     * @return El resultado de elevar la base al exponente.
     * @throws IllegalArgumentException si los argumentos no permiten una
     * operación matemática estándar.
     */
    public double potencia(double base, int exponente) {
        if (base < 0 && exponente != Math.floor(exponente)) {
            throw new IllegalArgumentException("Una base negativa y un exponente" +
                    " fraccionario da un número complejo como resultado.");
        }
        return Math.pow(base, exponente);    }

    /**
     * Menú interactivo en la consola para realizar diferentes operaciones de
     * multiplicación.
     * El usuario puede elegir entre multiplicar dos números reales, dos números
     * enteros, tres números,
     * calcular la potencia de un número, o salir del programa.
     *
     * Las opciones del menú son:
     * - 'R' para multiplicar dos números reales. Ejemplo: multiplica 2.0 y 3.0.
     * - 'E' para multiplicar dos números enteros. Ejemplo: multiplica 5 y 4.
     * - 'T' para multiplicar tres números. Ejemplo: multiplica 4, 3 y 2.
     * - 'P' para calcular la potencia de un número. Ejemplo: calcula 2 elevado
     * a la potencia de 3.
     * - 'X' para salir del menú.
     *
     * Este metodo se repetirá hasta que el usuario decida salir seleccionando 'X'.
     *
     * @throws InputMismatchException si se ingresa un tipo de dato incorrecto
     * al seleccionar opciones.
     *        Asegúrese de ingresar caracteres únicamente, ya que otros tipos de
     *        datos causarán errores en la ejecución.
     */
    public static void menu(){
        Scanner leer = new Scanner(System.in);
        char opcion;
        Producto_GustavoMendoza producto = new Producto_GustavoMendoza();
        // Crear una instancia de la clase


        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("Multiplicar reales (R)");
            System.out.println("Multiplicar enteros (E)");
            System.out.println("Multiplicar tres números (T)");
            System.out.println("Potencia (P)");
            System.out.println("Salir (X)");

            opcion = leer.next().charAt(0);
            switch (opcion){
                case 'R':
                    producto.multiplicarReales(2,3);
                    break;
                case 'E':
                    producto.multiplicarEnteros(5,4);
                    break;
                case 'T':
                    producto.multiplicarTresnumeros(4,3,2);
                    break;
                case 'P':
                    producto.potencia(2,3);
                    break;

            }
        }while (leer.nextLine().equals("X"));

    }

}
