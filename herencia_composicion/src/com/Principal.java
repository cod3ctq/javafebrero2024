package com;

public class Principal {
		
	public static void main(String[] args) {
		
		
		Reloj r = new Reloj();
		System.out.println(r);
		
		Reloj r2 = new Reloj(10,36,"Plata"); //
		System.out.println(r2);
		
		
		Smartwatch s = new Smartwatch();
		//----------------------------------------
		
		Display d1 = new Display(500, "circular", 3.2, "720");
		Smartwatch sm = new Smartwatch(17, 13, "Cuero", "Android Wear", d1);
		
		
		System.out.println(sm);
		
		
		
	}

}
