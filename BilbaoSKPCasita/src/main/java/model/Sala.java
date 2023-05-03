package model;

public class Sala {

	//atriburos
	public String dificultad, nombre, codigo;

	//constructor
	public Sala(String dificultad, String nombre, String codigo) {
		super();
		this.dificultad = dificultad;
		this.nombre = nombre;
		this.codigo = codigo;
	}

	//getters y setters
	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
