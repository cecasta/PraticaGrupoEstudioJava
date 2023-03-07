/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupoestudio.sesion1.pruebas;

/**
 *
 * @author golol
 */
public class operaciones {
    
    private float num1;
    private float num2;
    private float resultado;
    
    public operaciones(float num1, float num2) {
        this.num1=num1;
        this.num2=num2;
    }
    
   public float multiplicar (){
      this.resultado=num1*num2;
      return resultado; 
   }
   
       public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
   
   
}
