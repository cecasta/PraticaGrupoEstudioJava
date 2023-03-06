package com.grupoestudio.sesion1.ejercicio1;

public class Ejercicioj {

	String marca;
	String serial;
	String tipo;
	int cantidad;
	int precio;

	public Ejercicioj() {
		super();
	}

	public Ejercicioj(String marca, String serial, String tipo, int precio, int cantidad) {
		super();
		this.marca = marca;
		this.serial = serial;
		this.tipo = tipo;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	
	
	public void imprimirCotizacion() {
		
		System.out.println(     formatearTexto(this.marca, this.serial, this.tipo, this.cantidad, this.precio)    );
		
		
	}
	
	private String formatearTexto(String marca, String serial, String tipo, int cantidad, int precio) {
		StringBuilder mensaje = new StringBuilder();
		
		mensaje.append("MARCA:    ");
		mensaje.append(marca);
		mensaje.append("\n");
		mensaje.append("TIPO:     ");
		mensaje.append(tipo);
		mensaje.append("\n");
		mensaje.append("SERIAL #: ");
		mensaje.append(serial);
		mensaje.append(" \n");
		mensaje.append("CANTIDAD: ");
		mensaje.append(cantidad);
		mensaje.append(" \n");
		mensaje.append("PRECIO:   $");
		mensaje.append(precio);
		
		
		return mensaje.toString();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
	
	
	
}
