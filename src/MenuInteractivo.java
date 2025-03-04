
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

        System.out.println("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int b = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La suma es " + (a + b));
                break;
            case 2:
                System.out.println("La resta es " + (a - b));
                break;
            case 3:
                System.out.println("La multiplicación es " + (a * b));
                break;
            case 4:
                System.out.println("La división es " + (a / b));
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
