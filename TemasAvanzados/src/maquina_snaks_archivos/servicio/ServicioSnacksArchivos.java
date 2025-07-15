package maquina_snaks_archivos.servicio;

import maquina_snaks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks{
   private final String NOMBRE_ARCHIVO = "snaks.txt";
   // Crear la lista de snacks
   private List<Snack> snacks = new ArrayList<>();
   // Constructor clase
   public ServicioSnacksArchivos() {
      // Creamos el archivo si no existe
      var archivo = new File(this.NOMBRE_ARCHIVO);
      var existe = false;
      try {
         existe = archivo.exists();
         if (existe)
           this.snacks = obtenerSnacks();
         else {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close(); // Guarda el archivo en disco
            System.out.println("Se ha creado el archivo");
         }
      }
      catch (Exception e) {
         System.out.println("Error al crear el archivo: " + e.getMessage());
      }
      // Si no existe, cargamos algunos snacks
      if (!existe)
         cargarSnacksIniciales();
   }

   private void cargarSnacksIniciales() {
      this.agregarSnack(new Snack("Papas", 70));
      this.agregarSnack(new Snack("Refresco", 50));
      this.agregarSnack(new Snack("Hamburguesa", 120));
   }

   private List<Snack> obtenerSnacks() {
      var snacks = new ArrayList<Snack>();
      try {
         List<String> lineas = Files.readAllLines(Paths.get(this.NOMBRE_ARCHIVO));
         for (String linea : lineas) {
            String[] lineaSnack = linea.split(",");
            var idSnack         = lineaSnack[0];
            var nombre          = lineaSnack[1];
            var precio          = Double.parseDouble(lineaSnack[2]);
            var snack           = new Snack(nombre, precio);
            snacks.add(snack); // Agregamos el snack leido de la lista
         }
      }
      catch (Exception e) {
         System.out.println("Error al leer archivo de snacks: " + e.getMessage());
      }
      return snacks;
   }

   @Override
   public void agregarSnack(Snack snak) {
      // Agregamos el nuevo snack,
      // 1. A la lista en memoria
      this.snacks.add(snak);
      // 2. Guardamos el nuevo snack en el archivo
      this.agregarSnackArchivo(snak);
   }

   private void agregarSnackArchivo(Snack snack) {
      boolean anexar = false;
      var archivo = new File(this.NOMBRE_ARCHIVO);
      try {
         anexar = archivo.exists();
         var salida = new PrintWriter(new FileWriter(archivo, anexar));
         salida.println(snack.escribirSnack());
         salida.close();
      }
      catch (Exception e) {
         System.out.println("Error al agregar snack: " + e.getMessage());
      }
   }

   @Override
   public void mostrarSnacks() {
      System.out.println("--- Snacks en el inventario ---");
      // Mostramos la lista de snacks en el archivo
      var inventarioSnacks = "";
      for (var snack : this.snacks)
         inventarioSnacks += snack.toString() + "\n";
      System.out.println(inventarioSnacks);
   }

   @Override
   public List<Snack> getSnacks() {
      return this.snacks;
   }
}
