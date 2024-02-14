package comp;

public class Principal {
	
	public static void main(String[] args) {
		
		Persona p = new Persona("Pedro", "Zamora", 49);
		System.out.println(p);
		
		Curso c1 = new Curso("ISC1", "POO", 35);
		Profesor pf = new Profesor("Pedro", "Zamora", 49, "Informatica", c1);
		
		System.out.println(pf);
		
	}

}
