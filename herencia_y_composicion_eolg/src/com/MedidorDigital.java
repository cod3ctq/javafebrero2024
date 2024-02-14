package com;

public class MedidorDigital extends MedidorElectrico {
	
	int apagones;
	double voltaje;
	double corriente;
	String alarma;
	Radio radio;
	
	public MedidorDigital() {
		
	}

	public MedidorDigital(String numeroMedidor, String codigoMediror, double energia, int usuario, int apagones,
		double voltaje, double corriente, String alarma, Radio radio) {
		super(numeroMedidor, codigoMediror, energia, usuario);
		this.apagones = apagones;
		this.voltaje = voltaje;
		this.corriente = corriente;
		this.alarma = alarma;
		this.radio = radio;
	}

	public int getApagones() {
		return apagones;
	}

	public void setApagones(int apagones) {
		this.apagones = apagones;
	}

	public double getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(double voltaje) {
		this.voltaje = voltaje;
	}

	public double getCorriente() {
		return corriente;
	}

	public void setCorriente(double corriente) {
		this.corriente = corriente;
	}

	public String getAlarma() {
		return alarma;
	}

	public void setAlarma(String alarma) {
		this.alarma = alarma;
	}

	public Radio getRadio() {
		return radio;
	}

	public void setRadio(Radio radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "MedidorDigital [apagones=" + apagones + ", voltaje=" + voltaje + ", corriente=" + corriente
				+ ", alarma=" + alarma + ", radio=" + radio + ", numeroMedidor=" + numeroMedidor + ", codigoMediror="
				+ codigoMediror + ", energia=" + energia + ", usuario=" + usuario + "]";
	}
	
	public String mostrarAlarma() {
		String anuncio;
		if (voltaje>127) {
			anuncio="Alto voltaje";
		}else if(voltaje<110) {

			anuncio="Bajo voltaje";
		}else {

			anuncio="Nivvel adecuado de voltaje";
		}
		return "Se tiene la alarma: "+alarma + anuncio ;
	}
	
}
