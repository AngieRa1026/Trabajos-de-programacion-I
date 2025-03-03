public class CuentaBancaria {
    //definir constantes utilizando static final para definirla, son valores que no cambian 
    //durante la ejecución del programa
    private static final int SALDO_INICIAL = 1000;
    private static final int RETIRO_SEMANAL = 200;
    private static final byte SEMANAS_EN_UN_MES = 4;

//definir el método main, llamando calcularSaldoFinal y pasando los valores de las constantes 
//como argumentos; el resultado se almacena en la variable saldoFinal y se imprime en consola
    public static void main(String[] args) {
        int saldoFinal = calcularSaldoFinal(SALDO_INICIAL, RETIRO_SEMANAL, SEMANAS_EN_UN_MES);
        System.out.println("El saldo final en la cuenta bancaria después de un mes es: $" + saldoFinal);
    }

    public static int calcularSaldoFinal(int saldoInicial, int retiroSemanal, byte semanas) {
        return saldoInicial - (retiroSemanal * semanas);
    }
}
