package unidadDos;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vectorOriginal = new String[5];

        System.out.println("Ingrese los 5 elementos de cadena de caracteres");
        for (int i = 0; i < vectorOriginal.length; i++) {
            System.out.println("cadena " + (i + 1) + ": ");
            vectorOriginal[i] = scanner.nextLine();
        }
        String[] vectorInvertido = new String[5];
        for (int i = 0; i < vectorOriginal.length; i++) {
            vectorInvertido[i] = vectorOriginal[vectorOriginal.length - 1 - i];
        }
        System.out.println("\nVector invertido");
        for (String cadena : vectorInvertido) {
            System.out.println(cadena);

        }
        scanner.close();
    }
}
