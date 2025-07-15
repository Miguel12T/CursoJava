import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticacion ***");
        final var USUARIO_VALIDO = "admin";
        final var PASSWORD_VALIDO = "123";
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu usuario: ");
        var usuario = consola.nextLine().strip();
        System.out.print("Ingresa tu password: ");
        var password = consola.nextLine().strip();
        // Cada caso de validacion de usuario y password
        var mensajeAutenticacion = switch (usuario) {
            case USUARIO_VALIDO -> {
                if (PASSWORD_VALIDO.equals(password))
                    yield "Bienvenido al Sistema";
                else
                    yield "Password incorrecto, favor corrigelo!";
            }
            default -> {
                if (PASSWORD_VALIDO.equals(password))
                    yield "Usuario incorrecto, favor corregirlo!";
                else
                    yield  "Usuario y password incorrectos, favor de corregirlos";
            }
        };
        System.out.println(mensajeAutenticacion);
    }
}
