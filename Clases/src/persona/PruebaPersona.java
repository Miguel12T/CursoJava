package persona;

public class PruebaPersona {
   public static void main(String[] args) {
      System.out.println("*** Creacion de Clase y Objetos Persona ***");
      System.out.println("Variable estatica: " + Persona.getContadorPersonas());
      var objeto1 = new Persona("jose", "Trujillo", "jose@email.com", "12312312");
      System.out.println(objeto1);
      System.out.println("Variable estatica: " + Persona.getContadorPersonas());
      // Segundo objeto
      var objeto2 = new Persona("jose3", "Trujillo3", "jose3@email.com", "12312312");
      System.out.println(objeto2);
      System.out.println("Variable estatica: " + Persona.getContadorPersonas());
   }
}
