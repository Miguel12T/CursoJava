public class ReglasNombresVariables {
   public static void main(String[] args) {
      // Reglas nombres variables
      String nombreCompleto = "Jose Miguel"; // Buenas practicas
      System.out.println("nombreCompleto = " + nombreCompleto);
      String nombre_clientre = "Jose"; // Correcto, Malas practicas
      String _apellido = "Trujillo"; // Correcto y aceptable
      String $apellido = "Trujillo"; // Correcto y aceptable
      int totPzs = 10; // Correcta, no aplica buenas practicas
      int totalPiezas = 10; // Correcta, aplica buenas practicas
      boolean casado = true; // Correcto, aun puede mejorar
      boolean esCasado = true; // Correcto, aplica buenas practicas
      boolean isCasado = true; // Correcto, aplica buenas practicas
      boolean hasSaldo = true; // Correcto, aplica buenas practicas
   }
}
