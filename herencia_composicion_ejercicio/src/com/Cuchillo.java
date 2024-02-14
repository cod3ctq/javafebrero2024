package com;

public class Cuchillo {
	
	double longitud;
	double altura;
	double peso;
	int bess;
	
	public Cuchillo() {
		
	}

	public Cuchillo(double longitud, double altura, double peso, int bess) {
		super();
		this.longitud = longitud;
		this.altura = altura;
		this.peso = peso;
		this.bess = bess;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getBess() {
		return bess;
	}

	public void setBess(int bess) {
		this.bess = bess;
	}

	@Override
	public String toString() {
		return "Cuchillo [longitud=" + longitud + ", altura=" + altura + ", peso=" + peso + ", bess=" + bess + "]";
	}
	

}
