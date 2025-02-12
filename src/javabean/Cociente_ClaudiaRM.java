package javabean;

import java.util.Scanner;

public class Cociente_ClaudiaRM {

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
    public double dividirReales(double a, double b) {
        if(b==0){
            throw new ArithmeticException("No se puede dividir entre 0");
        }
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
    public int dividirEnteros(int a, int b) {
        if(b==0){
            throw new ArithmeticException("No se puede dividir entre 0");
        }
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
        if(a==0){
            throw new ArithmeticException("El inverso de 0 no está definido");
        }
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
        if(a<0){
            throw new IllegalArgumentException("Una raíz cuadrada de un " +
                    "numero " + "negativo no tiene solución");
        }
        return Math.sqrt(a);
    }

    //Menú de la calculadora.
    public static void menu(){
        Scanner leer = new Scanner(System.in);
        char opcion;

        // Crear una instancia de la clase.
        Cociente_ClaudiaRM cociente = new Cociente_ClaudiaRM();

        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("Dividir reales (R)");
            System.out.println("Dividir enteros enteros (E)");
            System.out.println("Calcular el inverso de un número real (I)");
            System.out.println("Calcular la raíz cuadrada de un número real (C)");
            System.out.println("Salir (X)");

            opcion = leer.next().charAt(0);
            switch (opcion){
                case 'R':
                    cociente.dividirReales(2,3);
                    break;
                case 'E':
                    cociente.dividirEnteros(5,4);
                    break;
                case 'I':
                    cociente.inverso(4);
                    break;
                case 'C':
                    cociente.raiz(2);
                    break;

            }
        }while (leer.nextLine().equals("X"));

    }



}

