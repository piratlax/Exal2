package com.summsoft.interfases;

import com.summsoft.modelos.mdlUsuario;
import java.util.List;

public interface daoUsuario {

    public boolean registrar(mdlUsuario mdl) throws Exception;
    public boolean login(String user, String password) throws Exception;
    public boolean checkUsuario(String user) throws Exception;
    public boolean actualizar(mdlUsuario mdl) throws Exception;
    public void desactivar(int id, String activa) throws Exception;
    public List listar(String nombre) throws Exception;
    public mdlUsuario getUsuarioId(int id) throws Exception;
    
}
