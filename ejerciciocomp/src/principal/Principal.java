package principal;

public class Principal {

	public static void main(String[] args) {
		
		Celular c = new Celular ();
		System.out.println(c);
		
		Celular c2 = new Celular (6.2, "Apple", "Titanio" );
		System.out.println(c2);
		
		Iphone i = new Iphone ();
		
		Camara cam = new Camara(12, "Retrato", "True tone", 2);
		
		System.out.println(cam);
		
	}
}
