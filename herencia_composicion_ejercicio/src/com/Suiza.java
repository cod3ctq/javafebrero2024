package com;

public class Suiza extends Navaja {
	String marca;
	String color;
	Cuchillo Cuchillo;
	
	public Suiza() {
		
	}
	
	

	public Suiza(String tipo, String material, double precio, double tamaño, String marca, String color,
			com.Cuchillo cuchillo) {
		super(tipo, material, precio, tamaño);
		this.marca = marca;
		this.color = color;
		Cuchillo = cuchillo;
	}
	


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Cuchillo getCuchillo() {
		return Cuchillo;
	}

	public void setCuchillo(Cuchillo cuchillo) {
		Cuchillo = cuchillo;
	}

	@Override
	public String toString() {
		return "Suiza [marca=" + marca + ", color=" + color + ", Cuchillo=" + Cuchillo + ", tipo=" + tipo
				+ ", material=" + material + ", precio=" + precio + ", tamaño=" + tamaño + "]";
	}

	
	
	

}
