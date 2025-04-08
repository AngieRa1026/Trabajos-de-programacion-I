public class LeerTexto {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();
        scanner.close();

        System.out.println("El texto ingresado es: " + texto);
        scanner.close();
    }
}
