package conversorfechas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

//pilares de la orientacion a objetos
//herencia
//encapsulamiento
//abstraccion
//polimorfismo

//las clases son un conjunto de QUE y COMO
//Modelos o plantillas


public class Conversor {
	
	// atributos (QUE)
		String original;
		String linea;
		String cifrado;
		
		//Almacen temporal
		String [] datos;
		
		//Lineas leidas
		int contador;
		
		String[] dias= {"Primero","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho",
			    "Nueve","Diez","Once","Doce","Trece","Catorce","Quince","Dieciseis","Diecisiete",
			    "Dieciocho","Diecinueve","Veinte","Veintiuno","Veintidos","Veintitres","Veinticuatro","Veinticinco","Veintiseis",
			    "Veintisiete","Veintiocho","Veintinueve","Treinta","Treinta y uno"};
		String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	//Metodo constructor vacio
		
		public Conversor() {
			
			
		
	}
    //Constructos con argumentos, son los mecanismos
	//para definir un estado inicial de los objetos
	public Conversor(String original, String linea, String cifrado) {
		super();
		this.original = original;
		this.linea = linea;
		this.cifrado = cifrado;
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

	public String getCifrado() {
		return cifrado;
	}

	public void setCifrado(String cifrado) {
		this.cifrado = cifrado;
	}

	@Override
	public String toString() {
		return "Conversor [original=" + original + ", linea=" + linea + ", cifrado=" + cifrado + "]";
	
	}
	//-------COMPORTAMIENTO-------------
	//1.-Metodos nativos
	//2.-Metodos heredados (a menudo se sobreescriben)
	//3.-Metodos implementados (traidos de interfaces(contextos o contratos que cumplen las condiciones)
	
	//METODOS NATIVOS
	//Leo archivos para saber cuantas lineas tengo
	public int contarLineas(String ruta) {
	
		File file= new File(ruta);
		contador=0;
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader (fr);
			while((linea=br.readLine())!=null) {			
		    contador++;
			}
		} catch(Exception ex) {
				ex.printStackTrace();
		
			}
				return contador;
		
	}
	//leer el archivo para extraer cada line y guardarlo en el array
	public void leerArchivo(String ruta) {
		
		File file= new File(ruta);
		int indice = 0;
		//	Inicializa el array con el tama;o calculando en el metodo anterior
		datos= new String [contarLineas(ruta)];
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader (fr);
			while((linea=br.readLine())!=null) {			
		    datos[indice]=linea;
		    indice++;
			}
		} catch(Exception ex) {
				ex.printStackTrace();
		
			}
			
		
	}
	
	public void convertirFecha() {
		String lineaActual="";
		int dia=0;
		int mes=0;
		String convertido= "";
		for (int i =0;i <datos.length;i++) {
			//System.out.println(datos[i]);
			lineaActual= datos[i];
		    dia=Integer.parseInt(lineaActual.substring(0,2));
		    mes=Integer.parseInt(lineaActual.substring(2,4));
		    convertido = dias[dia-1]+" de "+meses[mes-1]+" de "+lineaActual.substring(4,+lineaActual.length());
		    System.out.println(convertido);
		
		    //Reasignando las fechs pero ya convertidas
		    datos[i]=convertido;
		}
	}
	
	public void escribirFechas(String ruta) {
		File file =new File(ruta);
		try {
             FileWriter fw = new FileWriter(file,true);//false cambia el texto mientras true se agrega y false se sobreescribe
             for(int i =0; i< datos.length;i++) {
             fw.write(datos[i]+"\n");	 
             }
             fw.close();
		}catch(Exception ex) {
	}
}}
