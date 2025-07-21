package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.Scanner;

public class AppZonaFit {
   public static void main(String[] args) {
      zonaFit();
   }
   public static void zonaFit() {
      var salir              = false;
      var consola            = new Scanner(System.in);
      IClienteDAO clienteDAO = new ClienteDAO();
      System.out.println("*** App Zona Fit ***");
      while (!salir) {
         try {
            var opcion = menu(consola);
            salir = ejecutarOpciones(opcion, consola, clienteDAO);
         }
         catch (Exception e) {
            System.out.println();
         }
      }
   }
   public static int menu(Scanner consola) {
      System.out.println("""
              Menu:
              1. Listar
              2. Buscar cliente por Id
              3. Agregar
              4. Modificar
              5. Eliminar
              6. Salir
              Elige una opcion:\s""");
      return Integer.parseInt(consola.nextLine());
   }
   public static boolean ejecutarOpciones(int opcion, Scanner consola, IClienteDAO clienteDAO) {
      var salir = false;
      switch (opcion) {
         case 1 -> listarClientes(clienteDAO);
         case 2 -> buscarClientePorId(consola, clienteDAO);
         case 3 -> AgregarClientes(consola, clienteDAO);
         case 4 -> ModificarClientes(consola, clienteDAO);
         case 5 -> EliminarClientes(consola, clienteDAO);
         case 6 -> {
            System.out.println("Regresa pronto!");
            salir = true;
         }
         default -> System.out.println("La opcion " + opcion + " no existe en el menu, vuelve a digitar otra");
      };
      return salir;
   }
   public static void listarClientes(IClienteDAO clienteDAO) {
      var clientes = clienteDAO.listarClientes();
      System.out.println("*** Listado de clientes *** ");
      clientes.forEach(System.out::println);
   }

   public static void buscarClientePorId(Scanner consola, IClienteDAO clienteDAO) {
      System.out.print("Digite el id del cliente: ");
      var idCliente         = Integer.parseInt(consola.nextLine());
      var cliente           = new Cliente(idCliente);
      var clienteEncontrado = clienteDAO.buscarClientePorId(cliente);
      if (clienteEncontrado)
         System.out.println(cliente);
      else
         System.out.println("No se encontro el cliente por el id: " + idCliente);
   }

   public static void AgregarClientes(Scanner consola, IClienteDAO clienteDAO) {
      System.out.print("Digite el nombre del cliente: ");
      var nombre = consola.nextLine();
      System.out.print("Digite el apellido del cliente: ");
      var apellido = consola.nextLine();
      System.out.print("Digite la membresia del cliente: ");
      var membresia       = Integer.parseInt(consola.nextLine());
      var cliente         = new Cliente(nombre, apellido, membresia);
      var clienteAgregado = clienteDAO.agregarCliente(cliente);
      if (clienteAgregado) {
         System.out.println("Se agrego correctamente el cliente: " + cliente);
         listarClientes(clienteDAO);
      }
      else
         System.out.println("No se agrego correctamente el cliente");
   }

   public static void ModificarClientes(Scanner consola, IClienteDAO clienteDAO) {
      System.out.print("Digite el id del cliente que desea modificar: ");
      var idCliente = Integer.parseInt(consola.nextLine());
      var cliente   = new Cliente(idCliente);
      clienteDAO.buscarClientePorId(cliente);
      System.out.println("\n*** Datos del Cliente ***");
      System.out.println(cliente);
      System.out.print("\nDigite el nombre del cliente: ");
      var nombre = consola.nextLine();
      System.out.print("Digite el apellido del cliente: ");
      var apellido = consola.nextLine();
      System.out.print("Digite la membresia del cliente: ");
      var membresia = Integer.parseInt(consola.nextLine());
      cliente.setNombre(nombre);
      cliente.setApellido(apellido);
      cliente.setMembresia(membresia);
      var clienteModificado = clienteDAO.modificarCliente(cliente);
      if (clienteModificado) {
         System.out.println("Se ha modificado el cliente");
         listarClientes(clienteDAO);
      }
      else
         System.out.println("No se ha podido modificar el cliente");
   }

   public static void EliminarClientes(Scanner consola, IClienteDAO clienteDAO) {
      System.out.print("Digite el id del cliente que desea eliminar: ");
      var idCliente = Integer.parseInt(consola.nextLine());
      var cliente = new Cliente(idCliente);
      var clienteEliminado = clienteDAO.eliminarCliente(cliente);
      if (clienteEliminado) {
         System.out.println("Cliente eliminado correctamente");
         listarClientes(clienteDAO);
      }
      else
         System.out.println("El cliente no se ha podido eliminar");
   }
}
