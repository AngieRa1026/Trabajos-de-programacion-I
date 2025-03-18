import java.util.Scanner;

public class Ejercicio10SueldoEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el sueldo del empleado: ");
        double sueldo = scanner.nextDouble();
        
        System.out.println("Ingrese los años de antigüedad del empleado: ");
        int antiguedad = scanner.nextInt();
        scanner.close();

        if (sueldo < 0 || antiguedad < 0) {
            System.out.println("El sueldo y la antigüedad deben ser mayores a 0");
            return;
        }

        if (sueldo < 500 && antiguedad >= 10) {
            System.out.println("El sueldo del empleado es: " + (sueldo + sueldo * 0.20));
        } else if (sueldo < 500 && antiguedad < 10) {
            System.out.println("El sueldo del empleado es: " + (sueldo + sueldo * 0.05));
        } else if (sueldo >= 500) {
            System.out.println("El sueldo del empleado es: " + sueldo);
        }
    scanner.close();    
    }
}


