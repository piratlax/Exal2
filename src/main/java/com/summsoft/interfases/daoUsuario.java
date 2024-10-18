package com.summsoft.interfases;

import com.summsoft.modelos.mdlUsuario;

public interface daoUsuario {

    public boolean registrar(mdlUsuario mdl) throws Exception;
    public boolean login(String user, String password) throws Exception;
}
