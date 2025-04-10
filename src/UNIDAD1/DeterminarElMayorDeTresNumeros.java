package unidad1;

import java.util.Scanner;

public class DeterminarElMayorDeTresNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        System.out.println("Ingrese el tercer número: ");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("El mayor es " + a);
        } else if (b > a && b > c) {
            System.out.println("El mayor es " + b);
        } else {
            System.out.println("El mayor es " + c);
        }
        scanner.close();
    }
}
