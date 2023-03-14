package com.practicajava.poo;

import com.cesar.sendmail.Mail;
import com.cesar.sendmail.SendMailImplement;

public class EnviarCorreo {

    public static void main(String[] args) {
        Mail mail = new Mail();
        SendMailImplement send = new SendMailImplement();
        mail.setTo("ccastanopratechgroup.com");
        mail.setFrom("cleal@pratechgroup.com");
        mail.setBody("Este correo prueba");

        send.send(mail);
    }
}
