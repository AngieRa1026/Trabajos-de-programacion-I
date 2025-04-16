package unidadDos;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar arrays para las temperaturas mínimas y máximas
        double[] tempMinimas = new double[5];
        double[] tempMaximas = new double[5];

        // Leer temperaturas mínimas y máximas
        System.out.println("Introduce la temperatura mínima y máxima de 5 días:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Día " + (i + 1) + " - Temperatura mínima: ");
            tempMinimas[i] = scanner.nextDouble();

            System.out.print("Día " + (i + 1) + " - Temperatura máxima: ");
            tempMaximas[i] = scanner.nextDouble();
        }

        // Calcular y mostrar la temperatura media de cada día
        System.out.println("\nTemperatura media de cada día:");
        for (int i = 0; i < 5; i++) {
            double media = (tempMinimas[i] + tempMaximas[i]) / 2;
            System.out.println("Día " + (i + 1) + ": " + media);
        }

        // Encontrar los días con la menor temperatura mínima
        double menorTemperatura = tempMinimas[0];
        for (int i = 1; i < 5; i++) {
            if (tempMinimas[i] < menorTemperatura) {
                menorTemperatura = tempMinimas[i];
            }
        }

        System.out.println("\nDías con la menor temperatura mínima (" + menorTemperatura + "):");
        for (int i = 0; i < 5; i++) {
            if (tempMinimas[i] == menorTemperatura) {
                System.out.println("Día " + (i + 1));
            }
        }

        // Buscar días cuya temperatura máxima coincide con un valor dado
        System.out.print("\nIntroduce una temperatura máxima para buscar los días: ");
        double temperaturaBusqueda = scanner.nextDouble();

        boolean encontrado = false;
        System.out.println("Días con temperatura máxima igual a " + temperaturaBusqueda + ":");
        for (int i = 0; i < 5; i++) {
            if (tempMaximas[i] == temperaturaBusqueda) {
                System.out.println("Día " + (i + 1));
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay ningún día con una temperatura máxima igual a " + temperaturaBusqueda + ".");
        }

        scanner.close();
    }
}
