import java.util.Scanner;

public class SaludFitness {
    public static void main(String[] args) {
        System.out.println("*** Salud y Fitness ***");
        // Constantes
        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04; // Valor aproximado, son kilocalorias
        // Pedimos los valores al usuario
        var consola = new Scanner(System.in);
        System.out.print("Digite su nombre: ");
        var nombreUsuario = consola.nextLine();
        System.out.print("Digite la cantidad de pasos que camino durante el dia: ");
        var cantidadPasosDiarios = Integer.parseInt(consola.nextLine());
        var caloriasQuemadas = cantidadPasosDiarios * CALORIAS_POR_PASO;
        var metaAlcanzada = cantidadPasosDiarios >= META_PASOS_DIARIO ? "Si :)" : "No :(";
        // Mostramos la informacion
        System.out.printf("""
                %nUsuario: %s
                Pasos dados hoy: %d
                Calorias quemadas: %.2f kcal
                Meta de pasos diarios alcanzada: %s
                ------------------------------------------
                La meta de pasos diarios es de: %d pasos
                """, nombreUsuario, cantidadPasosDiarios, caloriasQuemadas, metaAlcanzada, META_PASOS_DIARIO);
    }
}
