package conversor_fechas;

public class Principal {

public static void main(String[] args) {

	
	
	
	Conversor c = new Conversor();	
	
	c.leerArchivo("C:\\Users\\3gm20\\OneDrive\\Escritorio\\Lectura.txt");
	c.convertirfecha();
	c.escribirFechas("C:\\Users\\3gm20\\OneDrive\\Escritorio\\Escritura.txt");
	
}	

}
