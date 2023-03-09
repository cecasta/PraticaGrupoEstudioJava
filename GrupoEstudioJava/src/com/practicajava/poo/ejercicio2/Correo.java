package com.practicajava.poo.ejercicio2;

public class Correo {

    private String from;
    private String to;
    private String body;

    private String cc;


    public boolean isValidEmail(){
        if(this.from == null || !this.from.contains("@"))
            return false;
        if(this.to == null || !this.to.contains("@"))
            return false;

        if(this.cc != null)
            if(!this.cc.contains("@"))
                return false;

        return true;

    }

    public boolean validarExpresionRegular(){
        return true;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
}
