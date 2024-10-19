package com.summsoft.implementaciones;

import com.summsoft.interfases.DaoTipoBus;
import com.summsoft.modelos.MdlTipoBus;
import com.summsoft.utilerias.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ImplTipoBus extends Conexion implements DaoTipoBus{

    @Override
    public boolean registrar(MdlTipoBus mdl) throws Exception {
   boolean resultado=false;
       try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO tipos_bus (tipo, fila, col1, col2, "
                    + "col3, col4, col5) VALUES (?,?,?,?,?,?,?)");
            st.setString(1, mdl.getTipo());
            st.setInt(2, mdl.getFila());
            st.setString(3, mdl.getCol1());
            st.setString(4, mdl.getCol2());
            st.setString(5, mdl.getCol3());
            st.setString(6, mdl.getCol4());
            st.setString(7, mdl.getCol5());
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
    public boolean checkBus(String bus) throws Exception {
        boolean resultado = false;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT tipo FROM tipos_bus WHERE tipo=?");
            st.setString(1, bus);
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
        return resultado;}
    
}
