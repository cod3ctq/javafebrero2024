package com;

public class Principal {
public static void main(String[] args) {
	

	GafasSol gs = new GafasSol();
  System.out.println(gs);
  
  GafasSol gs2 = new GafasSol( "negro", "medio", 2.4);
  System.out.println(gs2);
  
  Polarizado p = new Polarizado ();
  
  Estilo e1 = new Estilo ("Dior", "aviator");
   Polarizado pz = new Polarizado(0.5, e1);
  
}
}