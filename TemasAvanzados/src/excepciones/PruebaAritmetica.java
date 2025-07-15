package excepciones;

public class PruebaAritmetica {
   public static void main(String[] args) {
      try {
         var resutado = Aritmetica.division(10, 0);
         System.out.println(resutado);
      }
      catch (Exception e) {
         System.out.println("Ocurrio un error: " + e);
      }
      finally {
         System.out.println("Se reviso la division");
      }
   }
}
