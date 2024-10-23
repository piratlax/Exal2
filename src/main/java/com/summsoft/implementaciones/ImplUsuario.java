package com.summsoft.implementaciones;

import com.summsoft.modelos.MdlUsuario;
import com.summsoft.utilerias.Conexion;
import com.summsoft.utilerias.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.summsoft.interfases.DaoUsuario;

public class ImplUsuario extends Conexion implements DaoUsuario {

    @Override
    public boolean registrar(MdlUsuario mdl) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean login(String user, String password) throws Exception {
       boolean acceso=false;
        this.Conectar();
        try {
            PreparedStatement st = this.conexion.prepareStatement("SELECT u.id, u.nombre, u.usuario, u.perfil, u.terminales_id, t.terminal "
                    + "FROM usuarios as u INNER JOIN terminales as t ON u.terminales_id = t.id WHERE usuario=? AND clave=? AND activo='SI'");
            st.setString(1,user);
            st.setString(2,password);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                acceso=true;
                Usuario.setNombre(rs.getString("nombre"));
                Usuario.setUsuario(rs.getString("usuario"));
                Usuario.setPerfil(rs.getString("perfil"));
                Usuario.setTerminalId(rs.getInt("terminales_id"));
                Usuario.setTerminal(rs.getString("terminal"));
                Usuario.setId(rs.getInt("id"));
                
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            System.out.println("Error "+e);
        }finally{
            this.Cerrar();
        }
        
        return acceso;
    }

    @Override
    public List listar(String nombre) throws Exception {
      List<MdlUsuario> lista=null;
        try {
           this.Conectar(); 
           String query = nombre.isEmpty() ? "SELECT * FROM usuarios" : "SELECT * FROM usuarios WHERE nombre LIKE '%"+nombre+"%'";
           PreparedStatement st = this.conexion.prepareStatement(query);
           lista = new ArrayList<>();
           ResultSet rs = st.executeQuery();
           while(rs.next()) {
              MdlUsuario mdl = new MdlUsuario();
              mdl.setId(rs.getInt("id"));
              mdl.setNombre(rs.getString("nombre"));
              mdl.setUsuario(rs.getString("usuario"));
              mdl.setClave(rs.getString("clave"));
              mdl.setPerfil(rs.getString("perfil"));
              mdl.setTelefono(rs.getString("telefono"));
              mdl.setActivo(rs.getString("activo"));
              
              lista.add(mdl);
           }
           rs.close();
           st.close();
        } catch (SQLException e) {
            System.out.println("error " + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public boolean checkUsuario(String user) throws Exception {
        boolean resultado = false;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT usuario FROM usuarios WHERE usuario=?");
            st.setString(1, user);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                resultado = true;
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            System.out.println("error " + e);
        } finally {
            this.Cerrar();
        }
        return resultado;
    }

    @Override
    public MdlUsuario getUsuarioId(int id) throws Exception {
         MdlUsuario user = new MdlUsuario();
     try {
           this.Conectar(); 
           PreparedStatement st = this.conexion.prepareStatement("SELECT id,usuario,nombre,clave,telefono FROM users WHERE id = ?");
           st.setInt(1, id);
           ResultSet rs = st.executeQuery();
           while(rs.next()) {
           
              user.setId(rs.getInt("id"));
              user.setNombre(rs.getString("nombre"));
              user.setUsuario(rs.getString("usuario"));
              user.setClave(rs.getString("Clave"));
              user.setTelefono(rs.getString("telefono"));
              
           }
           rs.close();
           st.close();
        } catch (SQLException e) {
            System.out.println("error " + e);
        } finally {
            this.Cerrar();
        }
        return user;
    }

    @Override
    public boolean actualizar(MdlUsuario mdl) throws Exception {
        boolean resultado=false;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE users set nombre=?, usuario=?, clave=?, telefono=?, perfil=? WHERE id=? ");
                    
            st.setString(1, mdl.getNombre());
            st.setString(2, mdl.getUsuario());
            st.setString(3, mdl.getClave());
            st.setString(4, mdl.getTelefono());
            st.setString(5, mdl.getPerfil());
            st.setInt(6, mdl.getId());
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            System.out.println("error " + e);
        } finally{
            this.Cerrar();
        }
        
        return resultado;
    }
    @Override
    public void desactivar(int idUsers, String activa) throws Exception {
        String cambio = activa.equals("SI") ? "NO" : "SI";
        try {
            this.Conectar();
        PreparedStatement st = this.conexion.prepareStatement("UPDATE users set activo=? WHERE id = ?");
        st.setString(1,cambio);
        st.setInt(2,idUsers);
        st.executeUpdate();
        st.close();
        } catch (SQLException e) {
            System.out.println("error "+e);
        }finally{
            this.Cerrar();
        }
    
    }
 
}
