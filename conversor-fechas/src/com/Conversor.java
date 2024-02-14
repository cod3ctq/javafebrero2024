package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * Herencia
 * Encapsulamiento
 * Abstraccion
 * Polimorfismo
 */

// Las clases son un conjunto de QUE y COMO
//Modelos o plantillas
public class Conversor {

	//Atributos (QUE)
	String original;
	String linea;
	String cofrado;
	
	//Almacén temporal
	String [] datos;
	// Lineas leidas	
	int contador;
	String [] dias = {"Primero","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho",
		    			"Nueve","Diez","Once","Doce","Trece","Catorce","Quince","Dieciseis","Diecisiete",
		    				"Dieciocho","Diecinueve","Veinte","Veintiuno","Veintidos","Veintitres","Veinticuatro",
		    					"Veinticinco","Veintiseis","Veintisiete","Veintiocho","Veintinueve","Treinta","Treinta y uno"};
	String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto",
						"Septiembre","Octubre","Noviembre","Diciembre"};
	
	//Constructor vacio
	
	public Conversor() {
		
	}
//Constructor con argumentos son los mecanismos para definir un estado inicial de los objetos
	public Conversor(String original, String linea, String cofrado) {
		super();
		this.original = original;
		this.linea = linea;
		this.cofrado = cofrado;
	}

	public String getOriginal() {
		return original;
	}

	public void setOriginal(String original) {
		this.original = original;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getCofrado() {
		return cofrado;
	}

	public void setCofrado(String cofrado) {
		this.cofrado = cofrado;
	}

	@Override
	public String toString() {
		return "Conversor [original=" + original + ", linea=" + linea + ", cofrado=" + cofrado + "]";
	}
	
	// ----------------COMPORTAMIENTO------------------------------
	/*
	 * 1 : Metodos nativos
	 * 2 : Metodos Heredados (a menudo se sobreescriben)
	 * 3 : Metodos implementados (traidos de interfaces)
	 */
	public int contarLineas(String ruta) {
		
		File file = new File(ruta);
		contador = 0;
		
		try {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader (fr);
		
		while ((linea = br.readLine())!= null) {
			contador++;
		}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return contador;
	}
	
	// leer el archivo para extraer cada linea y guardarla en el array
	public void leerArchivo(String ruta) {
		
		File file = new File(ruta);
		int indice = 0;
		datos = new String[contarLineas(ruta)];
		try {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader (fr);
		
		while ((linea = br.readLine())!= null) {
			datos[indice]= linea;
			indice++;
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void convertirFecha() {
		String lineaActual = "";
		int dia = 0;
		int mes = 0;
		String convertido = "";
		for (int i=0; i<datos.length;i++) {
			lineaActual = datos[i];
			dia = Integer.parseInt(lineaActual.substring(0, 2));
			mes = Integer.parseInt(lineaActual.substring(2, 4));
			
			convertido = dias[dia-1] + " de "+ meses[mes-1]+" de "+
						lineaActual.substring(4,lineaActual.length());
			System.out.println(convertido);
			//System.out.println(datos[i]);
			
			datos[i] = convertido;
		}
	}
	
	public void escribirFechas(String ruta) {
		File file = new File(ruta);
		try {
			FileWriter fw = new FileWriter(file,false);
			for (int i = 0; i < datos.length;i++) {
				fw.write(datos[i]+"\n");
			}
			fw.close();
		}catch(Exception ex) {
			
		}
	}
	
}