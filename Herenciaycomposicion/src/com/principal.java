package com;

public class principal {
	public static void main(String[] args) {
		
		Boligrafo b = new Boligrafo();
		System.out.println(b);
		
		Boligrafo b2 = new Boligrafo("plastico", "metalica","negra", "plastica");
		System.out.println(b2);
		
		multitasking m = new multitasking();
		
		multitasking m2 = new multitasking("plastico", "metalica", "negra", "plastica", "rojo", "material conductor", "verde","estrella", b);
		
		
		
		System.out.println(m2);
		
		
	}

}
