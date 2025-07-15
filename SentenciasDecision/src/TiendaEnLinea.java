import java.util.Scanner;

public class TiendaEnLinea {
    public static void main(String[] args) {
        System.out.println("*** Tienda en Linea con Descuentos ***");
        var consola = new Scanner(System.in);
        final var MONTO_MINIMO = 1000;
        var descuento = 0.0;
        var porcentajeDescuento = 0;
        System.out.print("Cual fue el monto de tu compra? ");
        var montoCompra = Double.parseDouble(consola.nextLine());
        System.out.print("Eres miembro de la tienda (true/false)? ");
        var esMiembro = Boolean.parseBoolean(consola.nextLine());
        if (montoCompra >= MONTO_MINIMO && esMiembro) {
            porcentajeDescuento = 10;
            descuento = montoCompra * ((double) porcentajeDescuento / 100);
        }
        else if (esMiembro) {
            porcentajeDescuento = 5;
            descuento = montoCompra * ((double) porcentajeDescuento / 100);
        }
        var montoFinal = montoCompra - descuento;
        if (porcentajeDescuento > 0) {
            System.out.printf("""
                %nFelicidades, has obtenido un descuento del %d%%
                Monto de la compra: $%.2f
                Monto del descuento: $%.2f
                Monto final de la compra con descuento: $%.2f
                """, porcentajeDescuento, montoCompra, descuento, montoFinal);
        }
        else {
            System.out.printf("""
                No obtuviste ningun tipo de descuento
                Te invitamos a hacerte miembro de la tienda
                Monto final de la compra: $%.2f
                """, montoFinal);
        }
    }
}
