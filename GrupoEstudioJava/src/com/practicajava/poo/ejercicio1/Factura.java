package com.practicajava.poo.ejercicio1;

public class Factura {
    private String numero;
    private String descripcion;
    private float valor;

    private int iva;

    private String centroCosto;

    private String proveedor;


    public void escribirDatosFactura(){
        StringBuilder datos = new StringBuilder();
        datos.append(this.numero).append(" ").append(this.descripcion).append(" ").append(this.centroCosto);
        System.out.println("datos = " + datos);
    }


   public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public String getCentroCosto() {
        return centroCosto;
    }

    public void setCentroCosto(String centroCosto) {
        this.centroCosto = centroCosto;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
}
