package herencia_composicion;

public class Camaras {
	double megaPixeles;
	int totalCamaras;
	String camaraFrontal;
	String camaraTrasera;
	public Camaras() {
		
	}
	public Camaras(double megaPixeles, int totalCamaras, String camaraFrontal, String camaraTrasera) {
		super();
		this.megaPixeles = megaPixeles;
		this.totalCamaras = totalCamaras;
		this.camaraFrontal = camaraFrontal;
		this.camaraTrasera = camaraTrasera;
	}
	public double getMegaPixeles() {
		return megaPixeles;
	}
	public void setMegaPixeles(double megaPixeles) {
		this.megaPixeles = megaPixeles;
	}
	public int getTotalCamaras() {
		return totalCamaras;
	}
	public void setTotalCamaras(int totalCamaras) {
		this.totalCamaras = totalCamaras;
	}
	public String getCamaraFrontal() {
		return camaraFrontal;
	}
	public void setCamaraFrontal(String camaraFrontal) {
		this.camaraFrontal = camaraFrontal;
	}
	public String getCamaraTrasera() {
		return camaraTrasera;
	}
	public void setCamaraTrasera(String camaraTrasera) {
		this.camaraTrasera = camaraTrasera;
	}
	@Override
	public String toString() {
		return "Camaras [megaPixeles=" + megaPixeles + ", totalCamaras=" + totalCamaras + ", camaraFrontal="
				+ camaraFrontal + ", camaraTrasera=" + camaraTrasera + "]";
	}
	
	
	
	
	
	
}
