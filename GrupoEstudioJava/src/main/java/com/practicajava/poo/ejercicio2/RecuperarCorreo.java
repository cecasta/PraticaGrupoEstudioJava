package com.practicajava.poo.ejercicio2;

public class RecuperarCorreo {

    private Correo correo;
    public String leer(){
        return null;
    }

    private boolean isValidEmail(){
        if(!correo.getFrom().contains("@"))
            return false;
        if(!correo.getTo().contains("@"))
            return false;
        if(!correo.getCc().contains("@"))
            return false;

        return true;
    }

    private boolean validarExpresionRegular(){
        return true;
    }
}
