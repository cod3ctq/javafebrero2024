package com;

public class Polarizado extends GafasSol {
	double nivel;
	Estilo estilo;
   public Polarizado() {
	
	   
}
public Polarizado(double nivel, Estilo estilo) {
	super();
	this.nivel = nivel;
    this.estilo = estilo;


}
@Override
public String toString() {
	return "Polarizado [nivel=" + nivel + ", estilo=" + estilo + "]";


}
public double getNivel() {
	return nivel;
}
public void setNivel(double nivel) {
	this.nivel = nivel;
}
public Estilo getEstilo() {
	return estilo;
}
public void setEstilo(Estilo estilo) {
	this.estilo = estilo;
}

}

