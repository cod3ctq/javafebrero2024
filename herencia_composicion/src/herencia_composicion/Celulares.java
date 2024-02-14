package herencia_composicion;

public class Celulares {
	double precio;
	String sistemaOperativo;
	String color;
	String marca;
	public Celulares() {
		
	}
	public Celulares(double precio, String sistemaOperativo, String color, String marca) {
		super();
		this.precio = precio;
		this.sistemaOperativo = sistemaOperativo;
		this.color = color;
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Celulares [precio=" + precio + ", sistemaOperativo=" + sistemaOperativo + ", color=" + color
				+ ", marca=" + marca + "]";
	}
	
	
	
	
	
	
}
