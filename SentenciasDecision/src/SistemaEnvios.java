import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envios ***");
        // Definimos las tarifas de envio por kg
        final var COSTO_TARIFA_NACIONAL = 10;
        final var COSTO_TARIFA_INTERNACIONAL = 20;
        var consola = new Scanner(System.in);
        System.out.print("Digite el destino del envio (nacional/internacional): ");
        var destino = consola.nextLine().strip().toLowerCase();
        System.out.print("Digite el peso del paquete (en kg): ");
        var pesoPaquete = Double.parseDouble(consola.nextLine());
        // Calculo del envio del paquete
        Double costoPaquete = switch (destino) {
            case "nacional" -> pesoPaquete * COSTO_TARIFA_NACIONAL;
            case "internacional" -> pesoPaquete * COSTO_TARIFA_INTERNACIONAL;
            default -> {
                System.out.println("Destino invalido. Ingresa nacional/internacional");
                yield null;
            }
        };
        // Mostramos el costo de envio
        if (costoPaquete != null)
            System.out.printf("El costo del paquete es: $%.2f", costoPaquete);
    }
}
