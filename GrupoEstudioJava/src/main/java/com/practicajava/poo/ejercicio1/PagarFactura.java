package com.practicajava.poo.ejercicio1;

public class PagarFactura {
    Factura factura;

    PagarFactura(Factura factura){
        this.factura = factura;
    }


    public void pagar(){
        System.out.println("Factura pagada: "+ factura.getValor());
    }


    public float obtenerIVA(){
        return calcularIVA();
    }

    private float calcularIVA(){
        return factura.getValor() * factura.getIva();
    }
}
