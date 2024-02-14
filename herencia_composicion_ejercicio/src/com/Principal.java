package com;

public class Principal {
	public static void main(String[] args) {
		Navaja n = new Navaja("suiza", "acero", 1300.00, 15.2);
		System.out.println(n);

		Cuchillo c = new Cuchillo(9.1, 3.3, 184, 1000);
		// Suiza s = new Suiza("victorinox", "rojo", c);
		Suiza s = new Suiza("Suiza", "Acero", 1300.00, 15.2, "victorinox", "rojo", c);
		System.out.println(s);

	}

}
