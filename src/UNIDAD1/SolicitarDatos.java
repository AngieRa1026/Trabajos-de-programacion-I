package unidad1;

public class SolicitarDatos {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.next();
        scanner.close();

        System.out.print("Ingrese su edad: ");
        byte edad = scanner.nextByte();
        scanner.close();

        System.out.println("Ingrese su estatura: ");
        float estatura = scanner.nextFloat();
        System.out.println("Hola " + nombre + ", tienes " + edad + " años."
                + " Tu estatura es de " + estatura + " metros.");
    }
}
