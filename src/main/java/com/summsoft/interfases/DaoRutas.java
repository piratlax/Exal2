package com.summsoft.interfases;

import java.util.List;

public interface DaoRutas {
    
    public List lista(String nombre) throws Exception;
    public boolean checarRepetido(String Origen, String Destino) throws Exception;
    public boolean registrar(String Origen, String Destino) throws Exception;
    public boolean actualizar(String Origen, String Destino, int id) throws Exception;
    public void desactivar(int id, String activa) throws Exception;
}
