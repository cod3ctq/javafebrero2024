package com;


public class Principal {
	public static void main(String[] args) {
		
		Conversor c= new Conversor();
		//System.out.println(c.contarLineas("C:\\Users\\victo\\OneDrive\\Desktop\\lectura.txt"));
		c.leerArchivo("C:\\Users\\victo\\OneDrive\\Desktop\\lectura.txt");
		c.convertirFecha();
		c.escribirFechas("C:\\Users\\victo\\OneDrive\\Desktop\\escritura.txt");
		
	}

}
