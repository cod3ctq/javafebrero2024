package com;

public class Boligrafo {
	String material;
	String punta;
	String tinta;
	String tapa;
	public Boligrafo() {
		
	}
	public Boligrafo(String material, String punta, String tinta, String tapa) {
		super();
		this.material = material;
		this.punta = punta;
		this.tinta = tinta;
		this.tapa = tapa;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getPunta() {
		return punta;
	}
	public void setPunta(String punta) {
		this.punta = punta;
	}
	public String getTinta() {
		return tinta;
	}
	public void setTinta(String tinta) {
		this.tinta = tinta;
	}
	public String getTapa() {
		return tapa;
	}
	public void setTapa(String tapa) {
		this.tapa = tapa;
	}
	@Override
	public String toString() {
		return "Boligrafo [material=" + material + ", punta=" + punta + ", tinta=" + tinta + ", tapa=" + tapa + "]";
	}


}
