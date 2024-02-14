package com;

public class Estilo {

	String marca;
	String modelo;
	public Estilo () {
		
	}
	public Estilo(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		
	}
	@Override
	public String toString() {
		return "Estilo [marca=" + marca + ", modelo=" + modelo + "]";
	
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
