import java.util.HashMap;
import java.util.Map;

public class Mapa {
   public static void main(String[] args) {
      Map<String, String> persona = new HashMap<>();
      persona.put("nombre", "Jose");
      persona.put("apellido", "Trujillo");
      persona.put("edad", "23");
      System.out.println("Valores del mapa: ");
      persona.entrySet().forEach(System.out::println);

      // Iterar sobres los elementos por separado
      System.out.println("\nIterando los elementos (llave, valor)");
      persona.forEach((llave, valor) -> {
         System.out.println("llave: " + llave + ", valor: " + valor);
      });
   }
}
