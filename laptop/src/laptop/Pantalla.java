package laptop;

public class Pantalla extends Procesador{
	
	double tamaño;
	int nits;
	String resolucon;
	String tactil;
	Sistema_operativo sistemaoperativos;
	
	public Pantalla(){
		
	}

	public Pantalla(double tamaño, int nits, String resolucon, String tactil, Sistema_operativo sistemaoperativos) {
		super();
		this.tamaño = tamaño;
		this.nits = nits;
		this.resolucon = resolucon;
		this.tactil = tactil;
		this.sistemaoperativos = sistemaoperativos;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public int getNits() {
		return nits;
	}

	public void setNits(int nits) {
		this.nits = nits;
	}

	public String getResolucon() {
		return resolucon;
	}

	public void setResolucon(String resolucon) {
		this.resolucon = resolucon;
	}

	public String getTactil() {
		return tactil;
	}

	public void setTactil(String tactil) {
		this.tactil = tactil;
	}

	public Sistema_operativo getSistemaoperativos() {
		return sistemaoperativos;
	}

	public void setSistemaoperativos(Sistema_operativo sistemaoperativos) {
		this.sistemaoperativos = sistemaoperativos;
	}

	@Override
	public String toString() {
		return "Pantalla [tamaño=" + tamaño + ", nits=" + nits + ", resolucon=" + resolucon + ", tactil=" + tactil
				+ ", sistemaoperativos=" + sistemaoperativos + ", getTamaño()=" + getTamaño() + ", getNits()="
				+ getNits() + ", getResolucon()=" + getResolucon() + ", getTactil()=" + getTactil()
				+ ", getSistemaoperativos()=" + getSistemaoperativos() + "]";
	}


}
