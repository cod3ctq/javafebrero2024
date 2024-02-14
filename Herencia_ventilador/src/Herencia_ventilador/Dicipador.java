package Herencia_ventilador;

public class Dicipador {

	Double tamaño;
	String velocidad1;
	String velocidad2;
	
	public Dicipador() {}

	public Dicipador(Double tamaño, String velocidad1, String velocidad2) {
		super();
		this.tamaño = tamaño;
		this.velocidad1 = velocidad1;
		this.velocidad2 = velocidad2;
	}

	public Double getTamaño() {
		return tamaño;
	}

	public void setTamaño(Double tamaño) {
		this.tamaño = tamaño;
	}

	public String getVelocidad1() {
		return velocidad1;
	}

	public void setVelocidad1(String velocidad1) {
		this.velocidad1 = velocidad1;
	}

	public String getVelocidad2() {
		return velocidad2;
	}

	public void setVelocidad2(String velocidad2) {
		this.velocidad2 = velocidad2;
	}

	@Override
	public String toString() {
		return "Dicipador [tamaño=" + tamaño + ", velocidad1=" + velocidad1 + ", velocidad2=" + velocidad2 + "]";
	}

	
	
}
