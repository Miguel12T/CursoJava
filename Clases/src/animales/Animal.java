package animales;

public class Animal {
   protected void hacerSonido() {
      System.out.println("El animal hace un sonido");
   }
}
class Perro extends Animal {
   @Override
   protected void hacerSonido() {
      System.out.println("El perro hace wuaf");
   }
}
class Gato extends Animal {
   @Override
   protected void hacerSonido() {
      System.out.println("El gato hace miau");
   }
}
class PruebaAnimal {
   // Metodo polimorfico
   static void imprimirSonido(Animal animal) {
      animal.hacerSonido();
   }
   public static void main(String[] args) {
      // Objeto de la clase padre (Animal)
      var animal = new Animal();
      imprimirSonido(animal);
      var perro = new Perro();
      imprimirSonido(perro);
      var gato = new Gato();
      imprimirSonido(gato);
   }
}
