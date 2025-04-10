package unidad1;

import java.util.Scanner;

public class Ejercicio3DosDigitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número de uno o dos dígitos: ");
        int numero = scanner.nextInt();
        scanner.close();
        if (numero >= 100) {
            System.out.println("El número " + numero + " no es un número de uno o dos dígitos");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El número " + numero + " es un número de dos dígitos");
        } else if (numero >= 0 && numero <= 9) {
            System.out.println("El número " + numero + " es un número de un dígito");
        } else {
            System.out.println("El número " + numero + " no es un número de uno o dos dígitos");
        }
        scanner.close();
    }
}
