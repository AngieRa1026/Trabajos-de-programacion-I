package unidadDos;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {

    public static void main(String[] args) {
        int[] vector = new int[5];
        Random random = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(50) + 1;
        }
        System.out.println("Vector original ");
        System.out.println(Arrays.toString(vector));

        Arrays.sort(vector);

        System.out.println("el vector ordenado es: ");
        System.out.println(Arrays.toString(vector));
    }
}
