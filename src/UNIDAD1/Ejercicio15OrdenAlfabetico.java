package unidad1;

import java.util.Scanner;

public class Ejercicio15OrdenAlfabetico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un nombre");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese otro nombre diferente");
        String nombre2 = scanner.nextLine();
        scanner.close();

        if (nombre1.compareToIgnoreCase(nombre2) < 0) {
            System.out.println("\nNombres ordenados alfabeticamente:");
            System.out.println("1. " + nombre1);
            System.out.println("2. " + nombre2);
        } else {
        }

        System.out.println("\nNombres ordenados alfabéticamente:");
        System.out.println("1. " + nombre2);
        System.out.println("2. " + nombre1);
        scanner.close();
    }
}
