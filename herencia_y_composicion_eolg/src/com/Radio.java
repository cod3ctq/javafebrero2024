package com;

public class Radio {
	
	double frecuencia;
	String protocolo;
	int id;
	
	public Radio() {
		
	}

	public Radio(double frecuencia, String protocolo, int id) {
		
		this.frecuencia = frecuencia;
		this.protocolo = protocolo;
		this.id = id;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Radio [frecuencia=" + frecuencia + ", protocolo=" + protocolo + ", id=" + id + "]";
	}
	

}
