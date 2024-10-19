package com.summsoft.utilerias;

public class Ventana {

private static boolean Personal;
private static boolean BusStyle;

    public static boolean isBusStyle() {
        return BusStyle;
    }

    public static void setBusStyle(boolean BusStyle) {
        Ventana.BusStyle = BusStyle;
    }

    public static boolean isPersonal() {
        return Personal;
    }

    public static void setPersonal(boolean Personal) {
        Ventana.Personal = Personal;
    }
    
}
