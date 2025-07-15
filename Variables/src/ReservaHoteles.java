public class ReservaHoteles {
   public static void main(String[] args) {
      System.out.println("*** Sistema de Reserva de Hoteles ***");
      // Detalle de la reservacion
      String nombreCliente = "Juan Miguel";
      int diasInstancia = 5;
      double tarifaDiaria = 999.99;
      boolean habitacionVistaMar = false;
      // Imprimir valores
      System.out.println("nombreCliente = " + nombreCliente);
      System.out.println("diasInstancia = " + diasInstancia);
      System.out.println("tarifaDiaria = " + tarifaDiaria);
      System.out.println("habitacionVistaMar = " + habitacionVistaMar);
      // Otro detalle
      nombreCliente = "Juan Miguel Trujillo";
      diasInstancia = 3;
      tarifaDiaria = 999.000;
      habitacionVistaMar = true;
      // Imprimir valores
      System.out.println("nombreCliente = " + nombreCliente);
      System.out.println("diasInstancia = " + diasInstancia);
      System.out.println("tarifaDiaria = " + tarifaDiaria);
      System.out.println("habitacionVistaMar = " + habitacionVistaMar);
   }
}
