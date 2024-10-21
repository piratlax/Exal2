package com.summsoft.implementaciones;

import com.summsoft.interfases.DaoRutas;
import com.summsoft.modelos.MdlRutas;
import com.summsoft.utilerias.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImplRutas extends Conexion implements DaoRutas {

    @Override
    public List lista(String nombre) throws Exception {
        List<MdlRutas> lista=null;
        try {
           this.Conectar(); 
           String query = nombre.isEmpty() ? "SELECT r.id, CONCAT(o.abrev,'-',d.abrev) as nombre, o.terminal as origen, d.terminal as destino, r.activa FROM rutas as r INNER JOIN terminales as o ON r.idorigen = o.id INNER JOIN terminales as d ON  r.iddestino = d.id"
                   : "SELECT CONCAT(o.abrev,'-',d.abrev) as nombre, o.terminal as origen, d.terminal as destino, r.activa FROM rutas as r INNER JOIN terminales as o ON r.idorigen = o.id INNER JOIN terminales as d ON  r.iddestino = d.id WHERE o.terminal LIKE '%"+nombre+"%' OR d.terminal LIKE '%"+nombre+"%'";
           PreparedStatement st = this.conexion.prepareStatement(query);
           lista = new ArrayList<>();
           ResultSet rs = st.executeQuery();
           while(rs.next()) {
              MdlRutas mdl = new MdlRutas();
              mdl.setId(rs.getInt("id"));
              mdl.setNombre(rs.getString("nombre"));
              mdl.setOrigen(rs.getString("origen"));
              mdl.setDestino(rs.getString("destino"));
              mdl.setActiva(rs.getString("activa"));
              
              
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
    public boolean checarRepetido(String Origen, String Destino) throws Exception {
       boolean resultado = false;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT o.terminal, d.terminal FROM rutas "
                    + "INNER JOIN terminales as o ON rutas.idorigen=o.id INNER JOIN terminales as d ON rutas.iddestino=d.id WHERE o.terminal AND d.terminal=?");
            st.setString(1, Origen);
            st.setString(2, Destino);
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
    public boolean registrar(String Origen, String Destino) throws Exception {
        boolean resultado=false;
       try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO rutas(idorigen, iddestino) "
                    + "VALUES ((SELECT id FROM terminales WHERE terminal = ?), (SELECT id FROM terminales WHERE terminal = ?))");
            st.setString(1, Origen);
            st.setString(2, Destino);
            
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
    public boolean actualizar(String Origen, String Destino, int id) throws Exception {
         boolean resultado=false;
       try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE rutas SET idorigen=(SELECT id FROM terminales WHERE terminal = ?), "
                    + "iddestino=(SELECT id FROM terminales WHERE terminal = ?) WHERE rutas.id = ? ");
            st.setString(1, Origen);
            st.setString(2, Destino);
            st.setInt(3, id);
            
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
    public void desactivar(int id, String activa) throws Exception {
        String cambio = activa.equals("SI") ? "NO" : "SI";
        try {
            this.Conectar();
        PreparedStatement st = this.conexion.prepareStatement("UPDATE rutas set activa=? WHERE id = ?");
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
