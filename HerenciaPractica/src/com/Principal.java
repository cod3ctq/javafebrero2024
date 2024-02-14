package com;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         String forma="";
         String switches="";
         String color="";
         int teclas;
         System.out.println("Ingrese el tipo de teclado: ");
        forma= sc.nextLine();
         System.out.println("Ingrese el tipo de switches: ");
        switches= sc.nextLine();
         System.out.println("Ingrese el color: ");
         color= sc.nextLine();
         System.out.println("Ingrese el numero de teclas: ");
         teclas= sc.nextInt();
         System.out.println("Ingrese una letra: ");
         char s= sc.next().charAt(0);
        

        // Teclado t2= new Teclado(s,Character.toString(s));
        
        TecladoDetalles td= new TecladoDetalles(forma,switches,color);
        TecladoFinal teclado = new TecladoFinal(s, Character.toString(s), teclas, td );

        System.out.println(teclado);
        sc.close();


    }
}
