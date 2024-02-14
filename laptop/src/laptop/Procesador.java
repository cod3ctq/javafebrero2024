package laptop;

public class Procesador {

	
	int frecuenciaReloj;
	int memoria;
	int vatios;
	int nucleos;
	String refrigeracion;
	
	public Procesador () {
		
	}

	public Procesador(int frecuenciaReloj, int memoria, int vatios, int nucleos, String refrigeracion) {
		super();
		this.frecuenciaReloj = frecuenciaReloj;
		this.memoria = memoria;
		this.vatios = vatios;
		this.nucleos = nucleos;
		this.refrigeracion = refrigeracion;
	}

	public int getFrecuenciaReloj() {
		return frecuenciaReloj;
	}

	public void setFrecuenciaReloj(int frecuenciaReloj) {
		this.frecuenciaReloj = frecuenciaReloj;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getVatios() {
		return vatios;
	}

	public void setVatios(int vatios) {
		this.vatios = vatios;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public String getRefrigeracion() {
		return refrigeracion;
	}

	public void setRefrigeracion(String refrigeracion) {
		this.refrigeracion = refrigeracion;
	}

	@Override
	public String toString() {
		return "Procesador [frecuenciaReloj=" + frecuenciaReloj + ", memoria=" + memoria + ", vatios=" + vatios
				+ ", nucleos=" + nucleos + ", refrigeracion=" + refrigeracion + "]";
	}
	
}
