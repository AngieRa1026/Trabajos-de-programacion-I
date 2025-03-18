
import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menú interactivo");
        System.out.println("1. Sumar dos números");
        System.out.println("2. Restar dos números");  
        System.out.println("3. Multiplicar dos números");
        System.out.println("4. Dividir dos números");
        System.out.println("5. Salir");

        System.out.println("Ingrese una opción: ");
        int opcion = scanner.nextInt();
        scanner.close();

        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La suma es " + (num1 + num2));
                break;
            case 2:
                System.out.println("La resta es " + (num1 - num2));
                break;
            case 3:
                System.out.println("La multiplicación es " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("La división es " + (num1 / num2));
                } else {
                    System.out.println("No se puede dividir por cero");
                }
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}
