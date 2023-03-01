package com.grupoestudio.sesion1.main;

import com.grupoestudio.sesion1.pruebas.Evento;

public class Main {

	public static void main(String[] args) {
		Evento objEvento = new Evento("Charla DEvOps","DEV01","Educativa", "DevOps para ppiantes", 60);

		objEvento.verEvento();

		objEvento.modificarEvento("Charla DEvOps","DEV01","Educativa", "DevOps para ppiantes", 80);

		objEvento.verEvento();

		objEvento.cancelarEvento("DEV01");

	}
}
