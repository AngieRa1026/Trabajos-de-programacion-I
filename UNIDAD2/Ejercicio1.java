
import java.util.Random;

public class Ejercicio1 {

    public static void main(String[] args) {
        int[] vectorNumero = new int[10];
        Random random = new Random();

        for (int i = 0; i < vectorNumero.length; i++) {
            vectorNumero[i] = random.nextInt(10);
        }

        System.out.println("Numero - Cuadrado - Cubo");
        for (int numero : vectorNumero) {
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.println(numero + " - " + cuadrado + " - " + cubo);
        }
    }
}
