package herencia_composicion;

public class Reloj {
	int horas;
	int min;
	String material;
	
	public Reloj() {}
	//Sobrecarga de argumentos, es una de las formas del polimorfismo
	//el polimorfismo se presenta en la sobre carga de argumentos
	public Reloj(int horas, int min, String material) {
		super();
		this.horas = horas;
		this.min = min;
		this.material = material;
	}
	public Reloj(int horas, int min) {
		this.horas = horas;
		this.min = min;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Reloj [horas=" + horas + ", min=" + min + ", material=" + material + "]";
	}
	
	
	//Comportamiento
	//metodo nativo
	
	public void mostrarHora() {
		System.out.println("La hora es: "+ horas + ":"+min);
	}
	
	
	
	
	
}
