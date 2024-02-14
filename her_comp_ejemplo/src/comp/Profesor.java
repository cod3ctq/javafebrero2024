package comp;

public class Profesor extends Persona{
	
	String depto;
	
	//Composición
	Curso curso;
	
	public Profesor() {
		
	}

	

	public Profesor(String nombre, String apellido, int edad, String depto, Curso curso) {
		super(nombre, apellido, edad);
		this.depto = depto;
		this.curso = curso;
	}



	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Profesor [depto=" + depto + ", curso=" + curso + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + "]";
	}
	

	

}
