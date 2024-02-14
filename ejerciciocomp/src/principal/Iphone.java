package principal;

public class Iphone extends Celular{

	String sistemaOperativo;
	
	Camara camara;
	
	public Iphone() {
		
	}

	public Iphone(String sistemaOperativo, Camara camara) {
		super();
		this.sistemaOperativo = sistemaOperativo;
		this.camara = camara;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	@Override
	public String toString() {
		return "Iphone [sistemaOperativo=" + sistemaOperativo + ", camara=" + camara + ", pulgadas=" + pulgadas
				+ ", marca=" + marca + ", material=" + material + "]";
	}


	
}
