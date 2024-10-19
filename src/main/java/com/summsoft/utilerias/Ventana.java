package com.summsoft.utilerias;

public class Ventana {

private static boolean Personal;
private static boolean TipoBus;

    public static boolean isTipoBus() {
        return TipoBus;
    }

    public static void setTipoBus(boolean TipoBus) {
        Ventana.TipoBus = TipoBus;
    }


    public static boolean isPersonal() {
        return Personal;
    }

    public static void setPersonal(boolean Personal) {
        Ventana.Personal = Personal;
    }
    
}
