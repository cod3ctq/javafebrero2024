package com;

public class TecladoDetalles {
    String forma="";
    String Swithces="";
    String Color="";

    public TecladoDetalles(){

    }

    public TecladoDetalles(String forma, String swithces, String color) {
        this.forma = forma;
        Swithces = swithces;
        Color = color;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getSwithces() {
        return Swithces;
    }

    public void setSwithces(String swithces) {
        Swithces = swithces;
    }

    @Override
    public String toString() {
        return "TecladoDetalles [forma=" + forma + ", Swithces=" + Swithces + ", Color=" + Color + "]";
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    
}
