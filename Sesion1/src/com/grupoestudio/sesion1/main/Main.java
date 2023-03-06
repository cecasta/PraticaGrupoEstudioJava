package com.grupoestudio.sesion1.main;

import com.grupoestudio.sesion1.pruebas.Prueba1;
import com.grupoestudio.sesion1.ejercicio1.Ejercicioj;

public class Main {

	public static void main(String[] args) {
		//Prueba1 objPrueba1 = new Prueba1("Pedro Leon", 35);
		Ejercicioj objEjercicioj = new Ejercicioj();
		
		//objPrueba1.imprimirEdad();	
		
		//objPrueba1.setNombreCompleto("Carlos Giovanny Leal");
		//objPrueba1.setEdad(43);
		
		//objPrueba1.imprimirEdad();
		
		
		objEjercicioj.setMarca("HP");
		objEjercicioj.setTipo("LAPTOP");
		objEjercicioj.setSerial("ACG123456");
		objEjercicioj.setCantidad(2);
		objEjercicioj.setPrecio(6000000);
		
		objEjercicioj.imprimirCotizacion();
	}
}
