package com.grupoestudio.sesion1.pruebas;

public class Evento {
	
	String nombre;
	String codigo;
	String tipo;
	String descripcion;
	int    duracionEnMinutos;
	String estadoEvento;


	public Evento() {}
	
	public Evento(String nombre, String codigo, String Tipo) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.tipo = tipo;
	}

	public Evento(String nombre, String codigo, String Tipo, String descripcion) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.tipo = tipo;
		this.descripcion =descripcion;
	}

	public Evento(String nombre, String codigo, String tipo, String descripcion, int duracionEnMinutos) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.tipo = tipo;
		this.descripcion =descripcion;
		this.duracionEnMinutos= duracionEnMinutos;
	}

	public void verEvento() {

		String mensaje = String.format("Evento: %s \n Tipo: %s \n codigo: %s \n Duración: %d", this.nombre, this.tipo, this.codigo, this.duracionEnMinutos);
		System.out.println(mensaje);
	}

	public void cancelarEvento(String codigo){
		this.codigo= codigo;
		this.estadoEvento = "CANCELADO";
		String mensaje = String.format("\n El Evento con código: %s  ha sido cancelado", this.codigo);
		System.out.println(mensaje);
	}

	public void modificarEvento(String nombre, String codigo, String tipo, String descripcion, int duracionEnMinutos ){

		this.nombre= nombre;
		this.codigo= codigo;
		this.tipo = tipo;
		this.descripcion = descripcion;
		this.duracionEnMinutos= duracionEnMinutos;

		String mensaje = String.format("\n El Evento con código: %s  ha sido modificado", this.codigo);
		System.out.println(mensaje);

	}
}
