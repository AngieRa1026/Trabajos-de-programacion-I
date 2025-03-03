import java.util.Scanner;

public class Sumar10alnumero {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        byte numero = scanner.nextByte();
        int resultado = numero + 10;
        System.out.println("El resultado es: " + resultado);
    }
}
