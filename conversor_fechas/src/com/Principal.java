package com;

public class Principal {

	public static void main(String[] args) {

		Conversor c = new Conversor();
		// System.out.println(c.contarLineas("C:\\Users\\ThinkPad\\Desktop\\lectura.txt"));
		c.leerArchivo("C:\\Users\\ThinkPad\\Desktop\\lectura.txt");
		c.convertirFecha();
		c.escribirFechas("C:\\Users\\ThinkPad\\Desktop\\escritura.txt");
	}

}
