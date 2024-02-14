package com;

public class Navaja {
	String tipo;
	String material;
	double precio;
	double tamaño;
	
	
	public Navaja() {
		
	}

	public Navaja(String tipo, String material, double precio, double tamaño) {
		super();
		this.tipo = tipo;
		this.material = material;
		this.precio = precio;
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Navaja [tipo=" + tipo + ", material=" + material + ", precio=" + precio + ", tamaño=" + tamaño + "]";
	}

	
	

}
