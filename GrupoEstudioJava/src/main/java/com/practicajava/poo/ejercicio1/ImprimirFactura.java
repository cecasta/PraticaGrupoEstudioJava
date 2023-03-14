package com.practicajava.poo.ejercicio1;

public class ImprimirFactura {

    Factura factura;

    ImprimirFactura(Factura factura){
        this.factura = factura;
    }

    ImprimirFactura(){}

    public void imprimir(){
        StringBuilder datos = new StringBuilder();
        datos.append("Numero factura ");
        datos.append(factura.getNumero());
        datos.append(" ").append("Valor: ").append(factura.getValor());

        System.out.println("datos factura ");
        System.out.println(datos);
    }
}
