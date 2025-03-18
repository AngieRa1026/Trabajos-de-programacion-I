public class LeerPalabra {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.next();
        scanner.close();

        System.out.println("La palabra ingresada es: " + palabra);
        scanner.close();
    }
}
