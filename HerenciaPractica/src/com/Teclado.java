package com;

public class Teclado {
    char tecla;
    String teclaPresionada;

    public Teclado(){

    }

    public char getTecla() {
        return tecla;
    }

    public void setTecla(char tecla) {
        this.tecla = tecla;
    }

    public String getTeclaPresionada() {
        return teclaPresionada;
    }

    public void setTeclaPresionada(String teclaPresionada) {
        this.teclaPresionada = teclaPresionada;
    }

    @Override
    public String toString() {
        return "Teclado [tecla=" + tecla + ", teclaPresionada=" + teclaPresionada + "]";
    }

    public Teclado(char tecla, String teclaPresionada) {
        this.tecla = tecla;
        this.teclaPresionada = teclaPresionada;
    }
    
}
