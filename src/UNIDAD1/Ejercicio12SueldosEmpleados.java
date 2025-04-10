package unidad1;

import java.util.Scanner;

public class Ejercicio12SueldosEmpleados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sueldoBajo = 0;
        int sueldoAlto = 0;
        double totalSueldos = 0;

        System.out.println("Ingrese la cantidad de empleados");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el sueldo de los empleados " + (i + 1) + ": ");
            int sueldo = scanner.nextInt();

            if (sueldo >= 300) {
                sueldoBajo++;
            } else {

                if (sueldo < 300) {
                    sueldoAlto++;
                }
            }
            totalSueldos += sueldo;
        }

        System.out.println("La cantidad de empleados que ganan mas de 300 son: " + sueldoBajo);
        System.out.println("La cantidad de empleados que ganan menos de 300 son: " + sueldoAlto);
        System.out.println("El total de sueldos es: " + totalSueldos);

        scanner.close();
    }
}
