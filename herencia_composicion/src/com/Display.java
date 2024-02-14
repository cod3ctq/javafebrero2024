package com;

public class Display {

	int nits;
	String forma;
	double tamaño;
	String resolucion; // 720, 1080,

	public Display() {

	}

	public Display(int nits, String forma, double tamaño, String resolucion) {
		super();
		this.nits = nits;
		this.forma = forma;
		this.tamaño = tamaño;
		this.resolucion = resolucion;
	}

	public int getNits() {
		return nits;
	}

	public void setNits(int nits) {
		this.nits = nits;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	@Override
	public String toString() {
		return "Display [nits=" + nits + ", forma=" + forma + ", tamaño=" + tamaño + ", resolucion=" + resolucion + "]";
	}

}
