import java.util.Scanner;

public class Ejercicio4AbonarImpuesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su sueldo en dolares: ");
        float sueldo = scanner.nextFloat();
        scanner.close();

        if (sueldo > 3000) {
            System.out.println("Debe abonar impuestos");
        } else {
            System.out.println("No debe abonar impuestos");
        }
    scanner.close();
    }
}
