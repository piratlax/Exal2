package com.summsoft.implementaciones;

import com.summsoft.interfases.DaoTerminales;
import com.summsoft.modelos.MdlTerminal;
import com.summsoft.utilerias.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImplTerminal extends Conexion implements DaoTerminales {

    @Override
    public List listar(String nombre) throws Exception {
     List<MdlTerminal> lista=null;
        try {
           this.Conectar(); 
           String query = nombre.isEmpty() ? "SELECT * FROM terminales" : "SELECT * FROM terminales WHERE terminal LIKE '%"+nombre+"%'";
           
           PreparedStatement st = this.conexion.prepareStatement(query);
           lista = new ArrayList<>();
           ResultSet rs = st.executeQuery();
           while(rs.next()) {
              MdlTerminal mdl = new MdlTerminal();
              mdl.setId(rs.getInt("id"));
              mdl.setNombre(rs.getString("terminal"));
              mdl.setDireccion(rs.getString("direccion"));
              mdl.setTelefono(rs.getString("telefono"));
              mdl.setTipo(rs.getString("tipo"));
              mdl.setAbrev(rs.getString("abrev"));
              mdl.setActivo(rs.getString("activa"));
              
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
    public boolean checarRepetido(String nombre, String Abrev) throws Exception {
        boolean resultado = false;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT nombre,abrev FROM terminales WHERE nombre=? OR abrev=?");
            st.setString(1, nombre);
            st.setString(2, Abrev);
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
    public boolean registrar(MdlTerminal mdl) throws Exception {
        boolean resultado=false;
       try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO terminales (terminal, tipo, direccion, telefono, abrev) "
                    + "VALUES (?,?,?,?,?)");
            st.setString(1, mdl.getNombre());
            st.setString(2, mdl.getTipo());
            st.setString(3, mdl.getDireccion());
            st.setString(4, mdl.getTelefono());
            st.setString(5, mdl.getAbrev());
            
            // Verificar el número de filas afectadas
            int filasAfectadas = st.executeUpdate();
            if (filasAfectadas > 0) {
                resultado = true;
            }
            st.close();
        } catch (SQLException e) {
            System.out.println("error " + e);
        } finally {
            this.Cerrar();
        }
       
       return resultado;
    }

    @Override
    public MdlTerminal getTerminalId(int id) throws Exception {
        MdlTerminal mdl = new MdlTerminal();
     try {
           this.Conectar(); 
           PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM terminales WHERE id = ?");
           st.setInt(1, id);
           ResultSet rs = st.executeQuery();
           while(rs.next()) {
           
              
                mdl.setId(rs.getInt("id"));
                mdl.setNombre(rs.getString("terminal"));
                mdl.setDireccion(rs.getString("direccion"));
                mdl.setTelefono(rs.getString("telefono"));
                mdl.setTipo(rs.getString("tipo"));
                mdl.setAbrev(rs.getString("abrev"));
           }
           rs.close();
           st.close();
        } catch (SQLException e) {
            System.out.println("error " + e);
        } finally {
            this.Cerrar();
        }
        return mdl;
    }

    @Override
    public boolean actualizar(MdlTerminal mdl) throws Exception {
        boolean resultado=false;
        try {
            this.Conectar();
            
            PreparedStatement st = this.conexion.prepareStatement("UPDATE terminales SET terminal=?, tipo=?, direccion=?, telefono=?, abrev=? WHERE id=?");
                    
            st.setString(1, mdl.getNombre());
            st.setString(2, mdl.getTipo());
            st.setString(3, mdl.getDireccion());
            st.setString(4, mdl.getTelefono());
            st.setString(5, mdl.getAbrev());
            st.setInt(6, mdl.getId());
            
            
            // Verificar el número de filas afectadas
            int filasAfectadas = st.executeUpdate();
            if (filasAfectadas > 0) {
                resultado = true;
            }
            st.close();
        } catch (SQLException e) {
            System.out.println("error " + e);
        } finally{
            this.Cerrar();
        }
        
        return resultado;
    }

    @Override
    public void desactivar(int id, String activa) throws Exception {
        String cambio = activa.equals("SI") ? "NO" : "SI";
        try {
            this.Conectar();
        PreparedStatement st = this.conexion.prepareStatement("UPDATE terminales set activa=? WHERE id = ?");
        st.setString(1,cambio);
        st.setInt(2,id);
        st.executeUpdate();
        st.close();
        } catch (SQLException e) {
            System.out.println("error "+e);
        }finally{
            this.Cerrar();
        }
    }
    
}
