package unidadDos;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numArticulos = 5;
        int numSucursales = 4;

        double[] precios = new double[numArticulos];
        int[][] ventas = new int[numArticulos][numSucursales];

        System.out.println("Ingrese los precios de los 5 articulos:");
        for (int i = 0; i < numArticulos; i++) {
            System.out.print("Precio del articulo " + (i + 1) + ": ");
            precios[i] = scanner.nextDouble();
        }

        System.out.println("\nIngrese las cantidades vendidas en cada sucursal:");
        for (int i = 0; i < numArticulos; i++) {
            System.out.println("Articulo " + (i + 1) + ":");
            for (int j = 0; j < numSucursales; j++) {
                System.out.print("Sucursal " + (j + 1) + ": ");
                ventas[i][j] = scanner.nextInt();
            }
        }

        int[] totalArticulos = new int[numArticulos];
        for (int i = 0; i < numArticulos; i++) {
            for (int j = 0; j < numSucursales; j++) {
                totalArticulos[i] += ventas[i][j];
            }
        }

        int totalSucursal2 = 0;
        for (int i = 0; i < numArticulos; i++) {
            totalSucursal2 += ventas[i][1];
        }

        int cantidadArticulo3Sucursal1 = ventas[2][0];

        double[] recaudacionSucursal = new double[numSucursales];
        for (int j = 0; j < numSucursales; j++) {
            for (int i = 0; i < numArticulos; i++) {
                recaudacionSucursal[j] += ventas[i][j] * precios[i];
            }
        }

        double recaudacionTotalEmpresa = 0;
        for (double recaudacion : recaudacionSucursal) {
            recaudacionTotalEmpresa += recaudacion;
        }

        int sucursalMayor = 0;
        for (int j = 1; j < numSucursales; j++) {
            if (recaudacionSucursal[j] > recaudacionSucursal[sucursalMayor]) {
                sucursalMayor = j;
            }
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < numArticulos; i++) {
            System.out.println("Total vendido del articulo " + (i + 1) + ": " + totalArticulos[i]);
        }
        System.out.println("Cantidad total de articulos vendidos en sucursal 2: " + totalSucursal2);
        System.out.println("Cantidad del articulo 3 en la sucursal 1: " + cantidadArticulo3Sucursal1);
        for (int j = 0; j < numSucursales; j++) {
            System.out.println("Recaudacion total de sucursal " + (j + 1) + ": $" + recaudacionSucursal[j]);
        }
        System.out.println("Recaudacion total de la empresa: $" + recaudacionTotalEmpresa);
        System.out.println("Sucursal de mayor recaudacion: Sucursal " + (sucursalMayor + 1));

        scanner.close();
    }
}
