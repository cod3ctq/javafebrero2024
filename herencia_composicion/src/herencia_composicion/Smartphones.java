package herencia_composicion;

public class Smartphones {
	String pantallaTactil;
	String teclado;
	Camaras camaras;
	
	public Smartphones() {
		
	}

	public Smartphones(String pantallaTactil, String teclado, Camaras camaras) {
		super();
		this.pantallaTactil = pantallaTactil;
		this.teclado = teclado;
		this.camaras = camaras;
	}

	public String getPantallaTactil() {
		return pantallaTactil;
	}

	public void setPantallaTactil(String pantallaTactil) {
		this.pantallaTactil = pantallaTactil;
	}

	public String getTeclado() {
		return teclado;
	}

	public void setTeclado(String teclado) {
		this.teclado = teclado;
	}

	public Camaras getCamaras() {
		return camaras;
	}

	public void setCamaras(Camaras camaras) {
		this.camaras = camaras;
	}

	@Override
	public String toString() {
		return "Smartphones [pantallaTactil=" + pantallaTactil + ", teclado=" + teclado + ", camaras=" + camaras + "]";
	}
	
	
	
	
	
	
}
