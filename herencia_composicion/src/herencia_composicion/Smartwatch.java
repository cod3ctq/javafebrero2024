package herencia_composicion;

public class Smartwatch extends Reloj{
	String sistemaOperativo;
	//Composicion
	Display display;
	
	public Smartwatch() {
		
	}

	public Smartwatch(int horas, int min, String material, String sistemaOperativo, Display display) {
		super(horas, min, material);
		this.sistemaOperativo = sistemaOperativo;
		this.display = display;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	@Override
	public String toString() {
		return "Smartwatch [sistemaOperativo=" + sistemaOperativo + ", display=" + display + ", horas=" + horas
				+ ", min=" + min + ", material=" + material + "]";
	}

	
	
	
	
	
}
