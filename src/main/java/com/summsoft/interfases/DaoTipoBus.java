package com.summsoft.interfases;

import com.summsoft.modelos.MdlTipoBus;

public interface DaoTipoBus {
  
    public boolean registrar(MdlTipoBus mdl) throws Exception;
    public boolean checkBus (String bus) throws Exception;
    
}
