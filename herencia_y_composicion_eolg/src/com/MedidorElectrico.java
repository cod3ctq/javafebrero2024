package com;

public class MedidorElectrico {
	
	String numeroMedidor;
	String codigoMediror;
	double energia;
	int usuario;
	
	public MedidorElectrico() {
		
	}

	public MedidorElectrico(String numeroMedidor, String codigoMediror, double energia, int usuario) {
		this.numeroMedidor = numeroMedidor;
		this.codigoMediror = codigoMediror;
		this.energia = energia;
		this.usuario = usuario;
	}

	public String getNumeroMedidor() {
		return numeroMedidor;
	}

	public void setNumeroMedidor(String numeroMedidor) {
		this.numeroMedidor = numeroMedidor;
	}

	public String getCodigoMediror() {
		return codigoMediror;
	}

	public void setCodigoMediror(String codigoMediror) {
		this.codigoMediror = codigoMediror;
	}

	public double getEnergia() {
		return energia;
	}

	public void setEnergia(double energia) {
		this.energia = energia;
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "MedidorElectrico [numeroMedidor=" + numeroMedidor + ", codigoMediror=" + codigoMediror + ", energia="
				+ energia + ", usuario=" + usuario + "]";
	}
	
	public String mostrarEnergia() {
		return "La energia consumida por el usuario "+usuario+" es de: "+energia;
	}
	
	

}
