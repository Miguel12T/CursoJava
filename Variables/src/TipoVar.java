public class TipoVar {
   public static void main(String[] args) {
      System.out.println("*** Uso de var en Java ***");
      // Sin uso de var
      String nombre1= "juan";
      System.out.println("nombre1 = " + nombre1);
      // Con el uso de var
      var nombre2 = "Carlos";
      System.out.println("nombre2 = " + nombre2);
      var edad = 30;
      System.out.println("edad = " + edad);
      var sueldo = 500.5F; // Se infiere tipo float
      System.out.println("sueldo = " + sueldo);
      var esCasado = false; // Se infiere tipo boolean
      esCasado = true;
      // esCasado = "No"; No podemos asignar un tipo distinto

   }
}
