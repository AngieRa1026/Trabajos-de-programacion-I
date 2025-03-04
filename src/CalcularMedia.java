public class CalcularMedia {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese la primera nota: ");
        float nota1 = scanner.nextFloat();
        System.out.print("Ingrese la segunda nota: ");
        float nota2 = scanner.nextFloat();
        System.out.print("Ingrese la tercera nota: ");
        float nota3 = scanner.nextFloat();
        float media = (nota1 + nota2 + nota3) / 3;
        System.out.println("La media de las notas es: " + media);
    }
}
