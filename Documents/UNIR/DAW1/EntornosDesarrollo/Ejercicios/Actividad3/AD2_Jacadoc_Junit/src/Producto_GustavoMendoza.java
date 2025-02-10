//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Producto_GustavoMendoza {
    public Producto_GustavoMendoza() {
    }

    public double multiplicarReales(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public int multiplicarEnteros(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public double multiplicarTresnumeros(double numero1, double numero2, double numero3) {
        return numero1 * numero2 * numero3;
    }

    public double potencia(double base, int exponente) {
        if (base < (double)0.0F && (double)exponente != Math.floor((double)exponente)) {
            throw new IllegalArgumentException("Una base negativa y un exponente fraccionario da un número complejo como resultado.");
        } else {
            return Math.pow(base, (double)exponente);
        }
    }

    public static void menu() {
        throw new Error("Unresolved compilation problems: \n\tCannot make a static reference to the non-static method multiplicarReales(double, double) from the type Producto_GustavoMendoza\n\tCannot make a static reference to the non-static method multiplicarEnteros(int, int) from the type Producto_GustavoMendoza\n\tCannot make a static reference to the non-static method multiplicarTresnumeros(double, double, double) from the type Producto_GustavoMendoza\n\tCannot make a static reference to the non-static method potencia(double, int) from the type Producto_GustavoMendoza\n\tIncompatible operand types int and String\n");
    }
}
