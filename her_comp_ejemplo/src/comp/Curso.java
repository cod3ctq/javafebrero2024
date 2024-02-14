package comp;

public class Curso {
	
	String grupo;
	String materia;
	int alumnos;
	
	public Curso() {
		
	}
	public Curso(String grupo, String materia, int alumnos) {
		super();
		this.grupo = grupo;
		this.materia = materia;
		this.alumnos = alumnos;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public int getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(int alumnos) {
		this.alumnos = alumnos;
	}
	@Override
	public String toString() {
		return "Curso [grupo=" + grupo + ", materia=" + materia + ", alumnos=" + alumnos + "]";
	}
	
	
	
	

}
