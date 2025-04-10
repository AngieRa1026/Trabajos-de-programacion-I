package unidad1;

import java.util.Scanner;

public class Ejercicio1MayorDeDosNumeros {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        float numero1 = scanner.nextFloat();
        System.out.println("Ingrese el segundo número: ");
        float numero2 = scanner.nextInt();
        scanner.close();

        if (numero1 > numero2) {
            System.out.println("El número " + numero1 + " es mayor que el número " + numero2);
            float sum, diferencia;
            sum = numero1 + numero2;
            System.out.println("La suma de los dos números es: " + sum);
            diferencia = numero1 - numero2;
            System.out.println("La diferencia de los dos números es: " + diferencia);
        } else if (numero1 < numero2) {
            System.out.println("El número " + numero2 + " es mayor que el número " + numero1);
            float producto, division;
            producto = numero1 * numero2;
            System.out.println("El producto de los dos números es: " + producto);
            division = numero1 / numero2;
            System.out.println("La división de los dos números es: " + division);
        } else {
            System.out.println("Los números son iguales");
        }

        scanner.close();
    }
}
