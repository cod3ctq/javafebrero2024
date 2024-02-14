package laptop;

public class Principal {

	public static void main(String[] args) {
		
	Procesador p = new Procesador(320,16,160,8,"si");
	Sistema_operativo s= new Sistema_operativo("Windwos",p);
	Pantalla Pn= new Pantalla (32,2,"HD","si",s);
		
		System.out.println(Pn);
	}
}
