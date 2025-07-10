import java.net.Inet4Address;
import java.util.Scanner;

public class Matrices {
   public static void main(String[] args) {
      // Suma Diagonal de una matriz
      int renglones;
      int columnas;
      var consola = new Scanner(System.in);
      System.out.print("Proporciona los renglones: ");
      renglones = Integer.parseInt(consola.nextLine());
      System.out.print("Proporciona las columnas: ");
      columnas = Integer.parseInt(consola.nextLine());
      var matriz = new int[renglones][columnas];
      var suma = 0;
      for (int i = 0; i < renglones; i++) {
         for (int j = 0; j < columnas; j++) {
            System.out.print("Valor[" + i + "][" + j + "] = ");
            matriz[i][j] = Integer.parseInt(consola.nextLine());
            suma += i == j ? matriz[i][j] : 0;
         }
      }
      System.out.println("suma diagonal = " + suma);
   }
}
