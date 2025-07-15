import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var saldo = 1000.00;
        var opcion = 0;
        do {
            System.out.print("""
                    \n *** Aplicacion de Cajero Automatico ***
                    Operaciones que puedes realizar:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opcion:\s""");
            opcion = Integer.parseInt(consola.nextLine());
            switch (opcion) {
                case 1 -> System.out.printf("Tu saldo actual es: $%.2f\n", saldo);
                case 2 -> {
                    System.out.print("Ingresa el monto a retirar: ");
                    var valorRetiro = Double.parseDouble(consola.nextLine());
                    if (valorRetiro > saldo)
                        System.out.printf("No cuentas con el saldo suficiente. Saldo actual es: $%.2f\n", saldo);
                    else {
                        saldo -= valorRetiro;
                        System.out.printf("Tu nuevo saldo es: $%.2f\n", saldo);
                    }
                }
                case 3 -> {
                    System.out.print("Ingresa el monto a depositar: ");
                    var valorDeposito = Double.parseDouble(consola.nextLine());
                    saldo += valorDeposito;
                    System.out.printf("Tu nuevo saldo es: $%.2f\n", saldo);
                }
                case 4 -> System.out.println("Saliendo del cajero autmatico. Hasta pronto!");
                default -> System.out.println("Opcion Invalida. Selecciona otra opcion");
            }
        } while (opcion != 4);
    }
}
