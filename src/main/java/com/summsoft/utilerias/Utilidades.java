package com.summsoft.utilerias;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utilidades {

    public static String encryptPassword(String password) {
        try {
            // Creación de la instancia del algoritmo SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Procesamos el string de la contraseña
            byte[] hash = md.digest(password.getBytes());

            // Convertimos el hash en un string hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }

            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error encriptando la contraseña: " + e.getMessage());
            return null;
        }
    }

}
