package model;

public class Cupon {
	
	//atributos
	public String promocion;
	public double precio;
	public int codigo;
	
	//constructores
	public Cupon(String promocion, double precio, int codigo) {
		super();
		this.promocion = promocion;
		this.precio = precio;
		this.codigo = codigo;
	}

	//getters y setters
	public String getPromocion() {
		return promocion;
	}

	public void setPromocion(String promocion) {
		this.promocion = promocion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	

}
