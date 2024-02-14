package laptop;

public class Sistema_operativo  {
	
	String sistemaOperativo;
	
	Procesador procesador;
	
	public void sistemaOperativo(){
		
			
	}

	public Sistema_operativo(String sistemaOperativo, Procesador procesador) {
		super();
		this.sistemaOperativo = sistemaOperativo;
		this.procesador = procesador;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	@Override
	public String toString() {
		return "Sistema_operativo [sistemaOperativo=" + sistemaOperativo + ", procesador=" + procesador + "]";
	}
}