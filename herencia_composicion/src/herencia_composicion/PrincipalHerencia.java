package herencia_composicion;

public class PrincipalHerencia {
	public static void main(String[] args) {
//		Reloj r = new Reloj();
//		System.out.println(r);
//		
//		Reloj r2 = new Reloj(10,36,"Plata");
//		System.out.println(r2);
		
		//Smartwatch s = new Smartwatch();
//		Display d1 = new Display(500, "Circular", 3.2, "720");
//		Smartwatch sm = new Smartwatch(17, 13, "Cuero", "Android Wear", d1);
//	System.out.println(sm);
		
		Celulares c0 = new Celulares(12000.99, "IOS 10", "Plateado", "Apple");
		System.out.println(c0);
		
		Camaras cam0 = new Camaras(8, 3, "Si tiene", "Si tiene");
		Smartphones sp0 = new Smartphones("Si", "Teclado Touch", cam0);
		System.out.println(sp0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
