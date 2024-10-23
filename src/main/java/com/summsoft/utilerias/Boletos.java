package com.summsoft.utilerias;

public class Boletos {

private static String folio;
private static String ruta;
private static String hora;
private static String bus;
private static String conductor;

    public static String getFolio() {
        return folio;
    }

    public static void setFolio(String folio) {
        Boletos.folio = folio;
    }

    public static String getRuta() {
        return ruta;
    }

    public static void setRuta(String ruta) {
        Boletos.ruta = ruta;
    }

    public static String getHora() {
        return hora;
    }

    public static void setHora(String hora) {
        Boletos.hora = hora;
    }

    public static String getBus() {
        return bus;
    }

    public static void setBus(String bus) {
        Boletos.bus = bus;
    }

    public static String getConductor() {
        return conductor;
    }

    public static void setConductor(String conductor) {
        Boletos.conductor = conductor;
    }

    
}
