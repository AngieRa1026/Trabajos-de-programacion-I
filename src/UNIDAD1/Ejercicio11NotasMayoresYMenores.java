package unidad1;

import java.util.Scanner;

public class Ejercicio11NotasMayoresYMenores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota del alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();

        }
        System.out.println("Los que tienen promedio mayor o igual a 7 son: ");
        for (int i = 0; i < 10; i++) {
            if (notas[i] >= 7) {
                System.out.println("Alumno " + (i + 1) + ": " + notas[i]);

            }
        }
        scanner.close();

        System.out.println("Los que tienen promedio menor a 7 son: ");
        for (int i = 0; i < 10; i++) {
            if (notas[i] < 7) {
                System.out.println("Alumno " + (i + 1) + ": " + notas[i]);

            }
        }

        scanner.close();
    }
}
