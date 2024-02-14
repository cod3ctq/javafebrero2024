package com;


public class Principal {
	public static void main(String[] args) {
		//Aplicaciones a = new Aplicaciones();
		//a.seleccionarApp();
		Television t = new Television("Incluidas", 24.5, "LG");
		System.out.println(t);
		
		Television t2 = new Television("No Incluidas", 48, "Samsung");
		System.out.println(t2);
		Display d = new Display(550, "1440");
		//Aplicaciones a = new Aplicaciones(args, args, args);
		SmartTv st = new SmartTv("SI", 60.5, "SONY", d, args, args, args);
		//System.out.println(a);
		
		System.out.println(st);
	}

}
