package aritmetica;

public class Aritmetica {
   private int operando1;
   private int operando2;
   public Aritmetica(int operando1, int operando2) {
      this.operando1 = operando1;
      this.operando2 = operando2;
   }

   public int getOperando2() {
      return operando2;
   }
   public void setOperando2(int operando2) {
      this.operando2 = operando2;
   }
   public int getOperando1() {
      return operando1;
   }
   public void setOperando1(int operando1) {
      this.operando1 = operando1;
   }

   public void sumar() {
      var resultado = this.operando1 + this.operando2;
      System.out.println("Resultado suma: " + resultado);
   }
   public void resta() {
      var resultado = this.operando1 - this.operando2;
      System.out.println("Resultado resta: " + resultado);
   }
}
