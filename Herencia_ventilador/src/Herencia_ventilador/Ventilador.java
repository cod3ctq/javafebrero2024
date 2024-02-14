package Herencia_ventilador;

public class Ventilador {

	
	int tamaño;
	int cableusb;
	int pusb;
	String material;
	
	
	public Ventilador() {}


	public Ventilador(int tamaño, int cableusb, int pusb, String material) {
		super();
		this.tamaño = tamaño;
		this.cableusb = cableusb;
		this.pusb = pusb;
		this.material = material;
	}


	public int getTamaño() {
		return tamaño;
	}


	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}


	public int getCableusb() {
		return cableusb;
	}


	public void setCableusb(int cableusb) {
		this.cableusb = cableusb;
	}


	public int getPusb() {
		return pusb;
	}


	public void setPusb(int pusb) {
		this.pusb = pusb;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	@Override
	public String toString() {
		return "Ventilador [tamaño=" + tamaño + ", cableusb=" + cableusb + ", pusb=" + pusb + ", material=" + material
				+ "]";
	}

	
}