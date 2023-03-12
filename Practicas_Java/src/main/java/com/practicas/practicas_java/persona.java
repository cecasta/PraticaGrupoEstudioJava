/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicas.practicas_java;

/**
 *
 * @author golol
 */
public class persona {
    String nombre ="";
    char sexo;
    int edad=0;
    int DNI; 
    double peso=0;
    double altura=0;
    int peso_ideal=-1;
    int bajo_peso=0;
    int sobre_peso=1;
    char SEXO_DEF = 'H';

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getPeso_ideal() {
        return peso_ideal;
    }

    public void setPeso_ideal(int peso_ideal) {
        this.peso_ideal = peso_ideal;
    }

    public int getBajo_peso() {
        return bajo_peso;
    }

    public void setBajo_peso(int bajo_peso) {
        this.bajo_peso = bajo_peso;
    }

    public int getSobre_peso() {
        return sobre_peso;
    }

    public void setSobre_peso(int sobre_peso) {
        this.sobre_peso = sobre_peso;
    }

    public char getSEXO_DEF() {
        return SEXO_DEF;
    }

    public void setSEXO_DEF(char SEXO_DEF) {
        this.SEXO_DEF = SEXO_DEF;
    }

    
    
    public persona() {
        
    }

    public persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public persona(String nombre, int edad, char sexo,int DNI,double peso,double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.DNI=DNI;
        this.peso=peso;
        this.altura=altura;
    }
    
    public int calcularICM(){
    
    double peso_actual=peso/(Math.pow(altura, 2));
    if (peso_actual < 20){
    return peso_ideal;
    } else if (peso_actual >= 20 && peso_actual <= 25){
    return bajo_peso;
    }else{
    return sobre_peso;
    }
  }
    
    public boolean isMayorDeEdad(){
    boolean mayor = false;
    if (edad >= 18){
     return true;
    }else {
    return mayor;
    } 
    }
  
    public void comprobarSexo(){
                //Si el sexo no es una H o una M, por defecto es H
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEF;
        }
    }
    
 @Override
 public String toString() {
            String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }
} 
