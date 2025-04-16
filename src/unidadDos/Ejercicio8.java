package unidadDos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();

        System.out.println("Introduce el nombre y la edad de cada alumno. Para terminar, introduce '*'.");

        while (true) {
            System.out.print("Nombre del alumno: ");
            String nombre = scanner.nextLine();
            if (nombre.equals("*")) {
                break;
            }

            System.out.print("Edad del alumno: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            nombres.add(nombre);
            edades.add(edad);
        }

        System.out.println("\nAlumnos mayores de edad:");
        for (int i = 0; i < edades.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.println(nombres.get(i) + " (Edad: " + edades.get(i) + ")");
            }
        }

        int mayorEdad = 0;
        for (int edad : edades) {
            if (edad > mayorEdad) {
                mayorEdad = edad;
            }
        }

        System.out.println("\nAlumnos mayores (con más edad):");
        for (int i = 0; i < edades.size(); i++) {
            if (edades.get(i) == mayorEdad) {
                System.out.println(nombres.get(i) + " (Edad: " + edades.get(i) + ")");
            }
        }

        scanner.close();
    }
}
