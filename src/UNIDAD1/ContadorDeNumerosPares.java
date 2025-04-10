package unidad1;

public class ContadorDeNumerosPares {

    public static void main(String[] args) {
        int contador = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " números pares entre 0 y 100");
    }
}
