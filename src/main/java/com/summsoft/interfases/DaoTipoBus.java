package com.summsoft.interfases;

import java.util.List;

public interface DaoTipoBus {
  
    public boolean registrar(List lista) throws Exception;
    public boolean checkBus (String bus) throws Exception;
    public List bus(String folio) throws Exception;
    
}
