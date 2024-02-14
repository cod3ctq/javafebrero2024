package conversosfechas;

public class Principal {
	public static void main(String[] args) {
		
		Conversor c = new Conversor();
		
		System.out.println(c.contarLineas("C:\\Users\\Angel\\Desktop\\Lectura\\lectura.txt"));
		
		c.leerArchivo("C:\\Users\\Angel\\Desktop\\Lectura\\lectura.txt");
		c.convertirFecha();
		c.escribirFechas("C:\\Users\\Angel\\Desktop\\Escritura.txt");
		
	}

}
