package unidad1;

public class CuentaBancaria {

    //definir constantes utilizando static final para definirla//
    private static final int SALDO_INICIAL = 1000;
    private static final int RETIRO_SEMANAL = 200;
    private static final byte SEMANAS_EN_UN_MES = 4;

    public static void main(String[] args) {
        int saldoFinal = SALDO_INICIAL - RETIRO_SEMANAL * SEMANAS_EN_UN_MES;
        System.out.println("El saldo final es: " + saldoFinal);

    }
}
