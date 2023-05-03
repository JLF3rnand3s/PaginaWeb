package model;

import java.util.Date;

public class Suscriptor extends Usuario{
	
	
	//atributos
	public Date fechaCad;
	
	//constructor
	public Suscriptor(String id, String nombre, String apellido, String email, int puntuacion) {
		super(id, nombre, apellido, email, puntuacion);
		// TODO Auto-generated constructor stub
	}

	//gettrs y setters
	public Date getFechaCad() {
		return fechaCad;
	}

	public void setFechaCad(Date fechaCad) {
		this.fechaCad = fechaCad;
	}

	
}
