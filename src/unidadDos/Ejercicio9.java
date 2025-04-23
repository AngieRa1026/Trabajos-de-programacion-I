package unidadDos;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] tempMinimas = new double[5];
        double[] tempMaximas = new double[5];

        System.out.println("Introduce la temperatura minima y maxima de 5 dias:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Dia " + (i + 1) + " - Temperatura minima: ");
            tempMinimas[i] = scanner.nextDouble();

            System.out.print("Dia " + (i + 1) + " - Temperatura maxima: ");
            tempMaximas[i] = scanner.nextDouble();
        }

        System.out.println("Temperatura media de cada dia:");
        for (int i = 0; i < 5; i++) {
            double media = (tempMinimas[i] + tempMaximas[i]) / 2;
            System.out.println("Día " + (i + 1) + ": " + media);
        }

        double menorTemperatura = tempMinimas[0];
        for (int i = 1; i < 5; i++) {
            if (tempMinimas[i] < menorTemperatura) {
                menorTemperatura = tempMinimas[i];
            }
        }

        System.out.println("Dias con la menor temperatura minima (" + menorTemperatura + "):");
        for (int i = 0; i < 5; i++) {
            if (tempMinimas[i] == menorTemperatura) {
                System.out.println("Día " + (i + 1));
            }
        }

        System.out.print("Introduce una temperatura maxima para buscar los dias: ");
        double temperaturaBusqueda = scanner.nextDouble();

        boolean encontrado = false;
        System.out.println("Dias con temperatura maxima igual a " + temperaturaBusqueda + ":");
        for (int i = 0; i < 5; i++) {
            if (tempMaximas[i] == temperaturaBusqueda) {
                System.out.println("Dia " + (i + 1));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay ningun dia con una temperatura maxima igual a " + temperaturaBusqueda + ".");
        }

        scanner.close();
    }
}
