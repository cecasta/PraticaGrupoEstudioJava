package com.practicajava.poo.ejercicio1;

public class MainPagoFactura {

    public static void main(String[] args) {
        // Pagar facturas
        FacturaPagar facturaPagar = new FacturaPagar();
        PagarFactura pagarFactura = new PagarFactura(facturaPagar);
        ImprimirFactura imprimir = new ImprimirFactura(facturaPagar);

        facturaPagar.setNumero("FACT-1234");
        facturaPagar.setDescripcion("Pago de servicios publicos");
        facturaPagar.setValor(850000);
        facturaPagar.setIva(19);
        facturaPagar.setDescuento(15000);
        facturaPagar.setCentroCosto("COS12312312");
        facturaPagar.setEquipoAprobador("Mercadeo");
        facturaPagar.escribirDatosFactura();

        pagarFactura.pagar();
        System.out.println("IVA = " + pagarFactura.obtenerIVA());
        imprimir.imprimir();

        // cobrar facturas
        FacturaCobrar facturaCobrar = new FacturaCobrar();
        PagarFactura pagarFacturaCobrar = new PagarFactura(facturaCobrar);
        facturaCobrar.setNumero("FACT-7777");
        facturaCobrar.setDescripcion("Cobro de factura");
        facturaCobrar.setValor(888850000);
        facturaCobrar.setIva(19);
        facturaCobrar.setCentroCosto("POP1231232");
        pagarFacturaCobrar.pagar();
        facturaCobrar.escribirDatosFactura();





    }
}
