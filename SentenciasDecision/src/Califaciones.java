import java.util.Scanner;

public class Califaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de calificaciones ***");
        var consola = new Scanner(System.in);
        System.out.print("Digita la calificacion numerica entre (0 y 10): ");
        var calificacion = Double.parseDouble(consola.nextLine());
        var letraCalificacion = "";
        if (calificacion >= 9 && calificacion <= 10)
            letraCalificacion = "A";
        else if (calificacion >= 8 && calificacion <= 9)
            letraCalificacion = "B";
        else if (calificacion >= 7 && calificacion <= 8)
            letraCalificacion = "C";
        else if (calificacion >= 6 && calificacion <= 7)
            letraCalificacion = "D";
        else if (calificacion >= 0 && calificacion <= 6)
            letraCalificacion = "F";
        else
            letraCalificacion = "Valor Desconocido";
        System.out.printf("Calificacion %.1f es equivalente a %s", calificacion, letraCalificacion);
    }
}
