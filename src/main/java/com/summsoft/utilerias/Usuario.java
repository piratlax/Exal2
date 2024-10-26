package com.summsoft.utilerias;

public class Usuario {

    public static int Id;
    public static String nombre;
    public static String usuario;
    public static String Perfil;
    public static String terminal;
    public static String abrev;
    public static int terminalId;

    public static String getAbrev() {
        return abrev;
    }

    public static void setAbrev(String abrev) {
        Usuario.abrev = abrev;
    }

    public static String getTerminal() {
        return terminal;
    }

    public static void setTerminal(String terminal) {
        Usuario.terminal = terminal;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Usuario.usuario = usuario;
    }

    public static String getPerfil() {
        return Perfil;
    }

    public static void setPerfil(String Perfil) {
        Usuario.Perfil = Perfil;
    }

    public static int getTerminalId() {
        return terminalId;
    }

    public static void setTerminalId(int terminalId) {
        Usuario.terminalId = terminalId;
    }

    public static int getId() {
        return Id;
    }

    public static void setId(int Id) {
        Usuario.Id = Id;
    }
    
    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Usuario.nombre = nombre;
    }
    
}

