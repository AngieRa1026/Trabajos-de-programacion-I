import java.util.Scanner;

public class Ejercicio2PromedioNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primera nota: ");
        float nota1 = scanner.nextFloat();
        System.out.println("Ingrese la segunda nota: ");
        float nota2 = scanner.nextFloat();
        System.out.println("Ingrese la tercera nota: ");
        float nota3 = scanner.nextFloat();
        scanner.close();

        float promedio = (nota1 + nota2 + nota3) / 3;
        if (promedio >= 7) {
            System.out.println("El promedio de las notas es: " + promedio + " Promocionado ");       
        } else {
            System.out.println("El promedio de las notas es: " + promedio + " Reprobado ");
        }
    scanner.close();    
    }
    
}

