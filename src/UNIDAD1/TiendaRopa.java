package unidad1;

public class TiendaRopa {

    public static void main(String[] args) {
        // Precios originales
        float numPrecioCamiseta = 25.0f;
        float numPrecioPantalon = 30.0f;

        // Descuentos
        float numDescuentoGeneral = 0.15f;
        float numDescuentoAdicionalCamiseta = 0.05f;

        // Calcular precios después del descuento general
        float numPrecioCamisetaDescuento = numPrecioCamiseta * (1 - numDescuentoGeneral);
        float numPrecioPantalonDescuento = numPrecioPantalon * (1 - numDescuentoGeneral);

        // Calcular precio de la segunda camiseta con el descuento adicional
        float numPrecioSegundaCamisetaDescuento = numPrecioCamisetaDescuento * (1 - numDescuentoAdicionalCamiseta);

        // Calcular el precio total
        float numPrecioTotal = numPrecioCamisetaDescuento + numPrecioPantalonDescuento + numPrecioSegundaCamisetaDescuento;

        // Imprimir el resultado
        System.out.println("El precio de la camiseta después del descuento general es: $" + numPrecioCamisetaDescuento);
        System.out.println("El precio del pantalón después del descuento general es: $" + numPrecioPantalonDescuento);
        System.out.println("El precio de la segunda camiseta después del descuento adicional es: $" + numPrecioSegundaCamisetaDescuento);
        System.out.println("El precio total de las tres prendas después de aplicar los descuentos es: $" + numPrecioTotal);
    }
}
