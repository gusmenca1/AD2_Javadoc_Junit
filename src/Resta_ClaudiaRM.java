public class Resta_ClaudiaRM {

    /**
     * Esta clase proporciona métodos para realizar operaciones matemáticas
     * relacionadas con la resta de números.
     *
     * @author Claudia Rodríguez Mayán
     * @version 1.0
     */

    // Atributos de clase.
    private double restaAcumulada = 0;

    // Método 1: Resta de dos números reales.
    /**
     * Calcula la resta de dos números reales.
     *
     * @param a El minuendo.
     * @param b El sustraendo.
     * @return La diferencia entre a y b.
     */
    public double restar(double a, double b) {
        return a - b;
    }

    // Método 2: Resta de dos números enteros.
    /**
     * Calcula la resta de dos números enteros.
     *
     * @param a El minuendo.
     * @param b El sustraendo.
     * @return La diferencia entre a y b.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    // Método 3: Resta de tres números reales.
    /**
     * Calcula la resta de tres números reales.
     *
     * @param a El minuendo.
     * @param b El primer sustraendo.
     * @param c El segundo sustraendo.
     * @return La diferencia entre a, b y c.
     */
    public double restar(double a, double b, double c) {
        return a - b - c;
    }

    // Método 4: Resta con valor acumulado.
    /**
     * Realiza una resta acumulativa sobre el atributo "restaAcumulada".
     *
     * @param sustraendo El valor a restar del acumulado.
     * @return El nuevo valor acumulado después de la resta.
     */
    public double restarAcumulando(double sustraendo) {
        return restaAcumulada -= sustraendo;
    }
}