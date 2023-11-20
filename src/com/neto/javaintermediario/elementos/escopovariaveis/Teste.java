package com.neto.javaintermediario.elementos.escopovariaveis;

public class Teste {
    
    public static void main(String[] args) {
        
        EscopoVariavel escopo = new EscopoVariavel();

        escopo.setValor(10);

        System.out.println(escopo.getValor());

        System.out.println(escopo.calculaValor(10));

        System.out.println(escopo.getValor());

    }

}
