package com;

public class GafasSol {

String color;
String tintado;
double pulgadas;

public GafasSol() {
	
}

public GafasSol(String color, String tintado, double pulgadas) {
	super();
	this.color = color;
	this.tintado = tintado;
	this.pulgadas = pulgadas;
	
}

@Override
public String toString() {
	return "GafasSol [color=" + color + ", tintado=" + tintado + ", pulgadas=" + pulgadas + "]";


}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getTintado() {
	return tintado;
}

public void setTintado(String tintado) {
	this.tintado = tintado;
}

public double getPulgadas() {
	return pulgadas;
}

public void setPulgadas(double pulgadas) {
	this.pulgadas = pulgadas;
}
}
