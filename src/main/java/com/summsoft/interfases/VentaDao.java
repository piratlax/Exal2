
package com.summsoft.interfases;

import java.util.List;

public interface VentaDao {

    public List tarifas(String ruta) throws Exception;
    public List destinos(String ruta) throws Exception;
    
}
