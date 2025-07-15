public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("*** Suma Acumulativa ***");
        var i = 1;
        var acumulador = 0;
        while (i <= 5) {
            acumulador += i;
            System.out.println(acumulador);
            i++;
        }
    }
}
