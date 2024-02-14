package com;

public class Principal {
	
	public static void main(String[] args) {
		MedidorElectrico m1 = new MedidorElectrico();
		MedidorElectrico m2 = new MedidorElectrico("VD652R","VL28",852.3,7001254);
		
		Radio r1 = new Radio(903.5,"WISUN",20);
		
		MedidorDigital d1 = new MedidorDigital();
		MedidorDigital d2 = new MedidorDigital("K811L6","F12J",223.8,900125544,5,120.56,3.2,"Intento alteracion",r1);
		

		
		System.out.println(m1);
		System.out.println(m2);


		System.out.println(m2.mostrarEnergia());
		
		System.out.println(d1);
		System.out.println(d2);
		

		System.out.println(d2.mostrarEnergia());
		System.out.println(d2.mostrarAlarma());
		
		
		
	}

}
