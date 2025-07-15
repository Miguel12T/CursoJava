import java.util.Random;

public class NumerosAleatorios {
   public static void main(String[] args) {
      System.out.println("*** Numeros Aleatorios ***");
      var random = new Random();
      // Genera un numero aleatorio entre 0 y 9
      var numeroAletorio = random.nextInt(10);
      System.out.println("numeroAleatorio entre 0 y 9 = " + numeroAletorio);
      // Genera un numero aleatorio entre 1 y 10
      numeroAletorio = random.nextInt(10) + 1;
      System.out.println("numeroAletorio entre 1 y 10 = " + numeroAletorio);
      // Genera un numero flotante entre 0.0 y  1.0
      var flotanteAletorio = random.nextFloat();
      System.out.println("flotanteAletorio = " + flotanteAletorio);
      // Simular el lanzamiento de un dado (1 y 6)
      var dato = random.nextInt(6) + 1;
      System.out.println("Resultado de lanzar el dado = " + dato);
   }
}
