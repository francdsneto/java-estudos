package com.neto.javaintermediario.enumeradores.exemplo2;

public enum DiaSemanaEnumValor {
    
    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

    private int valor;

    private DiaSemanaEnumValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

}
