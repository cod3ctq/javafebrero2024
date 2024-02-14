package Herencia_ventilador;

public class RGB extends Ventilador{
	
	int boton;
	String iluminación1;
	String iluminacion2;
	String iluminacion3;
	Dicipador dicipador;
	
	public RGB() {}

	public RGB(int tamaño, int cableusb, int pusb, String material, int boton, String iluminación1, String iluminacion2,
			String iluminacion3, Dicipador dicipador) {
		super(tamaño, cableusb, pusb, material);
		this.boton = boton;
		this.iluminación1 = iluminación1;
		this.iluminacion2 = iluminacion2;
		this.iluminacion3 = iluminacion3;
		this.dicipador = dicipador;
		
	}

	public int getBoton() {
		return boton;
	}

	public void setBoton(int boton) {
		this.boton = boton;
	}

	public String getIluminación1() {
		return iluminación1;
	}

	public void setIluminación1(String iluminación1) {
		this.iluminación1 = iluminación1;
	}

	public String getIluminacion2() {
		return iluminacion2;
	}

	public void setIluminacion2(String iluminacion2) {
		this.iluminacion2 = iluminacion2;
	}

	public String getIluminacion3() {
		return iluminacion3;
	}

	public void setIluminacion3(String iluminacion3) {
		this.iluminacion3 = iluminacion3;
	}

	public Dicipador getDicipador() {
		return dicipador;
	}

	public void setDicipador(Dicipador dicipador) {
		this.dicipador = dicipador;
		
	}

	@Override
	public String toString() {
		return "RGB [boton=" + boton + ", iluminación1=" + iluminación1 + ", iluminacion2=" + iluminacion2
				+ ", iluminacion3=" + iluminacion3 + ", dicipador=" + dicipador + ", tamaño=" + tamaño + ", cableusb="
				+ cableusb + ", pusb=" + pusb + ", material=" + material + "]";
	}
	

}