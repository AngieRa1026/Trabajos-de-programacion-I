package unidad1;

public class LeerNumeroEntero {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        scanner.close();

        System.out.println("El número ingresado es: " + numero);
        scanner.close();
    }
}
