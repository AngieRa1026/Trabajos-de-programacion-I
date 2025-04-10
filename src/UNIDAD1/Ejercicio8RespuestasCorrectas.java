package unidad1;

import java.util.Scanner;

public class Ejercicio8RespuestasCorrectas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de respuestas correctas: ");
        int respuestasCorrectas = scanner.nextInt();
        System.out.println("Ingrese la cantidad de respuestas incorrectas: ");
        int respuestasIncorrectas = scanner.nextInt();
        scanner.close();

        int totalRespuestas = respuestasCorrectas + respuestasIncorrectas;
        float porcentajeRespuestasCorrectas = (float) respuestasCorrectas / totalRespuestas * 100;

        if (porcentajeRespuestasCorrectas >= 90) {
            System.out.println("Nivel máximo");
        } else if (porcentajeRespuestasCorrectas >= 75 && porcentajeRespuestasCorrectas < 90) {
            System.out.println("Nivel medio");
        } else if (porcentajeRespuestasCorrectas >= 50 && porcentajeRespuestasCorrectas < 75) {
            System.out.println("Nivel regular");
        }
        if (porcentajeRespuestasCorrectas < 50) {
            System.out.println("Fuera de nivel");
        } else {
        }
        scanner.close();
    }
}
