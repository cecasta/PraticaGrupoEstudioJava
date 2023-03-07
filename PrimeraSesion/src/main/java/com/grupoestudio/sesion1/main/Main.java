package com.grupoestudio.sesion1.main;

//import com.grupoestudio.sesion1.pruebas.Prueba1;
import com.grupoestudio.sesion1.pruebas.operaciones;
public class Main {

	public static void main(String[] args) {
//		Prueba1 objPrueba1 = new Prueba1("Pedro Mario", 35);
//		
//		objPrueba1.imprimirEdad();	
//		
//		objPrueba1.setNombreCompleto("Carlos Giovanny Leal");
//		objPrueba1.setEdad(43);
//		
//		objPrueba1.imprimirEdad();
		

                operaciones objmultiplicar = new operaciones(3,4);
                float resultado= objmultiplicar.multiplicar();
                System.out.print("el resultado de la multiplicacion es: " + resultado);
		
	}
}
