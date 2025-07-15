import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticacion ***");
        final var USER = "admin";
        final var PASS = "123";
        var consola = new Scanner(System.in);
        System.out.print("Cual es tu usuario? ");
        var usuario = consola.nextLine();
        System.out.print("Cual es tu password? ");
        var password = consola.nextLine();
        var validarDatos = USER.equals(usuario) && PASS.equals(password);
        System.out.println("Datos son correctos? " + validarDatos);
    }
}
