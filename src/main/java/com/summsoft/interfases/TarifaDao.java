package com.summsoft.interfases;

import java.util.List;

public interface TarifaDao {
    public List tarifas(String ruta) throws Exception;
    public List destinos(String ruta) throws Exception;
}
