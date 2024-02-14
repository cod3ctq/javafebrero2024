package com;

import java.util.Arrays;
import java.util.Iterator;

public class Principal {
	public static void main(String[] args) {

		// metrices
		
//		int[][] matrizA = new int [5][5];
//		// imprime la matriz
//		
//		System.out.println(Arrays.deepToString(matrizA));
//		
//		//Agregar valor a la matriz
//		
//		matrizA[0][0]= 40;
//		matrizA[0][1]= 20;
//		matrizA[0][2]= 50;
//		matrizA[0][3]= 60;
//		matrizA[0][4]= 30;
//		
//		matrizA[0][0]= 43;
//		matrizA[1][1]= 25;
//		matrizA[1][2]= 56;
//		matrizA[1][3]= 62;
//		matrizA[1][4]= 36;
//		
//		System.out.println(Arrays.deepToString(matrizA));
//		
//		//Matriz Llena
//		
//		String[][] matrizB = {{"a","b","c","d"},{"1","2","3","4"},{"n","3","j","5"},{"5","x","6","h"}};
//		System.out.println(matrizB[1][3]);
//		for (int f =0; f< matrizB.length; f++) {
//			for(int c = 0; c < matrizB.length; c++) {
//				System.out.print(matrizB[f][c]);
//			}
//			System.out.println();
//		}
	
		//  ----------------------------------------
		
//		String[][] matrizA = {{"5","a","3","2"},{"6","3","h","c"},{"5","7","3","8"},{"f","2","z","7"}};
//		String[][] matrizB = {{"3","2","4","a"},{"4","5","3","1"},{"a","4","6","3"},{"s","4","1","6"}};
//		int [][] matrizC = new int [matrizA.length][matrizA[0].length];
//		int [][] matrizA1 = new int [matrizA.length][matrizA[0].length];
//		int [][] matrizB1 = new int [matrizB.length][matrizB[0].length];
//		//Suma de martices 
//		
//		for (int f = 0; f < matrizC.length; f++) {
//			for (int c = 0; c < matrizC.length; c++) {
//				for (int f1 = 0; f1 < matrizA.length; f1++) {
//					for (int c1 = 0; c1 < matrizA.length; c1++) { 
//						matrizA [f1][c1] = Integer.parseInt(matrizA1[matrizA.length][matrizA[0].length]);
//						for (int f2 = 0; f2 < matrizB.length; f2++) {
//							for (int c2 = 0; c2 < matrizB.length; c2++) {
//								matrizB [f2][c2] = Integer.parseInt(matrizB1[matrizA.length][matrizA[0].length]);
//		
//								System.out.print(matrizC[f][c]= (matrizA1[f1][c1] + matrizB1[f2][c2]));}
//			}
//			System.out.println();
//		}
//			}
//}
//}
		
		String texto = "Java desde Puebla 084589";
		String resultado = "";
		String caracter = "";
		String numeros= "1234567890";
		String [] letras = {"a","b","c","d","e","f","g","h","i",
							"j","k","l","m","n","ñ","o","p","q",
							"r","s","t","u","v","w","x","y","z"};
		
		for (int i = 0; i < texto.length(); i++ ) {
			caracter = Character.toString(texto.charAt(i)).toLowerCase();
			
			if(caracter.equals(" ")) {
				resultado = resultado + "-";
			}else if (numeros.indexOf(caracter)>=0) {
				resultado = resultado + (Integer.parseInt(caracter)+1);
			}else if(caracter.equals("z")) {
				resultado = resultado + "a";
			}else {//entonces son letras.....
				//Determino que letra es y su posicion...
				for(int j=0; j< letras.length; j++) {
					if(caracter.equals(letras[j])) {//
						//caracter en la posicion siguiente
						resultado = resultado + letras[j+1];
					}
				}		
			}	
		}
		System.out.println(resultado);
		
		
		
		
		
		
		
		
		
		
		
	}
	}