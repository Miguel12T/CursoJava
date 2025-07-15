public class MetodosDeCadena {
   public static void main(String[] args) {
      // Metodos de cadena
      var cadena1 = "Hola Mundo";
      var longitud = cadena1.length();
      System.out.println("longitud = " + longitud);
      var nuevaCadena = cadena1.replace('o', 'a');
      System.out.println("nuevaCadena = " + nuevaCadena);
      var mayuscula = cadena1.toUpperCase();
      System.out.println("mayuscula = " + mayuscula);
      var minuscula = cadena1.toLowerCase();
      System.out.println("minuscula = " + minuscula);
      var cadenaSinEspacios = " Miguel Trujillo   ";
      System.out.println("cadenaSinEspacios = " + cadenaSinEspacios);
      System.out.println("cadenaSinEspacios = " + cadenaSinEspacios.trim());
   }
}
