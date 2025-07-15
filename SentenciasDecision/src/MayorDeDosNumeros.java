import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        System.out.println("*** El mayor de 2 Numeros ***");
        var consola = new Scanner(System.in);
        System.out.print("Digite el primer numero: ");
        var numero1 = Double.parseDouble(consola.nextLine());
        System.out.print("Digite el segundo numero: ");
        var numero2 = Double.parseDouble(consola.nextLine());
        var numeroMayor = (double) numero1 > numero2 ? numero1 : numero2;
        System.out.println("El numero mayor es: " + numeroMayor);
    }
}
