package unidad1;

import java.util.Scanner;

public class Ejercicio6NumeroEntero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo");
        } else {
            System.out.println("El número " + numero + " es cero");
        }
        scanner.close();
    }
}
