import java.util.Scanner;

public class RecetaCocina {
   public static void main(String[] args) {
      System.out.println("*** Recetas de Cocina");
      var consola = new Scanner(System.in);
      // Nombre de la receta
      System.out.print("Ingrese el nombre: ");
      var nombreReceta = consola.nextLine();
      // Ingredientes de la receta
      System.out.print("Ingrese los ingredientes: ");
      var ingredientesReceta = consola.nextLine();
      // Tiempo de preparacion
      System.out.print("Ingrese el tiempo de preaparacion (min): ");
      var tiempoPreparacionReceta = Integer.parseInt(consola.nextLine());
      // Dificultad de la receta
      System.out.print("Ingrese la dificultad (Facil/Medio/Dificil): ");
      var dificultadReceta = consola.nextLine();
      System.out.println("\n--- Receta de Cocina ---");
      System.out.println("\tNombre de la receta: " + nombreReceta);
      System.out.println("\tIngredientes: " + ingredientesReceta);
      System.out.println("\tTiempo de preparacion: " + tiempoPreparacionReceta + " minutos");
      System.out.println("\tDificultad: " + dificultadReceta);
   }
}
