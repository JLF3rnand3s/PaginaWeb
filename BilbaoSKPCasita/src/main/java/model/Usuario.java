package model;

public class Usuario {

	//atributos
	public String nombre, apellido,usuario , email;
	public int puntuacion;
	
	//constructor
	public Usuario(String nombre, String apellido, String usuario, String email, int puntuacion) {
		super();
		this.puntuacion = puntuacion;
		this.usuario = usuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}


	//getters y setters


	public String getNombre() {
		return nombre;
	}


	public int getPuntuacion() {
		return puntuacion;
	}


	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	
	
	
}
