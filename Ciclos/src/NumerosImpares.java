public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("*** Numeros Impares");
        var contador = 1;
        do {
            if (contador % 2 != 0)
                System.out.print(contador + " ");
            contador++;
        } while (contador <= 20);
    }
}
