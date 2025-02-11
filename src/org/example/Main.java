package org.example;

import javabean.Cociente_ClaudiaRM;
import javabean.Producto_GustavoMendoza;
import javabean.Suma_GustavoMendoza;

import java.util.Scanner;

/**
 * Clase main que proporciona un menú para realizar operaciones matemáticas.
 * El usuario puede elegir entre sumar, restar, multiplicar, dividir o salir del programa.
 *
 * Cada opción activa un submenú correspondiente a la operación seleccionada, que está gestionado
 * por una clase específica para cada tipo de operación.
 *
 *  @author Gustavo Mendoza
 *  @version 1.0
 *  @see Producto_GustavoMendoza
 *  @see Suma_GustavoMendoza
 *
 */

public class Main {

    /**
     * Menú principal del programa. Presenta un menú de opciones y ejecuta la opción
     * seleccionada hasta que el usuario decide salir.
     *
     * @param args argumentos de línea de comandos (no utilizados).
     */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("¿Qué quieres hacer?");
            System.out.println("Operaciones de tipo sumar (S)");
            System.out.println("Operaciones de tipo restar (R)");
            System.out.println("Operaciones de tipo multiplicar (M)");
            System.out.println("Operaciones de tipo dividir (D)");
            System.out.println("Salir (X)");

            opcion = leer.next().charAt(0);
            switch (opcion){
                case 'S':
                    Suma_GustavoMendoza.menu();
                    break;
                case 'R':
                    //Resta_ClaudiaRM.menu();
                    break;
                case 'M':
                    Producto_GustavoMendoza.menu();
                    break;
                case 'D':
                    //Cociente_ClaudiaRM.menu();
                    break;
            }
        }while (leer.nextLine().equals("X"));

    }
}
