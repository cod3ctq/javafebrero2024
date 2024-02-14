package principal;

public class Celular {

	double pulgadas;
	String marca;
	String material;
	
	
	public Celular () {
		
	}


	public Celular(double pulgadas, String marca, String material) {
		super();
		this.pulgadas = pulgadas;
		this.marca = marca;
		this.material = material;
	}


	public double getPulgadas() {
		return pulgadas;
	}


	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	@Override
	public String toString() {
		return "Celular [pulgadas=" + pulgadas + ", marca=" + marca + ", material=" + material + "]";
	}
	
	
}
