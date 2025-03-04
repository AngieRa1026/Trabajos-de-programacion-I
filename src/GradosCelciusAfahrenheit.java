
import java.util.Scanner;

public class GradosCelciusAfahrenheit {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa los grados celsius");
        byte celsius = scanner.nextByte();
        scanner.close();
        float fahrenheit = (byte) (celsius * 9/5 + 32);

        System.out.println(celsius + " grados celsius son " + fahrenheit + " grados fahrenheit");
    }
}