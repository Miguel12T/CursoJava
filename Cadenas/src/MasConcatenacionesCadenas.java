public class MasConcatenacionesCadenas {
   public static void main(String[] args) {
      // Mas formas de concatenar cadenas en Java
      var cadena1 = "Hola";
      var cadena2 = "Mundo";
      var cadena3 = cadena1 + " " + cadena2;
      // Metodo concat
      cadena3 = cadena1.concat(" ").concat("Mundo");
      System.out.println("cadena3 = " + cadena3);
      // StringBuilder
      var stringBuilder = new StringBuilder();
      stringBuilder.append(cadena1);
      stringBuilder.append(" ");
      stringBuilder.append(cadena2);
      var resultado = stringBuilder.toString();
      System.out.println("stringBuilder = " + resultado);
      // StringBuffer
      var stringBuffer = new StringBuffer();
      stringBuffer.append(cadena1).append(" ").append(cadena2);
      resultado = stringBuffer.toString();
      System.out.println("stringBuffer = " + resultado);
      // join
      resultado = String.join(" ", cadena1, cadena2);
      System.out.println("join = " + resultado);
   }
}
