package unidadDos;

import java.util.Random;

public class Ejercicio1 {

    public static void main(String[] args) {
        int[] vectorNumeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < vectorNumeros.length; i++) {
            vectorNumeros[i] = random.nextInt(10) + 1;
        }

        for (int numero : vectorNumeros) {
            int cubo = numero * numero * numero;
            int cuadrado = numero * numero;
            System.out.println("El numero: " + numero + " su cuadrado es: " + cuadrado + " y su cubo es: " + cubo);
        }
    }
}
