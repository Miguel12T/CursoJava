import java.util.Scanner;

public class AreaPerimetroRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Area y Perimetro de un Rectangulo");
        var consola = new Scanner(System.in);
        System.out.print("Digita la base del rectangulo: ");
        var base = Double.parseDouble(consola.nextLine());
        System.out.print("Digita la altura del rectangulo: ");
        var altura = Double.parseDouble(consola.nextLine());
        var area = base * altura;
        var perimetro = 2 * (base + altura);
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro de rectangulo es: " + perimetro);
    }
}
