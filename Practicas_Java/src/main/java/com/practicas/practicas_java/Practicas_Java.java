/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.practicas.practicas_java;

/**
 *
 * @author golol
 */
public class Practicas_Java {

    public static void main(String[] args) {
       
        persona persona1 = new persona();

        
        //Los datos que no esten completos los insertamos con los metodos set
        persona1.setNombre("Laura");
        persona1.setEdad(30);
        persona1.setSexo('M');
        persona1.setPeso(60);
        persona1.setAltura(1.60);
 
        
        persona1.calcularICM();
        System.out.print("la persona : " + persona1);
        
    }
}
