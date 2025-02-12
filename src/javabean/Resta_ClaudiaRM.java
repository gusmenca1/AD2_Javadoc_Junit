package javabean;

import java.util.Scanner;

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
    public double restarReales(double a, double b) {
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
    public int restarEnteros(int a, int b) {
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
    public double restarTresReales(double a, double b, double c) {
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

    // Menú de la calculadora.
    public static void menu() {
        Scanner leer = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("Restar reales (R)");
            System.out.println("Restar enteros (E)");
            System.out.println("Restar tres números (T)");
            System.out.println("Restar acumulado (A)");
            System.out.println("Salir (X)");

            opcion = leer.next().charAt(0);
            switch (opcion) {
                case 'R':
                    restar.restarReales(2, 3);
                    break;
                case 'E':
                    restar.restarEnteros(3, 4);
                    break;
                case 'T':
                    restar.restarTresReales(4, 3, 2);
                    break;
                case 'A':
                    restar.restarAcumulando(4);
                    break;
            }
        } while (leer.nextLine().equals("X"));
    }
}