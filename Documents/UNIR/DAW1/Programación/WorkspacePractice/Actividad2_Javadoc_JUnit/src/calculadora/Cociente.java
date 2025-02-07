package calculadora;

public class Cociente {

    /**
     * Esta clase proporciona métodos para realizar operaciones matemáticas 
     * relacionadas con el cociente, el inverso y la raíz de los números.
     *
	 * @author Claudia Rodríguez Mayán
	 * @version 1.0
	 * 
	 */	
	
	// Método 1: Cociente de dos números reales.
    /**
     * Calcula el cociente de dos números reales.
     *
     * @param a El primer número real (dividendo).
     * @param b El segundo número real (divisor).
     * @return El cociente de a y b.
     * @throws ArithmeticException Si b es cero.
     */
    public double dividir(double a, double b) {
        return a / b;
    }
    
    // Método 2: Cociente de dos números enteros.
    /**
     * Calcula el cociente de dos números enteros.
     *
     * @param a El primer número entero (dividendo).
     * @param b El segundo número entero (divisor).
     * @return El cociente de a y b.
     * @throws ArithmeticException Si b es cero.
     */
    public int dividir(int a, int b) {
        return a / b;
    }

    // Método 3: Inverso de un número real.
    /**
     * Calcula el inverso de un número real.
     *
     * @param a El número real.
     * @return El inverso de a.
     * @throws ArithmeticException Si a es cero, ya que el inverso no está 
     * definido.
     */
     public double inverso(double a) {
        return 1 / a;
    }
 
     // Método 4: Raíz de un número.
    /**
     * Calcula la raíz cuadrada de un número real.
     *
     * @param a El número real.
     * @return La raíz cuadrada de a.
  	 * @throws IllegalArgumentException Si a es negativo.
     */
     public double raiz(double a) {
        return Math.sqrt(a);
    }
}
