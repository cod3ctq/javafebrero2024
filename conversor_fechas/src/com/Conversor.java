package com;
import java.io.*;
import java.util.Iterator;
/* 
  la orientacion a objetos tiene cuatro pilares
  -Herencia
  -Encapsulamiento
  -Abstraccon
  -Polimorfismo
  
  
  
  Las clases son un conjunto de QUE y COMO
  Modelos o plantillas
 */
public class Conversor {
	
	//Atributos (QUE)
	String original;
	String linea;
	String cifrado;
	
	//Almacen temporal
	String[] datos;
	
	//Lineas leidas
	int contador;
	
	String[] dias = {"Primero","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho",
		              "Nueve","Diez","Once","Doce","Trece","Catorce","Quince","Dieciseis",
		              "Diecisiete","Dieciocho","Diecinueve","Veinte","Veintiuno","Veintidos",
		              "Veintitres","Veinticuatro","Veinticinco","Veintiseis","Veintisiete",
		              "Veintiocho","Veintinueve","Treinta","Treinta y uno"};
	
	String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto",
			          "Septiembre","Octubre","Noviembre","Diciembre"};
	//Constructor vacio
	public Conversor() {
		
	}
	
	/*click derecho source constructor using fields
	constructor con argumentos 	*/
	public Conversor(String original, String linea, String cifrado) {
		super();
		this.original = original;
		this.linea = linea;
		this.cifrado = cifrado;
	}
	
	//click derecho source  Generate getters and setters

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

	public String getCifrado() {
		return cifrado;
	}

	public void setCifrado(String cifrado) {
		this.cifrado = cifrado;
	}
	
	//click derecho source Generate to string

	@Override
	public String toString() {
		return "Conversor [original=" + original + ", linea=" + linea + ", cifrado=" + cifrado + "]";
	}
	
	/* --------------COMPORTAMIENTO--------------------------
	 1: Metodos Nativos (Metodos que hice aqui mismo)
	 2: Metodos Heredados (a menudo se sobreescriben)
	 3: Metodos implementados (traidos de interface)	
	*/
	
	//Este metodo solo se encargara de contar cuantas lineas tiene el archivo
	public int contarLineas(String ruta) {		
		//Funcionan para leer los archivos
		File file = new File(ruta);
		contador = 0;	
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			/*Almacena en la variable linea todo lo que bufferREader lea con su clase readline
			con ! = null establecemos que si no es negativo, osea, que si tiene algo escrito, lo que sea,
			aumentara mi contador 
					*/
			while((linea = br.readLine())!= null){
				contador++;				
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return contador;
	}
	
	/*Void es vacio, no devuelve nada 
	 Va a leer el archivo para extraer cada linea y guardarlo en el array 
	 */
	public void leerArchivo(String ruta) {		
		File file = new File(ruta);
		int indice = 0;
		//Inicializar el array ya con el tamaño calculado en el metodo anterior
		datos = new String[contarLineas(ruta)];
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			/*Almacena en la variable linea todo lo que bufferREader lea con su clase readline
			con ! = null establecemos que si no es negativo, osea, que si tiene algo escrito, lo que sea,
			lo almacenara en el array establecido como datos
					*/
			while((linea = br.readLine())!= null){
				datos[indice] = linea;
				//hacemos que indicie sigua leyendo lineas
				indice++;
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void convertirFecha() {
		String lineaActual="";
		int dia = 0;
		int mes = 0;
		String convertido ="";
		for (int i = 0; i < datos.length; i++) {
			
			lineaActual = datos[i];
			
			dia = Integer.parseInt(lineaActual.substring(0,2));
			mes = Integer.parseInt(lineaActual.substring(2,4));
			
			convertido = dias[dia-1] + " de " + meses[mes-1] + " de " 
			           + lineaActual.substring(4, lineaActual.length());
			System.out.println(convertido);
			
			//Reasigno las fechas pero ya convertidas
			datos[i] = convertido;
			
			
		}
	}
	
	public void escribirFechas(String ruta) {
		File file = new File(ruta);
		try {
			FileWriter fw = new FileWriter(file, true);	//Cuando es true, agrega datos al archivo, con false lo sobre escribe		
			for (int i = 0; i < datos.length; i++) {
				fw.write(datos[i]+"\n");
			}
			fw.close();
		}catch(Exception ex) {
			
		}
	}
}
