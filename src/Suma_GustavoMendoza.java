import java.util.Scanner;
import java.util.InputMismatchException;


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


    /**
     * Menú interactivo en la consola para realizar las diferentes operaciones de suma.
     * El usuario puede elegir entre sumar dos números reales, dos números enteros, tres números,
     * sumar un número al acumulado actual o recuperar el valor acumulado hasta el momento.
     * El menú se repite hasta que el usuario elige la opción 'Salir'.
     *
     * Las operaciones disponibles son:
     * - 'R' para sumar dos números reales. Por ejemplo, suma 2.0 y 3.0.
     * - 'E' para sumar dos números enteros. Por ejemplo, suma 3 y 4.
     * - 'T' para sumar tres números. Por ejemplo, suma 4, 5, y 7.
     * - 'A' para añadir un número al acumulado. Por ejemplo, añade 4 al acumulado.
     * - 'C' para mostrar el valor acumulado actual.
     * - 'X' para salir del menú y terminar la ejecución del metodo.
     *
     * @throws InputMismatchException si se ingresa un tipo de dato incorrecto al seleccionar opciones.
     *        Asegúrese de ingresar caracteres únicamente, ya que otros tipos de datos causarán errores en la ejecución.
     */
    public static void menu(){
        Scanner leer = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("Sumar reales (R)");
            System.out.println("Sumar enteros (E)");
            System.out.println("Sumar tres números (T)");
            System.out.println("Sumar acumulado (A)");
            System.out.println("Conseguir acumulado (C)");
            System.out.println("Salir (X)");

            opcion = leer.next().charAt(0);
            Suma_GustavoMendoza suma = new Suma_GustavoMendoza();
            switch (opcion) {
                case 'R':
                    System.out.println("Resultado: " + suma.sumarReales(2,3));
                    break;
                case 'E':
                    System.out.println("Resultado: " + suma.sumarEnteros(3,4));
                    break;
                case 'T':
                    System.out.println("Resultado: " + suma.sumarTresnumeros(4,5,7));
                    break;
                case 'A':
                    System.out.println("Nuevo valor acumulado: " + suma.sumarAcumulado(4));
                    break;
                case 'C':
                    System.out.println("Valor acumulado: " + suma.getValorAcumulado());
                    break;

            }
        } while (!leer.next().equals("X")); // Corregido el error de comparación
    }
}


