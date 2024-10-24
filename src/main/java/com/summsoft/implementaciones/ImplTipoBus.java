package com.summsoft.implementaciones;

import com.summsoft.interfases.DaoTipoBus;
import com.summsoft.modelos.Bus;
import com.summsoft.modelos.MdlTipoBus;
import com.summsoft.utilerias.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImplTipoBus extends Conexion implements DaoTipoBus{

    @Override
public boolean registrar(List lista) throws Exception {
        boolean resultado = false;

        try {
            // Conectar a la base de datos
            this.Conectar();

            
            List<MdlTipoBus> modelos = lista;

            for (MdlTipoBus mdl : modelos) {
            
                // Preparar la declaración SQL
                String sql = "INSERT INTO tipos_bus (tipo, valor) VALUES (?, ?)";
                PreparedStatement st = this.conexion.prepareStatement(sql);
                st.setString(1, mdl.getTipo());  // Asegúrate de que getTipo() devuelve un String
                st.setString(2, mdl.getValor()); // Asegúrate de que getValor() devuelve un String (ajusta el tipo si es necesario)

                // Ejecutar la sentencia SQL para cada objeto
                int filasAfectadas = st.executeUpdate();

                // Si al menos una fila fue afectada, marcar el resultado como exitoso
                if (filasAfectadas > 0) {
                    resultado = true;
                }

                // Cerrar el PreparedStatement después de usarlo
                st.close();
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Cerrar la conexión a la base de datos
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

    @Override
    public List bus(String tipo) throws Exception {
        List<MdlTipoBus> tipoBus=null;
        try {
           this.Conectar(); 
           String query = "SELECT valor FROM tipos_bus WHERE tipo = (SELECT tipo FROM autobuses WHERE numero = '"+tipo+"')";
           PreparedStatement st = this.conexion.prepareStatement(query);
           tipoBus = new ArrayList<>();
           ResultSet rs = st.executeQuery();
           while(rs.next()) {
              MdlTipoBus mdl = new MdlTipoBus();
              mdl.setValor(rs.getString("valor"));
              
              
              tipoBus.add(mdl);
           }
           rs.close();
           st.close();
        } catch (SQLException e) {
            System.out.println("error " + e);
        } finally {
            this.Cerrar();
        }
        return tipoBus;
    }
    
}
