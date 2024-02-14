package com;

public class Principal {

	public static void main(String[] args) {
		
		Conversor c = new Conversor();
		c.leerArchivo("C:\\Users\\Eberth Lopez\\Desktop\\lectura.txt");
		c.convertirFecha();
		c.escribirFechas("C:\\Users\\Eberth Lopez\\Desktop\\escritura.txt");
		}
	
}
