import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hotel ***");
        final var TARIFA_DIARIA_SIN_VISTA_MAR = 150.50;
        final var TARIFA_DIARIA_CON_VISTA_MAR = 190.50;
        var consola = new Scanner(System.in);
        System.out.print("Nombre del Cliente: ");
        var nombreCliente = consola.nextLine();
        System.out.print("Digite los dias de estadia en el hotel: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());
        System.out.print("Desea el cuarto con vista al mar (true/false)? ");
        var cuartoVistaMar = Boolean.parseBoolean(consola.nextLine());
        // Calculo de costo total de la estadia
        var costoEstadia = cuartoVistaMar ? diasEstadia * TARIFA_DIARIA_CON_VISTA_MAR : diasEstadia * TARIFA_DIARIA_SIN_VISTA_MAR;
        var vistaMar = cuartoVistaMar ? "Si :)" : "No :(";
        System.out.printf("""
                %n--------------- Detalles de la Reservacion ----------------
                Cliente: %s
                Dias de estadia: %d
                costo total: $%.2f
                Habitacion con vista al mar: %s
                """, nombreCliente, diasEstadia, costoEstadia, vistaMar);
    }
}
