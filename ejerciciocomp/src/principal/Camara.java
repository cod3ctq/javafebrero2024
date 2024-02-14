package principal;

public class Camara {

	 int megaPixeles;
	 String modo;
	 String flash;
	 int zoomOptico;
	 
	public Camara () {
		
	}

	public Camara(int megaPixeles, String modo, String flash, int zoomOptico) {
		super();
		this.megaPixeles = megaPixeles;
		this.modo = modo;
		this.flash = flash;
		this.zoomOptico = zoomOptico;
	}

	
	public int getMegaPixeles() {
		return megaPixeles;
	}

	public void setMegaPixeles(int megaPixeles) {
		this.megaPixeles = megaPixeles;
	}

	public String getModo() {
		return modo;
	}

	public void setModo(String modo) {
		this.modo = modo;
	}

	public String getFlash() {
		return flash;
	}

	public void setFlash(String flash) {
		this.flash = flash;
	}

	public int getZoomOptico() {
		return zoomOptico;
	}

	public void setZoomOptico(int zoomOptico) {
		this.zoomOptico = zoomOptico;
	}

	@Override
	public String toString() {
		return "Camara [megaPixeles=" + megaPixeles + ", modo=" + modo + ", flash=" + flash + ", zoomOptico=" + zoomOptico + "]";
	}
	
	
}
