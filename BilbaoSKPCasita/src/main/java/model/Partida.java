package model;

public class Partida {

	//atributos
	public String nombre, url;
	public int codigo, numero, idImagen;
	
	//constructor
	public Partida(String nombre,String url, int idImagen, int codigo, int numero) {
		super();
		//setters para obtener las imagenes
		setIdImagen(idImagen);
		setUrl(url);
		//Setters para obtener el codigo y nombre de la partida
		this.nombre = nombre;
		this.codigo = codigo;
		this.numero = numero;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//Setter y Getter de las imagenes del juego

	public int getIdImagen() {
		return idImagen;
	}

	public void setIdImagen(int idImagen) {
		this.idImagen = idImagen;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
}
