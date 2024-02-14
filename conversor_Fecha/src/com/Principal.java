package com;

public class Principal {
    public static void main(String[] args) {
        
     
        Conversor c= new Conversor();

        System.out.println(c.contarLineas("C:\\Users\\isaac\\Desktop\\lectura.txt"));
        c.leerArchivo("C:\\Users\\isaac\\Desktop\\lectura.txt");
        c.convertirFecha();
        c.escribirFechas("C:\\Users\\isaac\\Desktop\\escritura.txt");
    }
}
