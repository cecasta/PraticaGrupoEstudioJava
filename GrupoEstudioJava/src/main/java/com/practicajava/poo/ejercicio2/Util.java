package com.practicajava.poo.ejercicio2;

public class Util {


    public boolean isValidEmail(Correo correo){
        if(correo.getFrom() == null || !correo.getFrom().contains("@"))
            return false;
        if(correo.getTo() == null || !correo.getTo().contains("@"))
            return false;

        if(correo.getCc() != null)
            if(!correo.getCc().contains("@"))
                return false;

        return true;
    }

    public boolean validarExpresionRegular(){
        return true;
    }


}
