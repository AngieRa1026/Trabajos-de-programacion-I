
import java.util.Scanner;

public class FactorialDeUnNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }
        System.out.println("El factorial de " + n + " es " + factorial);
        }
    }

