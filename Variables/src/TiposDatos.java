public class TiposDatos {
   public static void main(String[] args) {
      // Tipos de datos en java
      // Enteros (Valor por defecto es 0)
      byte tipoByte = 127;
      System.out.println("tipoByte = " + tipoByte); // (soutv) Agrega la variable junto al valor
      short tipoShort = 32000;
      System.out.println("tipoShort = " + tipoShort);
      int tipoInt = 2147483647;
      System.out.println("tipoInt = " + tipoInt);
      long tipoLong = 987654321123654125L; // (L) se agrega la lentra (L) para poder permitir el limite maximo de longitud
      // Punto flotante // (Valor por defecto 0.0)
      float tipoFloat = 3.14F; // F o f para indicar tipo float
      System.out.println("tipoFloat = " + tipoFloat);
      double tipoDouble = 3.1456D; // D o d para indicar tipo double
      System.out.println("tipoDouble = " + tipoDouble);
      // Caracter (Valor por defecto '\u0000')
      char tipoChar = 'A'; // Caracteres del juego unicode;
      System.out.println("tipoChar = " + tipoChar);
      tipoChar = 65;
      System.out.println("tipoChar = " + tipoChar);
      // Booleano (Valor por defecto false)
      boolean tipoBoolean = true;
      System.out.println("tipoBoolean = " + tipoBoolean);
      tipoBoolean = false;
      System.out.println("tipoBoolean = " + tipoBoolean);

   }
}
