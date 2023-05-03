package model;

public class Item {

	String url, nombre, descripcion;
/*Super de la clase "Item"*/
	public Item(String url, String nombre, String descripcion) {
		super();
	setUrl(url);
	setDescripcion(descripcion);
	setNombre(nombre);
	}
/*Para caso que tengamos las imagenes en la base de datos*/
	public String getUrl() {
		return url;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
