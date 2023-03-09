package com.practicajava.poo.ejercicio2;

public class Main {

    public static void main(String[] args) {
        Correo correo = new Correo();
        EnviarCorreos enviarCorreos = new EnviarCorreos(correo);
        correo.setFrom("ccastano@pratechgroup.com");
        correo.setTo("jlondonogmail.com");
        correo.setBody("Correo de prueba");

        enviarCorreos.enviar();




    }


}
