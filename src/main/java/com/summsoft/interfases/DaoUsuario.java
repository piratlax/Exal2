package com.summsoft.interfases;

import com.summsoft.modelos.MdlUsuario;
import java.util.List;

public interface DaoUsuario {

public boolean registrar(MdlUsuario mdl) throws Exception;
    public boolean login(String user, String password) throws Exception;
    public boolean checkUsuario(String user) throws Exception;
    public boolean actualizar(MdlUsuario mdl) throws Exception;
    public void desactivar(int id, String activa) throws Exception;
    public List listar(String nombre) throws Exception;
    public MdlUsuario getUsuarioId(int id) throws Exception;    
}
