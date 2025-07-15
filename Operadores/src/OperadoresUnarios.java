public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = -2, resultado;
        // Operadores unario +
        resultado = +a;
        System.out.println("resultado +a = " + resultado);
        // Operador unarios -
        resultado = -a;
        System.out.println("resultado -a = " + resultado);
        // Operadores unarios incremento/decremento
        // Pre-incremento
        a = 3;
        resultado = ++a; // Primero se incrementa el valor
        System.out.println("resultado ++a = " + resultado);
        // Post-incremento
        a = 3;
        resultado = a++; // Primero se usa el valor y despues se incrementa
        System.out.println("resultado a++ = " + resultado);
        System.out.println("a se incrementa = " + a);
        // Pre-decremento
        b = -2;
        resultado = --b; // Primero se decrementa y despues se usa el valor
        System.out.println("resultado --b = " + resultado);
        // Post-decremento
        b = -2;
        resultado = b--; // Primero de usa el valor, y despues se decrementa
        System.out.println("resultado b-- = " + resultado);
        System.out.println("b se decrementa = " + b);
    }
}
