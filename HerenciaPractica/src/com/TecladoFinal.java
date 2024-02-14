package com;

public class TecladoFinal extends Teclado{
    int numTeclas;

    TecladoDetalles tecladoDetalles;
    public TecladoFinal (){
                    
    }

    public TecladoFinal(char tecla, String teclaPresionada, int numTeclas, TecladoDetalles tecladoDetalles) {
        super(tecla, teclaPresionada);
        this.numTeclas = numTeclas;
        this.tecladoDetalles = tecladoDetalles;
    }

    public int getNumTeclas() {
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    public TecladoDetalles getTecladoDetalles() {
        return tecladoDetalles;
    }

    public void setTecladoDetalles(TecladoDetalles tecladoDetalles) {
        this.tecladoDetalles = tecladoDetalles;
    }

    @Override
    public String toString() {
        return "TecladoFinal [numTeclas=" + numTeclas + ", tecladoDetalles=" + tecladoDetalles + ", numero de teclas="+numTeclas+ ", tecla presionada="+teclaPresionada+ "]";
    }


    
}
