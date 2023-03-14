package com.practicajava.poo.ejercicio1;

public class FacturaPagar  extends Factura{

    private float descuento;
    private String equipoAprobador;

    public void escribirDatosFactura(){
        StringBuilder datos = new StringBuilder();
        datos.append(this.getNumero()).append(" ").append(this.getDescripcion()).append(" ").append(this.getCentroCosto())
                .append(" ").append(this.getDescuento());
        System.out.println("datos = " + datos);
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public String getEquipoAprobador() {
        return equipoAprobador;
    }

    public void setEquipoAprobador(String equipoAprobador) {
        this.equipoAprobador = equipoAprobador;
    }
}
