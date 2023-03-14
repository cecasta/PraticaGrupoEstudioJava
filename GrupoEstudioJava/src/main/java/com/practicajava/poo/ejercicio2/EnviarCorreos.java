package com.practicajava.poo.ejercicio2;

public class EnviarCorreos {
    
    private Correo correo;


    EnviarCorreos(Correo correo){
        this.correo = correo;
    }

    
    public void enviar(){
        if(correo.isValidEmail()) {
            StringBuilder datosCorreo = new StringBuilder();
            datosCorreo.append("Correo enviado ").append(correo.getFrom());
            System.out.println("datosCorreo = " + datosCorreo);
        }else{
            System.out.println("correo invalido");
        }
    }

    public void enviarCorreoCCO(){
        if(correo.isValidEmail()) {
            StringBuilder datosCorreo = new StringBuilder();
            datosCorreo.append("Correo enviado ").append(correo.getFrom());
            System.out.println("datosCorreo = " + datosCorreo);
        }else{
            System.out.println("correo invalido");
        }
    }


    
    public void enviarCorreoAdjunto(){}
    
    

    
}
