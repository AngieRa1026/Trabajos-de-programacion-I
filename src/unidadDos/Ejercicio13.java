package unidadDos;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numConductores;
        int diasSemana = 7;

        System.out.print("Ingrese el numero de conductores: ");
        numConductores = scanner.nextInt();
        scanner.nextLine();

        String[] nombre = new String[numConductores];
        int[][] kms = new int[numConductores][diasSemana];
        int[] totalKms = new int[numConductores];

        for (int i = 0; i < numConductores; i++) {
            System.out.print("Ingrese el nombre del conductor " + (i + 1) + ": ");
            nombre[i] = scanner.nextLine();
        }

        for (int i = 0; i < numConductores; i++) {
            System.out.println("Ingrese los kilOmetros recorridos por " + nombre[i] + " cada dIa:");
            for (int j = 0; j < diasSemana; j++) {
                System.out.print("Dia " + (j + 1) + ": ");
                kms[i][j] = scanner.nextInt();
                totalKms[i] += kms[i][j];
            }
        }

        System.out.println("Kilometros recorridos por cada conductor:");
        for (int i = 0; i < numConductores; i++) {
            System.out.println(nombre[i] + " ha recorrido un total de " + totalKms[i] + " km.");
        }

        scanner.close();
    }
}
