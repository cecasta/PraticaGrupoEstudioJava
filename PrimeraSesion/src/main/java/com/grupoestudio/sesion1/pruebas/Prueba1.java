package com.grupoestudio.sesion1.pruebas;

public class Prueba1 {
	
	String nombreCompleto;
	String telefono;
	String correo;
	String cedula;
	int edad;
	protected String clave;
	
	public Prueba1() {}
	
	public Prueba1(String nombreCompleto, int edad) {
		this.nombreCompleto = nombreCompleto;
		this.edad = edad;
		
	}
	
	
	public Prueba1(String nombreCompleto, int edad, String correo) {
		this.nombreCompleto = nombreCompleto;
		this.edad = edad;
		this.correo = correo;
		
	}
	
	
	
	public void imprimirEdad() {
		
		System.out.println(     formatearTexto(this.nombreCompleto, this.edad)    );
		
		
	}
	
	private String formatearTexto(String nombre, int edad) {
		StringBuilder mensaje = new StringBuilder();
		
		mensaje.append("NOMBRE: ");
		mensaje.append(nombre);
		mensaje.append(" ");
		mensaje.append("EDAD: ");
		mensaje.append(edad);	
		
		

		return mensaje.toString();
	}
	
	
	

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
	
	

	

	


}
