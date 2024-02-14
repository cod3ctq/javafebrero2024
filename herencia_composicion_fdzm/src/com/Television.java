package com;

public class Television {
	String bocinas;
	double tamaño;
	String marca;
	
	public Television() {
		
	}

	public Television(String bocinas, double tamaño, String marca) {
		super();
		this.bocinas = bocinas;
		this.tamaño = tamaño;
		this.marca = marca;
	}

	public String getBocinas() {
		return bocinas;
	}

	public void setBocinas(String bocinas) {
		this.bocinas = bocinas;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Television [bocinas = " + bocinas + ", tamaño = " + tamaño + ", marca = " + marca + "]";
	}
	
	

}
