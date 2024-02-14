package Herencia_ventilador;

public class principal {

public static void main(String[] args) {
	
	Ventilador v = new Ventilador();
	 
	System.out.println(v);
	
	Ventilador v2 = new Ventilador(35, 1, 2, "metal");
	System.out.println(v2);
	Dicipador d = new Dicipador(17.5, "lento", "rapido");
	RGB r = new RGB(35, 1, 2, "metal", 2, "verde", "rojo", "morado", d);
	

	System.out.println(r);
}
}