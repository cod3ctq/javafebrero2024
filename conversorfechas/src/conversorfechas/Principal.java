package conversorfechas;

public class Principal {
	public static void main(String[] args) {
		
		
		Conversor c = new Conversor();
		
		//System.out.println(c.contarLineas("C:\\Users\\frang\\OneDrive\\Escritorio\\Lectura.txt"));
		
		c.leerArchivo("C:\\Users\\frang\\OneDrive\\Escritorio\\Lectura.txt");
		c.convertirFecha();
		c.escribirFechas("C:\\Users\\frang\\OneDrive\\Escritorio\\Escritua.txt");
		
	}

}
