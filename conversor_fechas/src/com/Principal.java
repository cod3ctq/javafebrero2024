package com;

public class Principal {
	
	public static void main(String[] args) {
	
		
		
		Conversor c = new Conversor();
		
		//System.out.println(c.contarLineas("C:\\Users\\César\\Desktop\\lectura.txt"));
		c.leerArchivo("C:\\Users\\César\\Desktop\\lectura.txt");
		c.convertirFecha();
		c.escribirFechas("C:\\Users\\César\\Desktop\\escritura.txt");
		
		
		
	}

}
