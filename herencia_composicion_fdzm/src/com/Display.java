package com;

public class Display {
	int pixeles;
	String resolucion;
	
	public Display() {
		
	}

	public Display(int nits, String resolucion) {
		super();
		this.pixeles = nits;
		this.resolucion = resolucion;
	}

	public int getNits() {
		return pixeles;
	}

	public void setNits(int pixeles) {
		this.pixeles = pixeles;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	@Override
	public String toString() {
		return "Display [nits=" + pixeles + ", resolucion=" + resolucion + "]";
	}
	
	

}
