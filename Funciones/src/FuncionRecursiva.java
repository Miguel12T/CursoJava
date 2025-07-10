public class FuncionRecursiva {
   // Imprimir 1 al 5
   public static void main(String[] args) {
     funcionRecursiva(5);
   }
   static void funcionRecursiva(int numero) {
      // Caso base
      if (numero == 1)
         System.out.print(numero + " ");
      else {
         // Caso recursivo
         funcionRecursiva(numero - 1);
         System.out.print(numero + " ");
      }
   }
}
