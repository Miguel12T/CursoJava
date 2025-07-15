package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
   public static void main(String[] args) {
      maquinaSnacks();
   }
   public static void maquinaSnacks() {
      var salir = false;
      var consola = new Scanner(System.in);
      // Creamos la lista de productos de tipo snack
      List<Snack> productos = new ArrayList<>();
      System.out.println("*** Maquina de Snacks ***");
      Snacks.mostrarSnacks();
      while (!salir) {
         try {
            var opcion = mostrarMenu(consola);
            salir = ejecutarOpciones(opcion, consola, productos);
         }
         catch (RuntimeException e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
         }
         finally {
            System.out.println(); // Imprime un salto de linea con cada iteracion
         }
      }
   }
   private static int mostrarMenu(Scanner consola) {
      System.out.println("""
              Menu:
              1. Comprar snack
              2. Mostrar ticket
              3. Agregar Nuevo Snack
              4. Salir
              Elije una opcion:\s""");
      // Leemos y retornamos la opcion seleccionada
      return Integer.parseInt(consola.nextLine());
   }

   private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos) {
      var salir = false;
      switch (opcion) {
         case 1 -> comprarSnack(consola, productos);
         case 2 -> mostrarTicket(productos);
         case 3 -> agregarSnack(consola);
         case 4 -> {
            System.out.println("Regresa pronto!");
            salir = true;
         }
         default -> System.out.println("Opcion invalida: " + opcion);
      }
      return salir;
   }

   private static void comprarSnack(Scanner consola, List<Snack> productos) {
      System.out.print("Que snack quiere comprar (id)? ");
      var idSnack = Integer.parseInt(consola.nextLine());
      // Valida que el snack exista en la lista de snacks
      var snackEncontrado = false;
      for (var snack : Snacks.getSnacks()) {
         if (idSnack == snack.getIdSnack()) {
            // Agregamos el snack a la lista de productos
            productos.add(snack);
            System.out.println("Ok, Snack agregado: " + snack);
            snackEncontrado = true;
            break;
         }
      }
      if (!snackEncontrado)
         System.out.println("Id de snack no encontrado: " + idSnack);
   }

   private static void mostrarTicket(List<Snack> productos) {
      var ticket = "*** Ticket de Venta ***";
      var total = 0.0;
      for (var produto : productos) {
         ticket += "\n\t- " + produto.getNombre() + " - $" + produto.getPrecio();
         total  += produto.getPrecio();
      }
      ticket += "\n\tTotal -> $ " + total;
      System.out.println(ticket);
   }

   private static void agregarSnack(Scanner consola) {
      System.out.print("Nombre del snack: ");
      var nombre = consola.nextLine();
      System.out.print("Precio del snack: ");
      var precio = Double.parseDouble(consola.nextLine());
      Snacks.agregarSnack(new Snack(nombre, precio));
      System.out.println("Tu snack se ha agregado correctamente");
      Snacks.mostrarSnacks();
   }
}

