package conversosfechas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * Herencia
 * Encapsulamiento
 * Abstracción
 * Poliformismo
 */

//Las clases son un conjunto de QUE Y COMO
//modelos o plantillas
public class Conversor {

	// Atributos (QUE)

	String original;
	String linea;
	String cifrado;

	String[] dias = { "Primero", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Once",
			"Doce", "Trece", "Catorce", "Quince", "Dieciseis", "Diecisiete", "Dieciocho", "Diecinueve", "Veinte",
			"Veintiuno", "Veintidos", "Veintitres", "Veinticuatro", "Veinticinco", "Veintiseis", "Veintisiete",
			"Veintiocho", "Veintinueve", "Treinta", "Treinta y uno" };
	String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
			"Octubre", "Noviembre", "Diciembre" };
	// almacen temporl
	String[] datos;
	// Lineaa leidas
	int contador;

	// metodo constructor vacio (el constyructor siempre lleva el nombre d ela clase
	public Conversor() {

	}

	// constructor con argumentos
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

	// ---------------COMPORTAMIENTO-----------------

	/*
	 * 1: Cuando dedines metodos nativos (los que se hicieron dentro de la clase) 2:
	 * Cuanod defines metodos Herederos (a menudo se sobreescriben) 3: cuando se
	 * definiennm metodos implementsos (traidas de otras interfaces)
	 */

	public int contarLineas(String ruta) {
		File file = new File(ruta);
		contador = 0;

		try {
			FileReader fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr);

			while ((linea = br.readLine()) != null) {
				contador++;
			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return contador;
	}

	// {0}
	// Leer el archivo para extraer cada linea y guardarla en el array
	public void leerArchivo(String ruta) {
		File file = new File(ruta);
		int indice = 0;
		datos = new String[contarLineas(ruta)];

		try {

			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while ((linea = br.readLine()) != null) {
				datos[indice] = linea;
				indice++;

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void convertirFecha() {
		String lineaActual = "";
		int dia = 0;
		int mes = 0;
		String convertido = "";

		for (int i = 0; i < datos.length; i++) {
			lineaActual = datos[i];
			dia = Integer.parseInt(lineaActual.substring(0, 2));
			mes = Integer.parseInt(lineaActual.substring(2, 4));
			convertido = dias[dia - 1] + " de " + meses[mes - 1] + " de "
					+ Integer.parseInt(lineaActual.substring(4, lineaActual.length()));
			System.out.println(convertido);
			// Reasigno fechas pero ya convertidas
			datos[i] = convertido;

		}
	}

	public void escribirFechas(String ruta) {
		File file = new File(ruta);
		try {
			FileWriter fw = new FileWriter(file, true);
			for (int i = 0; 1 < datos.length; i++) {
				fw.write(datos[i] + "\n");
				
			}
			fw.close();
			
		} catch (Exception ex) {

		}
		
	}
	
}
