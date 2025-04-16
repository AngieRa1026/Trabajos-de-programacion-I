package unidadDos;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        String[] mesNombre = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };

        int[] diasMes = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número del mes (1-12): ");
        int numeroMes = scanner.nextInt();

        if (numeroMes >= 1 && numeroMes <= 12) {
            String nombreMes = mesNombre[numeroMes - 1];
            int dias = diasMes[numeroMes - 1];
            System.out.println("El mes " + numeroMes + " es " + nombreMes + " y tiene " + dias + " días.");
        } else {
            System.out.println("Número de mes inválido. Por favor, introduce un número entre 1 y 12.");
        }

        scanner.close();
    }
}
