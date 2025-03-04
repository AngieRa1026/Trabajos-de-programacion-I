import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) throws Exception {
        //Area de un rectangulo//
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingrese ancho del rectangulo ");
        byte ancho = scanner.nextByte();
        System.out.println(" Ingrese alto del rectangulo ");
        byte alto = scanner.nextByte();
        int area = ancho * alto;

        System.out.println("El area del rectangulo es: " + area);
        
    }
}
