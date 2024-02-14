package com;

import java.util.Arrays;

public class SmartTv extends Television{
	Display display;
	String[] apps1 = {"Netflix", "Youtube", "Prime Video"};
	String[] apps2 = {"Netflix", "Youtube", "Prime Video", "Spotify", "Apple TV","Paramount+"};
	String[] apps3 = {"Netflix", "Youtube", "Prime Video", "Spotify", "Apple TV", "Paramount+", "AndroidTV", "Disney+"};
//	Aplicaciones apps[];
	public SmartTv(){
		
	}
 public SmartTv(String bocinas, double tamaño, String marca, Display display, String[] apps1, String[] apps2,
		String[] apps3) {
	super(bocinas, tamaño, marca);
	this.display = display;
	this.apps1 = apps1;
	this.apps2 = apps2;
	this.apps3 = apps3;
 }
 public Display getDisplay() {
	return display;
 }
 public void setDisplay(Display display) {
	this.display = display;
 }
 public String[] getApps1() {
	return apps1;
 }
 public void setApps1(String[] apps1) {
	this.apps1 = apps1;
 }
 public String[] getApps2() {
	return apps2;
 }
 public void setApps2(String[] apps2) {
	this.apps2 = apps2;
 }
 public String[] getApps3() {
	return apps3;
 }
 public void setApps3(String[] apps3) {
	this.apps3 = apps3;
 }
 @Override
 public String toString() {
	return "SmartTv [display=" + display + ", apps1=" + Arrays.deepToString(apps1) + ", apps2=" + Arrays.deepToString(apps2)
			+ ", apps3=" + Arrays.deepToString(apps3) + "]";
}
	
	 
	
	

	/*public void seleccionarApp(){
		
	Scanner sc = new Scanner(System.in);	
	int a = sc.nextInt();
	
	switch(a) {
	case 1:
		System.out.println(Arrays.deepToString(apps1));
	case 2:
		System.out.println(Arrays.deepToString(apps2));
	case 3:
		System.out.println(Arrays.deepToString(apps3));
	}
		
}*/
}
	
