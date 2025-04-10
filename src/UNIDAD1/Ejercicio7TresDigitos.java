package unidad1;

import java.util.Scanner;

public class Ejercicio7TresDigitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número de uno, dos o tres dijitos : ");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero > 999) {
            System.out.println("El número " + numero + " no es un número de uno, dos o tres dijitos");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El número " + numero + " es un número de dos dígitos");
        } else if (numero >= 0 && numero <= 9) {
            System.out.println("El número " + numero + " es un número de un dígito");
        }
        if (numero >= 100 && numero <= 999) {
            System.out.println("El número " + numero + " es un número de tres dígitos");
        } else {
        }
        scanner.close();
    }
}
