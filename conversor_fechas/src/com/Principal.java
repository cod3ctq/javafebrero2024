package com;

public class Principal {
	public static void main(String[] args) {

		String m = new String();
		
		Conversor c = new Conversor();
		
		//System.out.println(c.contarLineas("C:\\Users\\diego\\OneDrive\\Desktop\\lectura.txt"));
		c.leerArchivo("C:\\\\Users\\\\diego\\\\OneDrive\\\\Desktop\\\\lectura.txt");	
		c.convertirFecha();
		c.escribirFechas("C:\\Users\\diego\\OneDrive\\Desktop\\escritura.txt");
		
		
		
	}
}
