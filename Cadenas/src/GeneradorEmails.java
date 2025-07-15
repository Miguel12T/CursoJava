public class GeneradorEmails {
   public static void main(String[] args) {
      var nombreUsuario = " Jose Miguel Trujillo ";
      var nombreEmpresa = "Global Mentoring";
      var dominio = ".com.mx";
      var nombreEmail = nombreUsuario.strip().toLowerCase().replace(" ", ".");
      var empresaEmail = nombreEmpresa.strip().toLowerCase().replace(" ", "");
      var email = String.join("", nombreEmail, "@", empresaEmail, dominio);
      System.out.println("email = " + email);
   } 
}
