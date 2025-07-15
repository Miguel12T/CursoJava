import java.util.Scanner;

public class IdentificarEstacion {
    public static void main(String[] args) {
        System.out.println("*** Estacion del Año");
        var consola = new Scanner(System.in);
        System.out.print("Digita el numero del mes: ");
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = switch (mes) {
            case 1, 2, 12 -> "La estacion del mes " + mes + " es Invierno";
            case 3, 4, 5 -> "La estacion del mes " + mes + " es Primavera";
            case 6, 7, 8 -> "La estacion del mes " + mes + " es Verano";
            case 9, 10, 11 -> "La estacion del mes " + mes + " es Otoño";
            default -> "Estacion desconocida";
        };
        System.out.println(estacion);
    }
}
