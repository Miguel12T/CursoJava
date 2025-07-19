package zona_fit.datos;

import zona_fit.conexion.Conexion;
import zona_fit.dominio.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClienteDAO{
   @Override
   public List<Cliente> listarClientes() {
      List<Cliente> clientes = new ArrayList<>();
      PreparedStatement pstm;
      ResultSet rs;
      Connection con = Conexion.getConexion();
      var sql = "SELECT * FROM cliente ORDER BY id";
      try {
         pstm = con.prepareStatement(sql);
         rs = pstm.executeQuery();
         while (rs.next()) {
            var cliente = new Cliente();
            cliente.setId(rs.getInt("id"));
            cliente.setNombre(rs.getString("nombre"));
            cliente.setApellido(rs.getString("apellido"));
            cliente.setMembresia(rs.getInt("membresia"));
            clientes.add(cliente);
         }
      }
      catch (Exception e) {
         System.out.println("Error al listar clientes: " + e);
      }
      finally {
         try {
            con.close();
         }
         catch (Exception e) {
            System.out.println("Error al cerrar la conexion: " + e);
         }
      }
      return clientes;
   }

   @Override
   public boolean buscarClientePorId(Cliente cliente) {
      PreparedStatement pstm;
      ResultSet rs;
      Connection con = Conexion.getConexion();
      var sql = "SELECT * FROM cliente WHERE id = ?";
      try {
         pstm = con.prepareStatement(sql);
         pstm.setInt(1, cliente.getId());
         rs = pstm.executeQuery();
         if (rs.next()) {
            cliente.setNombre(rs.getString("nombre"));
            cliente.setApellido(rs.getString("apellido"));
            cliente.setMembresia(rs.getInt("membresia"));
            return true;
         }
      }
      catch (Exception e) {
         System.out.println("Error al recuperar clientes: " + e);
      }
      finally {
         try {
            con.close();
         }
         catch (Exception e) {
            System.out.println("Error al cerrar la conexion: " + e);
         }
      }
      return false;
   }

   @Override
   public boolean agregarCliente(Cliente cliente) {
      return false;
   }

   @Override
   public boolean modificarCliente(Cliente cliente) {
      return false;
   }

   @Override
   public boolean eliminarCliente(Cliente cliente) {
      return false;
   }

   public static void main(String[] args) {
      IClienteDAO clienteDAO = new ClienteDAO();
      // Listar clientes
      // System.out.println("*** Listar Clientes ***");
      // var clientes = clienteDAO.listarClientes();
      // clientes.forEach(System.out::println);

      // Buscar por id
      var cliente1 = new Cliente(3);
      System.out.println("Cliente antes de la busqueda: " + cliente1);
      var encontrado = clienteDAO.buscarClientePorId(cliente1);
      if (encontrado)
         System.out.println("Cliente encontrado: " + cliente1);
      else
         System.out.println("No se encontro cliente: " + cliente1.getId());
   }
}
