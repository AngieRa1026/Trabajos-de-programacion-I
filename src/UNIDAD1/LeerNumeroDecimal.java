package unidad1;

public class LeerNumeroDecimal {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        double numero = scanner.nextDouble();
        scanner.close();

        System.out.println("El número ingresado es: " + numero);
        scanner.close();
    }
}
