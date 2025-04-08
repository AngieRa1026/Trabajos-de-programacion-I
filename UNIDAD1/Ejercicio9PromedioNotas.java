import java.util.Scanner;

public class Ejercicio9PromedioNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota 1: ");
        int nota1 = scanner.nextInt();
        System.out.println("Ingrese la nota 2: ");
        int nota2 = scanner.nextInt();
        System.out.println("Ingrese la nota 3: ");
        int nota3 = scanner.nextInt();
        scanner.close();

        int promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio de las notas es: " + promedio);
        if (promedio >= 7) {
            System.out.println("Promocionado");
        } else if (promedio >= 4 && promedio < 7) {
            System.out.println("Regular");
        } if (promedio < 4) {
            System.out.println("Reprobado");
        }    else {
        }
    scanner.close();
    }
}

