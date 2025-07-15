import java.util.Scanner;

public class LeerTiposDatos {
   public static void main(String[] args) {
      // Leer tipos de datos numericos
      // Enteros
      var scanner = new Scanner(System.in);
      System.out.print("Digite su edad: ");
      var edad = scanner.nextInt();
      System.out.println("edad = " + edad);
      // Decimales
      System.out.print("Ingrese su altura: ");
      var altura = scanner.nextDouble();
      System.out.println("altura = " + altura);
      // Consumimos el caracter de salto de linea antes de usar el tipo de dato string, debido a que los tipos de datos numericos generan un salto de linea
      scanner.nextLine();
      // String
      System.out.print("Ingrese su nombre: ");
      var nombre = scanner.nextLine();
      System.out.println("nombre = " + nombre);
      // Conversion de datos
      System.out.print("Proporciona un valor entero: ");
      var entero = Integer.parseInt(scanner.nextLine());
      System.out.println("entero = " + entero);
      // Tipo flotante
      System.out.print("Proporciona un valor flotante: ");
      var flotante = Float.parseFloat(scanner.nextLine());
      System.out.println("flotante = " + flotante);
   }
}
