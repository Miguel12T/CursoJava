public class IndicesCadena {
   public static void main(String[] args) {
      // Manejo de indices en una cadena
      var cadena1 = "Hola Mundo";
      // Obtener el primer caracter
      var primerCaracter = cadena1.charAt(0);
      System.out.println("primerCaracter = " + primerCaracter);
      // Obtener el ultimo caracter (en la posicion 9)
      var ultimoCaracter = cadena1.charAt(9);
      System.out.println("ultimoCaracter = " + ultimoCaracter);
      // Obtine el caracter 'M'
      var caracterM = cadena1.charAt(5);
      System.out.println("caracterM = " + caracterM);
   }
}
