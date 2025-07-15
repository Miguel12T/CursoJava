import java.util.Scanner;

public class NotasEscolares {
   public static void main(String[] args) {
      System.out.println("*** Promedio de Calificaciones ***");
      var consola = new Scanner(System.in);
      System.out.print("Cuantas califaciones deseas agrega? ");
      var cantidadCalifiaciones = Integer.parseInt(consola.nextLine());
      int[] calificaciones = new int[cantidadCalifiaciones];
      var sumaNotas = 0;
      var promedio = 0.0;
      for (int i = 0; i < cantidadCalifiaciones; i++) {
         System.out.print("Calificacion[" + i + "] = ");
         sumaNotas += Double.parseDouble(consola.nextLine());
      }
      promedio = (double) sumaNotas / cantidadCalifiaciones;
      System.out.println("Promedio de las calificaciones: " + promedio);
   }
}
