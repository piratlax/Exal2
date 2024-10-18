package com.summsoft.implementaciones;

import com.summsoft.interfases.daoUsuario;
import com.summsoft.modelos.mdlUsuario;
import com.summsoft.utilerias.Conexion;
import com.summsoft.utilerias.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class implUsuario extends Conexion implements daoUsuario {

    @Override
    public boolean registrar(mdlUsuario mdl) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean login(String user, String password) throws Exception {
       boolean acceso=false;
        this.Conectar();
        try {
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM usuarios WHERE usuario=? AND clave=? AND activo='SI'");
            st.setString(1,user);
            st.setString(2,password);
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                acceso=true;
                Usuario.setNombre(rs.getString("nombre"));
                Usuario.setUsuario(rs.getString("usuario"));
                Usuario.setPerfil(rs.getString("perfil"));
                Usuario.setTerminalId(rs.getInt("terminales_id"));
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
    
}
