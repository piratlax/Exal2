package com.summsoft.utilerias;

public class Usuario {

    public static int Id;
    public static String nombre;
    public static String usuario;
    public static String Perfil;
    public static int terminalId;

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

