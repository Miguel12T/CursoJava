import java.io.Serializable;

public class JavaBeans {
   public static void main(String[] args) {
      Persona persona = new Persona();
      persona.setApellido("Trujillo");
      persona.setNombre("Jose");
      System.out.println("Nombre = " + persona.getNombre());
      System.out.println("Apellido = " + persona.getApellido());
      System.out.println("persona: " + persona);
   }
}

class Persona implements Serializable {
   private String nombre;
   private String apellido;

   public Persona() {}

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellido() {
      return apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   @Override
   public String toString() {
      return "Persona{" +
              "nombre='" + nombre + '\'' +
              ", apellido='" + apellido + '\'' +
              '}';
   }
}
