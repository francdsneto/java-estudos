package com.neto.javaintermediario.elementos.escopovariaveis;

public class EscopoVariavel {
    
    private Integer valor;

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public int calculaValor(Integer valor) {

        valor = valor + 10;

        return valor;

    }

}
