package persona;

public class Persona {
   private static int contadorPersonas = 0;
   private String nombre;
   private String apellido;
   private String email;
   private String celular;
   private int idPersona;

   public Persona(String nombre,String apellido, String email, String celular) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.email = email;
      this.celular = celular;
      // Incrementar el atributo static
      this.idPersona = ++Persona.contadorPersonas;
   }
   @Override
   public  String toString() {
      return "idPersona: " + this.idPersona
              + ", Nombre: " + this.nombre
              + ", Apellido: " + this.apellido
              + ", Email: " + this.email
              + ", Celular: " + this.celular;
   }
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
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
   public String getCelular() {
      return celular;
   }
   public void setCelular(String celular) {
      this.celular = celular;
   }
   public static int getContadorPersonas() {
      return Persona.contadorPersonas;
   }
   public static void setContadorPersonas(int contadorPersonas) {
      Persona.contadorPersonas = contadorPersonas;
   }
}
