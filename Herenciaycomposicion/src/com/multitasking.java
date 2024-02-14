package com;

public class multitasking extends Boligrafo{
	String puntolaser;
	String gomatactil;
	String burbujaNiveladora;
	String destornillador;
	Boligrafo Boligrafo;
	 
	public multitasking(){
			
	}

	public multitasking(String material, String punta, String tinta, String tapa, String puntolaser, String gomatactil,
			String burbujaNiveladora, String destornillador, Boligrafo boligrafo) {
		super(material, punta, tinta, tapa);
		this.puntolaser = puntolaser;
		this.gomatactil = gomatactil;
		this.burbujaNiveladora = burbujaNiveladora;
		this.destornillador = destornillador;
		Boligrafo = boligrafo;
	}

	public String getPuntolaser() {
		return puntolaser;
	}

	public void setPuntolaser(String puntolaser) {
		this.puntolaser = puntolaser;
	}

	public String getGomatactil() {
		return gomatactil;
	}

	public void setGomatactil(String gomatactil) {
		this.gomatactil = gomatactil;
	}

	public String getBurbujaNiveladora() {
		return burbujaNiveladora;
	}

	public void setBurbujaNiveladora(String burbujaNiveladora) {
		this.burbujaNiveladora = burbujaNiveladora;
	}

	public String getDestornillador() {
		return destornillador;
	}

	public void setDestornillador(String destornillador) {
		this.destornillador = destornillador;
	}

	public Boligrafo getBoligrafo() {
		return Boligrafo;
	}

	public void setBoligrafo(Boligrafo boligrafo) {
		Boligrafo = boligrafo;
	}

	@Override
	public String toString() {
		return "multitasking [puntolaser=" + puntolaser + ", gomatactil=" + gomatactil + ", burbujaNiveladora="
				+ burbujaNiveladora + ", destornillador=" + destornillador + ", Boligrafo=" + Boligrafo + ", material="
				+ material + ", punta=" + punta + ", tinta=" + tinta + ", tapa=" + tapa + "]";
	}
	
}