package unidadDos;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] notas = new float[5];

        System.out.println("Ingrese las 5 notas del alumno");
        for (int i = 0; i < notas.length; i++) {
            float nota;
            do {
                System.out.println("Nota " + (1 + i) + ": ");
                nota = scanner.nextFloat();
                if (nota < 0 || nota > 10) {
                    System.out.println("La nota debe estar entre 0 y 10");
                }
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
        }
        System.out.println("Las notas ingresadas fueron: ");
        for (float nota : notas) {
            System.out.println(nota);
        }
        float suma = 0f;
        for (float nota : notas) {
            suma += nota;
        }
        float media = suma / notas.length;
        float notaAlta = notas[0];
        float notaBaja = notas[0];

        for (float nota : notas) {
            if (nota > notaAlta) {
                notaAlta = nota;
            }
            if (nota < notaBaja) {
                notaBaja = nota;
            }
        }
        System.out.println("La media de las notas es: " + media);
        System.out.println("La nota mas alta es: " + notaAlta);
        System.out.println("La nota mas baja es: " + notaBaja);
    }
}
