package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

//Programacion orientada a objetos.
/*
 * Herencia
 * Encapsulamiento
 * Abstraccion
 * Polimorfismo
 */
//las clases son un conjunto de QUE y COMO
//modelos o plantillas
public class Conversor {
    // Atributos(QUE)
    String original, linea, cifrado;

    //Lineas leidas
    int contador;

    //Almacen temporal
    String [] datos;
    String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    String[] dias = {"Primero","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho",
    "Nueve","Diez","Once","Doce","Trece","Catorce","Quince","Dieciseis","Diecisiete",
    "Dieciocho","Diecinueve","Veinte","Veintiuno","Veintidos","Veintitres","Veinticuatro","Veinticinco","Veintiseis",
    "Veintisiete","Veintiocho","Veintinueve","Treinta","Treinta y uno"};

    // Constructor vacio
    public Conversor() {

    }

    @Override
    public String toString() {
        return "Conversor [original=" + original + ", linea=" + linea + ", cifrado=" + cifrado + "]";
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

    public Conversor(String original, String linea, String cifrado) {
        this.original = original;
        this.linea = linea;
        this.cifrado = cifrado;
    }
    //-----Comportamiento-----

    /*1: Metodos nativos
     * 2 Metodos heredados(a menudo se sobrescriben)
     * 3: Metodos implementados (traidos de interfaces)
     */

    public int contarLineas(String ruta){
       
        try{
            File file =new File(ruta);
            contador=0;
            FileReader fr= new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            while ((linea = br.readLine())!=null) {
                contador++;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return contador;

        

    }

    public void leerArchivo(String ruta){
        File file =new File(ruta);
        int indice=0;
        //inicializa el arrey con el metodo que cuenta lineas
        datos = new String[contarLineas(ruta)];
        try{
            FileReader fr= new FileReader(file);
            BufferedReader br=new BufferedReader(fr);
            while ((linea = br.readLine())!=null) {
                datos[indice]=linea;
                indice++;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        } 
    }

    public void convertirFecha(){
        String lineaActual="" ,convertido="";
        int dia=0, mes=0, ano=0;
        for (int i = 0; i < datos.length; i++) {

            lineaActual=datos[i];            
            dia=Integer.parseInt(lineaActual.substring(0,2));
            mes=Integer.parseInt(lineaActual.substring(2,4));
            ano=Integer.parseInt(lineaActual.substring(4,lineaActual.length()));
            convertido= dias[dia-1]+ " de "+ meses[mes-1] +" del "+ ano;

            System.out.println(convertido);

            //Reasignacion de fechas convertidas
            datos[i] =convertido;

        }
    }

    public void escribirFechas(String ruta){
        File file = new File(ruta);
        
        try {
            FileWriter fw= new FileWriter(file,false);
            for (int i = 0; i < datos.length; i++) {
                fw.write(datos[i]+"\n");
            }
            fw.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
