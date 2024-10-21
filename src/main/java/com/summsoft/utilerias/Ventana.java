package com.summsoft.utilerias;

public class Ventana {

private static boolean Personal;
private static boolean TipoBus;
private static boolean Terminal;
private static boolean Rutas;

    public static boolean isRutas() {
        return Rutas;
    }

    public static void setRutas(boolean Rutas) {
        Ventana.Rutas = Rutas;
    }

    public static boolean isTerminal() {
        return Terminal;
    }

    public static void setTerminal(boolean Terminal) {
        Ventana.Terminal = Terminal;
    }

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
