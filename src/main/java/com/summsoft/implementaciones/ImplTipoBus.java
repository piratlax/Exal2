package com.summsoft.implementaciones;

import com.summsoft.interfases.DaoTipoBus;
import com.summsoft.modelos.MdlTipoBus;
import com.summsoft.modelos.Plantilla;
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
    public List bus(String folio) throws Exception {
        List<Plantilla> tipoBus=null;
        try {
           this.Conectar(); 
           String query = "SELECT valor, boleto FROM plantilla WHERE folio= '"+folio+"'";
           PreparedStatement st = this.conexion.prepareStatement(query);
           tipoBus = new ArrayList<>();
           ResultSet rs = st.executeQuery();
           while(rs.next()) {
              Plantilla mdl = new Plantilla();
              mdl.setValor(rs.getString("valor"));
              mdl.setBoleto(rs.getString("boleto"));
              
              
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
