package unidadDos;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vector = new int[10];
        int contador = 0;

        System.out.println("Ingrese valores enteros para llenar el vector");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Numero " + (1 + i) + " : ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }
            vector[contador] = numero;
            contador++;
        }
        System.out.println("Elementos del vector: ");
        for (int i = 0; i < contador; i++) {
            System.out.println(vector[i]);
        }
        scanner.close();
    }
}
