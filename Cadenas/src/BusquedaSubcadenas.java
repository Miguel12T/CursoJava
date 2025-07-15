public class BusquedaSubcadenas {
   public static void main(String[] args) {
      // Buscar subcadenas
      // indexOf - Devuelve el indice de la primer aparicion de las subcadena
      var cadena1 = "Hola Mundo";
      // Subcadena a buscar "Hola"
      var indice1 = cadena1.indexOf("Hola");
      System.out.println("indice1 = " + indice1);
      //lastIndexOF - Devuelve el indice de la ultima aparicion de la subcadena
      var indice2 = cadena1.lastIndexOf("Mundo");
      System.out.println("indice2 = " + indice2);
   }
}
