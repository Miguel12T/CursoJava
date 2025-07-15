import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
   public static void main(String[] args) {
      System.out.println("*** Sistema Generado de ID Unico ***");
      var consola = new Scanner(System.in);
      var aleatorio = new Random();
      // Solicitamos el nombre de usuario
      System.out.print("Cual es su nombre? ");
      var nombre = consola.nextLine();
      // Solicitamos al apellido
      System.out.print("Cual es su apellido? ");
      var apellido = consola.nextLine();
      // Solicitamos el anio de nacimiento
      System.out.print("Cual es su anio de nacimiento (YYYY)? ");
      var anioNacimiento = consola.nextLine();
      // Normalizar los valores
      var nombre2 = nombre.trim().toUpperCase().substring(0, 2);
      var apellido2 = apellido.trim().toUpperCase().substring(0, 2);
      var anioNacimiento2 = anioNacimiento.trim().substring(2);
      // Generar el valor aleatorio
      var numeroAleatorio = aleatorio.nextInt(9999) + 1;
      // Formato de 4 digitos
      var numeroAleatorioFormato = String.format("%04d",  numeroAleatorio);
      // Generar el ID unico
      var idUnico = nombre2 + apellido2 + anioNacimiento2 + numeroAleatorioFormato;
      // Imprimir el ID unico
      System.out.printf("""
              %nHola %s,
              \tTu nuevo numero de identificacion (ID) generado por el sistema es:
              \t%s
              \t!Felicidades!
              """, nombre, idUnico);
   }
}
