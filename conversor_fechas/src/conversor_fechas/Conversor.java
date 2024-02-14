package conversor_fechas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Conversor {
// atributos
	String original;
	String linea;
	String cifrado;
	
	
	//almacen temporal
	String datos;
	//lineas leidas
	int contador;
	// Constructor vacio
	public Conversor() {
		
	}
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
	//-----------------comportamiento ------------------------
    /*
     * 1 : Metodos nativos
     * 2 : Metodos heredados(a menudo se sobreescriben)
     * 3 : Metodos implementados (traidos de interfaces)
	 */
	// Leo el archivo para saber cuantas lineas tiene
	public void contarLineas(String ruta) {
		File file = new File(ruta);
		contador =0;
			try {
				FileReader fr = new FileReader (file);
				BufferedReader br = new BufferedReader (fr);
				while ((linea = br.readLine())!= null) {
					contador++;
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			return contador;
			}
		public void convertirFecha() {
			for (int i=0; i<datos.length;i++) {
				System.out.println(datos[i];
			}
	}



public void convertiFecha() {
	String lineaActual="";
	int dia=0;
	int mes=0;
	for (int i =0; i<datos.length(); i++) {
		lineaActual =datos[i];
		dia= Integer.parseInt(lineaActual.substring(0, 2));
		mes = Integer.parseInt(lineaActual.substring(2, 0));
		
		convertido = dias [dia-1]+"de "+meses[mes-1]+"de"+
		lineaActual.substring(4,lineaActual.length());
		
	System.out.println(convertido);
	//reasigno las fechas pero ya convertidas
	datos [i] = convertido;
	
}

}
public void escribirFechas (String ruta)}
File file =new File (ruta);
 try {
	 FileWriter fw = new FileWriter (file,true);
	 for (int i=0; i<datos.length();i++) {
		 fw.write(datos[i+"/n");
	 }
	 }catch (exception ex)
 
			 {
			 }}
}





















