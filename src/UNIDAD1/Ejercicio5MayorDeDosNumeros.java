package unidad1;

import java.util.Scanner;

public class Ejercicio5MayorDeDosNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        float numero1 = scanner.nextFloat();
        System.out.println("Ingrese el segundo número: ");
        float numero2 = scanner.nextFloat();
        scanner.close();

        if (numero1 > numero2) {
            System.out.println("El mayor es: " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("El mayor es: " + numero2);
        } else {
            System.out.println("Los números son iguales");
        }
        scanner.close();
    }
}
