package com.summsoft.interfases;

import com.summsoft.modelos.MdlTerminal;
import java.util.List;

public interface DaoTerminales {

public List listar(String nombre) throws Exception;
public boolean checarRepetido(String nombre, String Abrev) throws Exception;
public boolean registrar(MdlTerminal mdl) throws Exception;
public MdlTerminal getTerminalId(int id) throws Exception;    
public boolean actualizar(MdlTerminal mdl) throws Exception;    
public void desactivar(int id, String activa) throws Exception;    
}
