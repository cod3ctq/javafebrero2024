package com;

public class Principal {

	public static void main(String[] args) {
		
		
		
		Conversor c = new Conversor();
		
		//System.out.println(c.contarLineas("C:\\Users\\cinth\\OneDrive\\Escritorio\\Lectura.txt"));
		c.leerArchivo("C:\\Users\\cinth\\OneDrive\\Escritorio\\Lectura.txt");
		c.convertirFecha();
		c.escribirFechas("C:\\Users\\cinth\\OneDrive\\Escritorio\\escritura.txt");
		
		
	}
}
