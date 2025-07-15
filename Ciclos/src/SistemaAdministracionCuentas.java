import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var opcion = 0;
        do {
           System.out.println("""
                   \n*** Sistema de Administracion de Cuentas ***
                   Menu:
                   1. Crear cuenta
                   2. Eliminar cuenta
                   3. Salir
                   """);
            System.out.print("Escoje una opcion: ");
            opcion = Integer.parseInt(consola.nextLine());
            var accion = switch(opcion) {
                case 1 -> "Creando tu cuenta...";
                case 2 -> "Eliminado tu cuenta...";
                case 3 -> "Saliendo del sistema. Hasta pronto! \n\nSaliendo Sistema de Administracion de Cuentas";
                default -> "Opcion invalida...";
            };
            System.out.println(accion);
        } while (opcion != 3);
    }
}
