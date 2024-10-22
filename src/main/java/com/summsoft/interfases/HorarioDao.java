package com.summsoft.interfases;

import java.util.List;

public interface HorarioDao {

    public List rutas() throws Exception;
    public List conductor() throws Exception;
    public List bus() throws Exception;
    public boolean registrar(String ruta, String Conductor, String Bus, String hora) throws Exception;
    public List lista(String buscar) throws Exception;
    
}