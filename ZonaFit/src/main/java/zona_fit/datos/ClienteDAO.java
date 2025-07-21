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
         System.out.println("Error al listar clientes: " + e.getMessage());
      }
      finally {
         try {
            con.close();
         }
         catch (Exception e) {
            System.out.println("Error al cerrar la conexion: " + e.getMessage());
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
         System.out.println("Error al recuperar clientes: " + e.getMessage());
      }
      finally {
         try {
            con.close();
         }
         catch (Exception e) {
            System.out.println("Error al cerrar la conexion: " + e.getMessage());
         }
      }
      return false;
   }

   @Override
   public boolean agregarCliente(Cliente cliente) {
      PreparedStatement pstm;
      Connection con = Conexion.getConexion();
      String sql = "INSERT INTO cliente(nombre, apellido, membresia) "
                 + " VALUES(?, ?, ?)";
      try {
         pstm = con.prepareStatement(sql);
         pstm.setString(1, cliente.getNombre());
         pstm.setString(2, cliente.getApellido());
         pstm.setInt(3, cliente.getMembresia());
         pstm.execute();
         return true;
      }
      catch (Exception e) {
         System.out.println("Error al agregar cliente: " + e.getMessage());
      }
      finally {
         try {
            con.close();
         }
         catch (Exception e) {
            System.out.println("Error al cerrar la conexion: " + e.getMessage());
         }
      }
      return false;
   }

   @Override
   public boolean modificarCliente(Cliente cliente) {
      PreparedStatement pstm;
      Connection con = Conexion.getConexion();
      var sql = "UPDATE cliente SET nombre=?, apellido=?, membresia=? "
              + "WHERE id = ?";
      try {
         pstm = con.prepareStatement(sql);
         pstm.setString(1, cliente.getNombre());
         pstm.setString(2, cliente.getApellido());
         pstm.setInt(3, cliente.getMembresia());
         pstm.setInt(4, cliente.getId());
         pstm.execute();
         return true;
      }
      catch (Exception e) {
         System.out.println("Error al modificar el cliente: " + e.getMessage());
      }
      finally {
         try {
            con.close();
         }
         catch (Exception e) {
            System.out.println("Error al cerrar la conexion: " + e.getMessage());
         }
      }
      return false;
   }

   @Override
   public boolean eliminarCliente(Cliente cliente) {
      PreparedStatement pstm;
      Connection con = Conexion.getConexion();
      String sql = "DELETE FROM cliente WHERE id = ?";
      try {
         pstm = con.prepareStatement(sql);
         pstm.setInt(1, cliente.getId());
         pstm.execute();
         return true;
      }
      catch (Exception e) {
         System.out.println("Error al eliminar el cliente: " + e.getMessage());
      }
      finally {
         try {
            con.close();
         }
         catch (Exception e) {
            System.out.println("Error al cerrar la conexion: " + e.getMessage());
         }
      }
      return false;
   }
}
